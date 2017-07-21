package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.NrbDao;
import nqy.entity.Nrb;

public class NrbGetAddAction implements IModel {

	private NrbDao dao = null;
	public NrbGetAddAction()
	{
		dao = new NrbDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String lmh = request.getParameter("lmh");
		String zth = request.getParameter("zth");
		String bt = request.getParameter("bt");
		String fbt = request.getParameter("fbt");
		String dt = request.getParameter("dt");
		String xt = request.getParameter("xt");
		String jj = request.getParameter("jj");
		String nr = request.getParameter("nr");
		String zz = request.getParameter("zz");
		String fsj = request.getParameter("fsj");
		String gsj = request.getParameter("gsj");
		String tzfs = request.getParameter("tzfs");
		String dyym = request.getParameter("dyym");
		
		Nrb nrb = new Nrb();
		nrb.setId(Integer.valueOf(id));
		nrb.setLmh(Integer.valueOf(lmh));
		nrb.setZth(Integer.valueOf(zth));
		nrb.setBt(bt);
		nrb.setFbt(fbt);
		nrb.setDt(dt);
		nrb.setXt(xt);
		nrb.setJj(jj);
		nrb.setNr(nr);
		nrb.setZz(zz);
		nrb.setFsj(fsj);
		nrb.setGsj(gsj);
		nrb.setTzfs(tzfs);
		nrb.setDyym(dyym);
		dao.insert(nrb);
		return "Nrb.do?ActionName=getAllAction";
	}

}
