package nqy.dao.Impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nqy.dao.IBaseDao;
import nqy.entity.Ly;
import nqy.util.JDBCHelper;

public class LyDao implements IBaseDao<Ly> {

	@Override
	public List<Ly> getData() {
		String sql = "select id,flh,mz,ywm,xb,yj,dh,lynr,lsj,hfnr,hsj,sfhf from ly;";
		List list = null;
		try {
			list = JDBCHelper.query(sql, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Ly getDataById(int id) {
		String sql = "select id,flh,mz,ywm,xb,yj,dh,lynr,lsj,hfnr,hsj,sfhf from ly where id = ?";
		List<Ly> list = null;
		try {
			list = JDBCHelper.query(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map map = (Map) list.get(0);
		Ly ly = new Ly();
		ly.setId((int) map.get("id"));
		ly.setFlh((int) map.get("flh"));
		ly.setMz((String) map.get("mz"));
		ly.setYwm((String) map.get("ywn"));
		ly.setXb((String) map.get("xb"));
		ly.setYj((String) map.get("yj"));
		ly.setDh((String) map.get("dh"));
		ly.setLynr((String) map.get("lynr"));
		ly.setLsj((String) map.get("lsj"));
		ly.setHfnr((String) map.get("hfnr"));
		ly.setHsj((String) map.get("hsj"));
		ly.setSfhf((int) map.get("sfhf"));
		
		return ly;
	}

	@Override
	public int insert(Ly t) {
		String sql = "insert into ly(flh,mz,ywm,xb,yj,dh,lynr,lsj,hfnr,hsj,sfhf) values(?,?,?,?,?,?,?,?,?,?,?)";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getFlh(),t.getMz(),t.getYwm(),t.getXb(),t.getYj(),t.getDh(),t.getLynr(),t.getLsj(),t.getHfnr(),t.getHsj(),t.getSfhf());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(Ly t) {
		String sql = "update ly set flh=?,mz=?,ywm=?,xb=?,yj=?,dh=?,lynr=?,lsj=?,hfnr=?,hsj=?,sfhf=? where id = ?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getFlh(),t.getMz(),t.getYwm(),t.getXb(),t.getYj(),t.getDh(),t.getLynr(),t.getLsj(),t.getHfnr(),t.getHsj(),t.getSfhf(),t.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from ly where id = ?";
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
