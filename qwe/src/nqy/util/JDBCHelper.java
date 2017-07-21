package nqy.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//专门操作数据库的类
public class JDBCHelper {
	//连接对象
	private static Connection conn = null;
	//编译对象
	private static PreparedStatement prep = null;
	/**
	 * 用于查询多个结果的sql
	 * @param 要执行的查询sql
	 * @param 可变参数列表
	 * @return list
	 * @throws SQLException
	 */
	public static List query(String sql,Object...objects) throws SQLException
	{
		//调用工厂类方法得到连接对象
		conn = ConnctionFactory.getCon();
		//利用连接对象得到编译对象
		prep = conn.prepareStatement(sql);
		//如果参数列表不是空
		if(objects != null)
		{
			for(int i = 0;i < objects.length;i++)
			{
				//为占位变量赋值       第几个问号   数组的第几个元素
				prep.setObject(i+1, objects[i]);
			}
		}
		//得到结果集
		ResultSet rs = null; 
		rs = prep.executeQuery();
		//创建一个对象数组
		List list = new ArrayList();
		//循环结果集
		while(rs.next())
		{
			//创建HashMap 对象
			Map map = new HashMap();
			//得到列的信息    列也就是头
			ResultSetMetaData rsm = rs.getMetaData();
			for(int i = 0;i < rsm.getColumnCount();i++)
			{
				//添加键值对
				map.put(rsm.getColumnLabel(i+1), rs.getObject(i+1));
			}
			list.add(map);
		}
		// 关闭结果集对象   关闭编译对象  关闭连接对象
		ConnctionFactory.destroy(conn, prep, rs);
		return list;
		
	}
	/**
	 * 用于执行得到一个结果的sql语句
	 * @param 要执行的查询sql
	 * @param 可变参数列表
	 * @return 一个object类型的值
	 * @throws SQLException
	 */
	
	public static Object querySingle(String sql, Object...objects) throws SQLException
	{
		//调用工厂类方法得到连接对象
		conn = ConnctionFactory.getCon();
		//得到编译对象
		prep = conn.prepareStatement(sql);
		//如果参数列表不为空
		if(objects != null)
		{
			for(int i = 0;i < objects.length;i++)
			{
				//为占位变量赋值
				prep.setObject(i+1, objects[i]);
			}
		}
		//用executeQuery 得到结果集 专门用于查询的
		ResultSet rs = null; 
		rs = prep.executeQuery();
		//设一个变量
		Object obj = null;
		//如果结果集里有下一个
		if(rs.next())
		{
			//得到一个Object类型
			obj = rs.getObject(1);
		}
		//关闭各种对象
		ConnctionFactory.destroy(conn, prep, rs);
		//返回一个Object类型
		return obj;
	}
	
	/**
	 * 用于增删改的sql 语句
	 * @param 要执行的查询sql
	 * @param 可变参数列表
	 * @return 受影响的行数
	 * @throws SQLException
	 */
	public static int nonQuery(String sql, Object...objects) throws SQLException
	{
		//调用工厂类的方法得到连接对象
		conn = ConnctionFactory.getCon();
		//得到编译对象
		prep = conn.prepareStatement(sql);
		//如果可变参数不为空
		if(objects != null)
		{
			for(int i = 0;i < objects.length;i++)
			{
				//为占位变量赋值
				prep.setObject(i+1, objects[i]);
			}
		}
		//executeUpdate 专门用于增删查改的
		int result = prep.executeUpdate();
		//关闭各种对象
		ConnctionFactory.destroy(conn, prep, null);
		//返回一个受影响的行数
		return result;
	}
	
	
	
	
}
