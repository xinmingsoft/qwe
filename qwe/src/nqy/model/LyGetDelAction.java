package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LyDao;

public class LyGetDelAction implements IModel {

	private LyDao dao = null;
	public LyGetDelAction()
	{
		dao = new LyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		dao.delete(Integer.valueOf(id));
		return "Ly.do?ActionName=getAllAction";
	}

}
