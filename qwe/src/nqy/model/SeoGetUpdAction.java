package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.SeoDao;
import nqy.entity.Seo;

public class SeoGetUpdAction implements IModel {

	private SeoDao dao = null;
	public SeoGetUpdAction()
	{
		dao = new SeoDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String lmh = request.getParameter("lmh");
		String bt = request.getParameter("bt");
		String gjz = request.getParameter("gjz");
		String sm = request.getParameter("sm");
		String sj = request.getParameter("sj");
		Seo seo = new Seo();
		seo.setId(Integer.valueOf(id));
		seo.setLmh(Integer.valueOf(lmh));
		seo.setBt(bt);
		seo.setGjz(gjz);
		seo.setSm(sm);
		seo.setSj(sj);
		dao.update(seo);
		return "Seo.do?ActionName=getAllAction";
	}

}
