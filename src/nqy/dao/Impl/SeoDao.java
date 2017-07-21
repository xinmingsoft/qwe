package nqy.dao.Impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import nqy.dao.IBaseDao;
import nqy.entity.Seo;
import nqy.util.JDBCHelper;

public class SeoDao implements IBaseDao<Seo> {

	@Override
	public List<Seo> getData() {
		String sql = "select id,lmh,bt,gjz,sm,sj from seo";
		List<Seo> list = null;
		try {
			list = JDBCHelper.query(sql, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Seo getDataById(int id) {
		String sql = "select id,lmh,bt,gjz,sm,sj from seo where id = ?";
		List<Seo> list = null;
		try {
			list = JDBCHelper.query(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map map = (Map)list.get(0);
		Seo seo = new Seo();
		seo.setId((int)map.get("id"));
		seo.setLmh((int)map.get("lmh"));
		seo.setBt((String)map.get("bt"));
		seo.setGjz((String)map.get("gjz"));
		seo.setSm((String)map.get("sm"));
		seo.setSj((String)map.get("sj"));
		
		return seo;
	}

	@Override
	public int insert(Seo t) {
		String sql = "insert into seo(lmh,bt,gjz,sm,sj) values(?,?,?,?,?)";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql, t.getLmh(),t.getBt(),t.getGjz(),t.getSm(),t.getSj());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(Seo t) {
		String sql = "update seo set lmh=?,bt=?,gjz=?,sm=?,sj=? where id = ?";
		int result = 0;
		try {
			result = JDBCHelper.nonQuery(sql,t.getLmh(),t.getBt(),t.getGjz(),t.getSm(),t.getSj(),t.getId() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from seo where id = ?";
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
