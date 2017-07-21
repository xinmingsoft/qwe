package nqy.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.GsxxDao;

public class GsxxGetAllAction implements IModel {

	private GsxxDao dao = null;
	public GsxxGetAllAction()
	{
		dao = new GsxxDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List list = dao.getData();
		request.setAttribute("List", list);
		return "admin/gsxxshow.jsp";
	}

}
