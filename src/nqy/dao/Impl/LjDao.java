package nqy.dao.Impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nqy.dao.IBaseDao;
import nqy.entity.Lj;
import nqy.util.JDBCHelper;

public class LjDao implements IBaseDao<Lj> {

	@Override
	public List<Lj> getData() {
		String sql = "select id,mc,wz,tp,dz from lj";
		List<Lj> list = null;
		try {
			list = JDBCHelper.query(sql, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Lj getDataById(int id) {
		String sql = "select id,mc,wz,tp,dz from lj where id = ?";
		List<Lj> list = null;
		try {
			list = JDBCHelper.query(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map map = (Map) list.get(0);
		Lj lj = new Lj();
		lj.setId((int) map.get("id"));
		lj.setMc((String) map.get("mc"));
		lj.setWz((String) map.get("wz"));
		lj.setTp((String) map.get("tp"));
		lj.setDz((String) map.get("dz"));
		return lj;
	}

	@Override
	public int insert(Lj t) {
		String sql = "insert into lj(mc,wz,tp,dz) values(?,?,?,?)";
		int result = 0;
		 try {
			result = JDBCHelper.nonQuery(sql, t.getMc(),t.getWz(),t.getTp(),t.getDz());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int update(Lj t) {
		String sql = "update lj set mc=?,wz=?,tp=?,dz=? where id = ?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getMc(),t.getWz(),t.getTp(),t.getDz(),t.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from lj where id = ?";
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
