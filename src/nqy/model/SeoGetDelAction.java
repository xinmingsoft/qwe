package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.SeoDao;

public class SeoGetDelAction implements IModel{

	private SeoDao dao = null;
	public SeoGetDelAction()
	{
		dao = new SeoDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		dao.delete(Integer.valueOf(id));
		return "Ztb.do?ActionName=getAllAction";
	}

}
