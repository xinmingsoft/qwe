package nqy.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
//连接数据库的类
public class ConnctionFactory {
	
	private static String driver;
	private static String url;
	private static String usr;
	private static String pwd;
	//优先加载
	static {
		//创建Properties 的对象
		Properties prop = new Properties();
		try {
			//用对象连接jdbc.properties
			prop.load(ConnctionFactory.class.getClassLoader().getResourceAsStream("jdbc.properties"));
			//jdbc.properties里的东西 这四个属性可以用了
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			usr = prop.getProperty("username");
			pwd = prop.getProperty("password");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//得到一个链接对象
	public static Connection getCon()
	{
		//定义到try外面
		Connection conn = null;
		//如果连接对象是空
		if(conn == null)
		{
			try {
				//连接数据库  加载驱动
				Class.forName(driver);
				try {
					//得到连接对象
					conn = DriverManager.getConnection(url,usr,pwd);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		//返回连接对象
		return conn;
		
	}
	//关闭连接 从下往上关
	public static void destroy(Connection con,PreparedStatement prep,ResultSet rs)
	{
		//关闭结果集对象
		if(rs != null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//关闭编译对象
		if(prep != null)
		{
			try {
				prep.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//关闭连接对象
		if(con != null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		//调用方法 得到连接对象
		Connection con = ConnctionFactory.getCon();
		//输出
		System.out.println(con);
	}


}
