package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.NrbDao;

public class NrbGetDelAction implements IModel {

	private NrbDao dao = null;
	public NrbGetDelAction()
	{
		dao = new NrbDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		dao.delete(Integer.valueOf(id));
		return "Nrb.do?ActionName=getAllAction";
	}

}
