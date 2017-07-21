package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.ZtbDao;
import nqy.entity.Ztb;

public class ZtbGetUpdAction implements IModel {

	private ZtbDao dao = null; 
	public ZtbGetUpdAction()
	{
		dao = new ZtbDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String fz = request.getParameter("fz");
		String bt = request.getParameter("bt");
		String tp = request.getParameter("tp");
		String jj = request.getParameter("jj");
		String tzfs =  request.getParameter("tzfs");
		String dyym =  request.getParameter("dyym");
		String bz = request.getParameter("bz");
		
		Ztb ztb = new Ztb();
		ztb.setId(Integer.valueOf(id));
		ztb.setFz(Integer.valueOf(fz));
		ztb.setBt(bt);
		ztb.setTp(tp);
		ztb.setJj(jj);
		ztb.setTzfs(tzfs);
		ztb.setDyym(dyym);
		ztb.setBz(bz);
		dao.update(ztb);
		return "Ztb.do?ActionName=getAllAction";
		
	}

}
