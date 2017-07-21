package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LyflDao;

public class LyflGetDelAction implements IModel {

	private LyflDao dao = null;
	public LyflGetDelAction()
	{
		dao = new LyflDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		dao.delete(Integer.valueOf(id));
		return "Lyfl.do?ActionName=getAllAction";
	}

}
