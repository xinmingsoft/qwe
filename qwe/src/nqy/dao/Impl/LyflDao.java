package nqy.dao.Impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nqy.dao.IBaseDao;
import nqy.entity.Lyfl;
import nqy.util.JDBCHelper;

public class LyflDao implements IBaseDao<Lyfl>{

	public LyflDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Lyfl> getData() {
		String sql = "select id,bt,tp,tzfs,dyym,bz from lyfl";
		List <Lyfl> list = null;
		try {
			list = JDBCHelper.query(sql, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Lyfl getDataById(int id) {
		String sql = "select id,bt,tp,tzfs,dyym,bz from lyfl where id = ?";
		List<Lyfl> list = null;
		try {
			list = JDBCHelper.query(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map map = (Map) list.get(0);
		Lyfl lyfl = new Lyfl();
		lyfl.setId((int) map.get("id"));
		lyfl.setBt((String) map.get("bt"));
		lyfl.setTp((String)map.get("tp"));
		lyfl.setTzfs((String)map.get("tzfs"));
		lyfl.setDyym((String)map.get("dyym"));
		lyfl.setBz((String)map.get("bz"));
		return lyfl;
	}

	@Override
	public int insert(Lyfl t) {
		String sql = "insert into lyfl(bt,tp,tzfs,dyym,bz) values(?,?,?,?,?)";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getBt(),t.getTp(),t.getTzfs(),t.getDyym(),t.getBz());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(Lyfl t) {
		String sql = "update lyfl set bt=?,tp=?,tzfs=?,dyym=?,bz=? where id = ?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getBt(),t.getTp(),t.getTzfs(),t.getDyym(),t.getBz(),t.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from lyfl where id = ?";
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
