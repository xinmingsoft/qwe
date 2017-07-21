package nqy.dao.Impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nqy.dao.IBaseDao;
import nqy.entity.Gsxx;
import nqy.util.JDBCHelper;

public class GsxxDao implements IBaseDao<Gsxx> {

	@Override
	public List<Gsxx> getData() {
		String sql = "select id,mc,zz,dh,cz,sj,yj,wz,qq,wx,dz,jj,xx,gm,bz from gsxx";
		List<Gsxx> list = null;
		try {
			list = JDBCHelper.query(sql, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Gsxx getDataById(int id) {
		String sql = "select id,mc,zz,dh,cz,sj,yj,wz,qq,wx,dz,jj,xx,gm,bz from gsxx where id=?";
		List<Gsxx> list = null;
		try {
			list = JDBCHelper.query(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map map = (Map) list.get(0);
		Gsxx gsxx = new Gsxx();
		gsxx.setId((int)map.get("id"));
		gsxx.setMc((String) map.get("mc"));
		gsxx.setZz((String) map.get("zz"));
		gsxx.setSj((String) map.get("sj"));
		gsxx.setYj((String) map.get("yj"));
		gsxx.setWz((String) map.get("wz"));
		gsxx.setQq((String) map.get("qq"));
		gsxx.setWx((String) map.get("wx"));
		gsxx.setDz((String) map.get("dz"));
		gsxx.setJj((String) map.get("jj"));
		gsxx.setXx((String) map.get("xx"));
		gsxx.setGm((String) map.get("gm"));
		gsxx.setBz((String) map.get("bz"));
		
		
		return gsxx;
	}

	@Override
	public int insert(Gsxx t) {
		
		String sql = "insert into gsxx(mc,zz,dh,cz,sj,yj,wz,qq,wx,dz,jj,xx,gm,bz) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getMc(),t.getZz(),t.getDh(),t.getCz(),t.getSj(),t.getYj(),t.getWz(),t.getQq(),t.getWx(),t.getDz(),t.getJj(),t.getXx(),t.getGm(),t.getBz());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int update(Gsxx t) {

		String sql = "update gsxx set mc=?,zz=?,dh=?,cz=?,sj=?,yj=?,wz=?,qq=?,wx=?,dz=?,jj=?,xx=?,gm=?,bz=? where id=?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getMc(),t.getZz(),t.getDh(),t.getCz(),t.getSj(),t.getYj(),t.getWz(),t.getQq(),t.getWx(),t.getDz(),t.getJj(),t.getXx(),t.getGm(),t.getBz(),t.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from gsxx where id=?";
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
