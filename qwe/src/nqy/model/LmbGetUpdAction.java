package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LmbDao;
import nqy.entity.Lmb;

public class LmbGetUpdAction implements IModel {

	private LmbDao dao = null;
	public LmbGetUpdAction()
	{
		dao = new LmbDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String jb = request.getParameter("jb");
		String bt = request.getParameter("bt");
		String tp = request.getParameter("tp");
		String jj = request.getParameter("jj");
		String tzfs = request.getParameter("tzfs");
		String dyym = request.getParameter("dyym");
		String bz = request.getParameter("bz");
		
		Lmb lmb = new Lmb();
		lmb.setId(Integer.valueOf(id));
		lmb.setJb(Integer.valueOf(jb));
		lmb.setBt(bt);
		lmb.setTp(tp);
		lmb.setJj(jj);
		lmb.setTzfs(tzfs);
		lmb.setDyym(dyym);
		lmb.setBz(bz);
		dao.update(lmb);
		return "Lmb.do?ActionName=getAllAction";
	}

}
