package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LmbDao;

public class LmbGetDelAction implements IModel {

	private LmbDao dao = null;
	public LmbGetDelAction()
	{
		dao =  new LmbDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		dao.delete(Integer.valueOf(id));
		return "Lmb.do?ActionName=getAllAction";
	}

}
