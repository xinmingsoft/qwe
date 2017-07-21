package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.GsxxDao;
import nqy.entity.Gsxx;

public class GsxxGetIdAction implements IModel {

	private GsxxDao dao = null;
	public GsxxGetIdAction()
	{
		dao = new GsxxDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		Gsxx gsxx = dao.getDataById(Integer.valueOf(id));
		request.setAttribute("list", gsxx);
		return "admin/gsxxxiugai.jsp";
	}

}
