package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.GsxxDao;
import nqy.entity.Gsxx;

public class GsxxGetAddAction implements IModel {

	private GsxxDao dao = null;
	public GsxxGetAddAction()
	{
		dao = new GsxxDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String mc = request.getParameter("mc");
		String zz = request.getParameter("zz");
		String dh = request.getParameter("dh");
		String cz = request.getParameter("cz");
		String sj = request.getParameter("sj");
		String yj = request.getParameter("yj");
		String wz = request.getParameter("wz");
		String qq = request.getParameter("qq");
		String wx = request.getParameter("wx");
		String dz = request.getParameter("dz");
		String jj = request.getParameter("jj");
		String xx = request.getParameter("xx");
		String gm = request.getParameter("gm");
		String bz = request.getParameter("bz");
		Gsxx gsxx = new Gsxx();
		gsxx.setMc(mc);
		gsxx.setZz(zz);
		gsxx.setDh(dh);
		gsxx.setCz(cz);
		gsxx.setSj(sj);
		gsxx.setYj(yj);
		gsxx.setWz(wz);
		gsxx.setQq(qq);
		gsxx.setWx(wx);
		gsxx.setDz(dz);
		gsxx.setJj(jj);
		gsxx.setXx(xx);
		gsxx.setGm(gm);
		gsxx.setBz(bz);
		dao.insert(gsxx);
		return "Gsxx.do?ActionName=getAllAction";
	}

}
