package nqy.dao.Impl;
//这个类，需要写sql + 要传递的参数
//sql不能直接写，必须在数据库中执行过。才能拿到你的java代码里。

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nqy.dao.IBaseDao;
import nqy.entity.Lmb;
import nqy.util.JDBCHelper;

public class LmbDao implements IBaseDao<Lmb>{

	@Override
	public List<Lmb> getData() {
		String sql = "select id,jb,bt,tp,jj,tzfs,dyym,bz from lmb;";
		List<Lmb> list = null;
		try {
			 list = JDBCHelper.query(sql, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Lmb getDataById(int id) {
		String sql = "select id,jb,bt,tp,jj,tzfs,dyym,bz from lmb where id = ?";
		List<Lmb> list = null;
		 try {
			list = JDBCHelper.query(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Map map = (Map)list.get(0);
		 Lmb lmb = new Lmb();
		 lmb.setId((int)map.get("id"));
		 lmb.setJb((int)map.get("jb"));
		 lmb.setBt((String)map.get("bt"));
		 lmb.setTp((String)map.get("tp"));
		 lmb.setJj((String)map.get("jj"));
		 lmb.setTzfs((String)map.get("tzfs"));
		 lmb.setDyym((String)map.get("dyym"));
		 lmb.setBz((String)map.get("bz"));
		 return lmb;
		 
	}

	@Override
	public int insert(Lmb t) {
		String sql = "insert into lmb(jb,bt,tp,jj,tzfs,dyym,bz) values(?,?,?,?,?,?,?);";
		int result = 0;
		try {
			 result = JDBCHelper.nonQuery(sql, t.getJb(),t.getBt(),t.getTp(),t.getJj(),t.getTzfs(),t.getDyym(),t.getBz());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(Lmb t) {

		String sql = "update lmb set jb=?,bt=?,tp=?,jj=?,tzfs=?,dyym=?,bz=? where id = ?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getJb(),t.getBt(),t.getTp(),t.getJj(),t.getTzfs(),t.getDyym(),t.getBz(),t.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from lmb where id = ?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	
}
