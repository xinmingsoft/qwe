package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LyflDao;
import nqy.entity.Lyfl;

public class LyflGetUpdAction implements IModel {

	private LyflDao dao = null;
	public LyflGetUpdAction()
	{
		dao = new LyflDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String bt = request.getParameter("bt");
		String tp = request.getParameter("tp");
		String tzfs = request.getParameter("tzfs");
		String dyym = request.getParameter("dyym");
		String bz = request.getParameter("bz");
		Lyfl lyfl = new Lyfl();
		lyfl.setId(Integer.valueOf(id));
		lyfl.setBt(bt);
		lyfl.setTp(tp);
		lyfl.setTzfs(tzfs);
		lyfl.setDyym(dyym);
		lyfl.setBz(bz);
		dao.update(lyfl);
		return "Lyfl.do?ActionName=getAllAction";
	}

}
