package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LyDao;
import nqy.entity.Ly;

public class LyGetIdAction implements IModel {

	private LyDao dao = null;
	public LyGetIdAction()
	{
		dao = new LyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		Ly ly = dao.getDataById(Integer.valueOf(id));
		request.setAttribute("list", ly);
		return "admin/lyxiugai.jsp";
	}

}
