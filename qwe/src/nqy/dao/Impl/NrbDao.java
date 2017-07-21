package nqy.dao.Impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nqy.dao.IBaseDao;
import nqy.entity.Nrb;
import nqy.util.JDBCHelper;

public class NrbDao implements IBaseDao<Nrb> {

	@Override
	public List<Nrb> getData() {
		String sql = "select id,lmh,zth,bt,fbt,dt,xt,jj,nr,zz,fsj,gsj,tzfs,dyym from nrb";
		List<Nrb> list = null;
		try {
			list = JDBCHelper.query(sql, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public Nrb getDataById(int id) {
		String sql = "select id,lmh,zth,bt,fbt,dt,xt,jj,nr,zz,fsj,gsj,tzfs,dyym from nrb where id = ?";
		List<Nrb> list = null;
		try {
			list = JDBCHelper.query(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map map = (Map)list.get(0);
		Nrb nrb = new Nrb();
		nrb.setId((int)map.get("id"));
		nrb.setLmh((int)map.get("lmh"));
		nrb.setZth((int)map.get("zth"));
		nrb.setBt((String)map.get("bt"));
		nrb.setFbt((String)map.get("fbt"));
		nrb.setDt((String)map.get("dt"));
		nrb.setXt((String)map.get("xt"));
		nrb.setJj((String)map.get("jj"));
		nrb.setNr((String)map.get("nr"));
		nrb.setZz((String)map.get("zz"));
		nrb.setFsj((String)map.get("fsj"));
		nrb.setGsj((String)map.get("gsj"));
		nrb.setTzfs((String)map.get("tzfs"));
		nrb.setDyym((String)map.get("dyym"));
		
		return nrb;
	}

	@Override
	public int insert(Nrb t) {
		String sql = "insert into nrb(lmh,zth,bt,fbt,dt,xt,jj,nr,zz,fsj,gsj,tzfs,dyym) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql,t.getLmh(),t.getZth(),t.getBt(),t.getFbt(),t.getDt(),t.getXt(),t.getJj(),t.getNr(),t.getZz(),t.getFsj(),t.getGsj(),t.getTzfs(),t.getDyym());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int update(Nrb t) {
		String sql = "update nrb set lmh=?,zth=?,bt=?,fbt=?,dt=?,xt=?,jj=?,nr=?,zz=?,fsj=?,gsj=?,tzfs=?,dyym=? where id = ?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql,t.getLmh(),t.getZth(),t.getBt(),t.getFbt(),t.getDt(),t.getXt(),t.getJj(),t.getNr(),t.getZz(),t.getFsj(),t.getGsj(),t.getTzfs(),t.getDyym(),t.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from nrb where id = ?";
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


