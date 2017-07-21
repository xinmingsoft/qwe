package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LjDao;

public class LjGetDelAction implements IModel {

	private LjDao dao = null;
	public LjGetDelAction()
	{
		dao = new LjDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		dao.delete(Integer.valueOf(id));
		return "Lj.do?ActionName=getAllAction";
	}

}
