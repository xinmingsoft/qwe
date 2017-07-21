package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LmbDao;
import nqy.entity.Lmb;


public class LmbGetIdAction implements IModel {

	private LmbDao dao = null;
	public LmbGetIdAction()
	{
		dao = new LmbDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		Lmb lmb = dao.getDataById(Integer.valueOf(id));
		request.setAttribute("lmbList", lmb);
		return "admin/lmbxiugai.jsp";
	}

}
