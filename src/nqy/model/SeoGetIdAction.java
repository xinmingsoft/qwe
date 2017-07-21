package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.SeoDao;
import nqy.entity.Seo;

public class SeoGetIdAction implements IModel {

	private SeoDao dao = null;
	public SeoGetIdAction()
	{
		dao = new SeoDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		Seo seo = dao.getDataById(Integer.valueOf(id));
		request.setAttribute("list", seo);
		return "admin/seoxiugai.jsp";
	}

}
