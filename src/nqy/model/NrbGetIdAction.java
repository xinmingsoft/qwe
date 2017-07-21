package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.NrbDao;
import nqy.entity.Nrb;


public class NrbGetIdAction implements IModel {

	private NrbDao dao = null;
	public NrbGetIdAction()
	{
		dao = new NrbDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		Nrb nrb = dao.getDataById(Integer.valueOf(id));
		request.setAttribute("Nrblist", nrb);
		return "admin/nrbxiugai.jsp";
	}

}
