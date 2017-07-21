package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LjDao;
import nqy.entity.Lj;

public class LjGetIdAction implements IModel {

	private LjDao dao = null;
	public LjGetIdAction()
	{
		dao = new LjDao(); 
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		Lj lj = dao.getDataById(Integer.valueOf(id));
		request.setAttribute("Lj", lj);
		return "admin/ljxiugai.jsp";
		
	}

}
