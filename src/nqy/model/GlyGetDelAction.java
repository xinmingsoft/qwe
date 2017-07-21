package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.GlyDao;

public class GlyGetDelAction implements IModel{

	private GlyDao dao = null;
	public GlyGetDelAction()
	{
		dao = new GlyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		dao.delete(Integer.parseInt(id));
		return "Gly.do?ActionName=getAllAction";
	}

}
