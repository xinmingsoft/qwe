package nqy.dao.Impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nqy.dao.IBaseDao;
import nqy.entity.Ztb;
import nqy.util.JDBCHelper;

//这个类，需要写sql + 要传递的参数

public class ZtbDao implements IBaseDao<Ztb> {

	@Override
	public List<Ztb> getData() {
		String sql = "select id,fz,bt,tp,jj,tzfs,dyym,bz from ztb;";
		List<Ztb> list = null;
		try {
			 list = JDBCHelper.query(sql, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Ztb getDataById(int id) {
		String sql = "select id,fz,bt,tp,jj,tzfs,dyym,bz from ztb where id = ?";
		List<Ztb> list = null;
		try {
			list = JDBCHelper.query(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map map = (Map)list.get(0);
		Ztb ztb = new Ztb();
		ztb.setId((int)map.get("id"));
		ztb.setFz((int)map.get("fz"));
		ztb.setBt((String)map.get("bt"));
		ztb.setTp((String)map.get("tp"));
		ztb.setJj((String)map.get("jj"));
		ztb.setTzfs((String)map.get("tzfs"));
		ztb.setDyym((String)map.get("dyym"));
		ztb.setBz((String)map.get("bz"));
		
		return ztb;
	}

	@Override
	public int insert(Ztb t) {
		String sql = "insert into ztb(fz,bt,tp,jj,tzfs,dyym,bz) values(?,?,?,?,?,?,?)";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getFz(),t.getBt(),t.getTp(),t.getJj(),t.getTzfs(),t.getDyym(),t.getBz());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(Ztb t) {
		String sql = "update ztb set fz=?,bt=?,tp=?,jj=?,tzfs=?,dyym=?,bz=? where id = ?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getFz(),t.getBt(),t.getTp(),t.getJj(),t.getTzfs(),t.getDyym(),t.getBz(),t.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from ztb where id = ?";
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
