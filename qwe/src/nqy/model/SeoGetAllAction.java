package nqy.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.SeoDao;
import nqy.entity.Seo;

public class SeoGetAllAction implements IModel {

	private SeoDao dao = null;
	public SeoGetAllAction()
	{
		dao = new SeoDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Seo> list = dao.getData();
		request.setAttribute("Seolist", list);
		return "admin/seoshow.jsp";
	}

}
