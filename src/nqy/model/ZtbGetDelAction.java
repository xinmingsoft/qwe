package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.ZtbDao;

public class ZtbGetDelAction implements IModel{
	private ZtbDao dao = null;
	public ZtbGetDelAction()
	{
		dao = new ZtbDao();
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("ab");
		dao.delete(Integer.valueOf(id));
		return "Ztb.do?ActionName=getAllAction";
	}

}
