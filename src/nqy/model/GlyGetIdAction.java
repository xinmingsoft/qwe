package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.GlyDao;
import nqy.entity.Gly;

public class GlyGetIdAction implements IModel {

	private GlyDao dao = null;
	public GlyGetIdAction()
	{
		dao = new GlyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		Gly gly = dao.getDataById(Integer.valueOf(id));
		request.setAttribute("gly", gly);
		return "admin/xiugai.jsp";
	}

}
