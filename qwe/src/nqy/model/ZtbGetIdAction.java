package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.ZtbDao;
import nqy.entity.Ztb;


public class ZtbGetIdAction implements IModel {

	private ZtbDao dao = null;
	public ZtbGetIdAction()
	{
		dao = new ZtbDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		Ztb ztb = dao.getDataById(Integer.valueOf(id));
		request.setAttribute("Ztblist", ztb);
		return "admin/ztbxiugai.jsp";
	}

}
