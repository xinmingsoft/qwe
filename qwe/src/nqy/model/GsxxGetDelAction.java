package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.GsxxDao;



public class GsxxGetDelAction implements IModel {

	private GsxxDao dao = null;
	public GsxxGetDelAction()
	{
		dao = new GsxxDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		dao.delete(Integer.valueOf(id));
		return "Gsxx.do?ActionName=getAllAction";
	}

}
