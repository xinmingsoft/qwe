package nqy.dao.Impl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nqy.dao.IBaseDao;
import nqy.entity.Gly;
import nqy.util.JDBCHelper;
//这个类，需要写sql + 要传递的参数
//sql不能直接写，必须在数据库中执行过。才能拿到你的java代码里。

public class GlyDao implements IBaseDao<Gly>{

	private static final int Gly = 0;
	@Override
	public List<Gly> getData() {
		String sql = "select id,yhm,mm,jb from gly;";
		List<Gly> list = null;
		try {
			list = JDBCHelper.query(sql, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Gly getDataById(int id) {
		String sql = "select id,yhm,mm,jb from gly where id = ?";
		//因为结果只有一个对象  
		List<Gly> list = null;
		try {
			list = JDBCHelper.query(sql, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Map map = (Map)list.get(0);
		Gly gly = new Gly();
		gly.setId((int)map.get("id"));
		gly.setYhm((String)map.get("yhm"));
		gly.setMm((String)map.get("mm"));
		gly.setJb((int)map.get("jb"));
		return gly;
	}

	@Override
	public int insert(Gly t) {
		String sql = "insert into gly(yhm,mm,jb) values (?,?,?);";
		int result = 0;
		try {
			 result = JDBCHelper.nonQuery(sql, t.getYhm(),t.getMm(),t.getJb());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int update(Gly t) {
		String sql = "update gly set yhm= ?,mm = ?,jb = ? where id = ?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql,t.getYhm(),t.getMm(),t.getJb(),t.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from gly where id = ?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Gly> getLike(Gly t)
	{
		String sql = "select id,yhm,mm,jb from gly where yhm like ? and jb like ?";
		List<Gly> list = null;
		try {
			list = JDBCHelper.query(sql, "%"+t.getYhm()+"%","%"+t.getJb()+"%");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public int getDl(Gly t)
	{
 		String sql = "select count(1) from gly where yhm=? and mm=?";
		Object a = null;
		try {
			a = JDBCHelper.querySingle(sql, t.getYhm(),t.getMm());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		int b = Integer.parseInt(a.toString());
		
		return b;
		
	}
	
	
	


	
}
