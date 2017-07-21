package nqy.model;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LyDao;
public class LyGetAllAction implements IModel {

	private LyDao dao = null;
	public LyGetAllAction()
	{
		dao = new LyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List list = dao.getData();
		request.setAttribute("List", list);
		return "admin/lyshow.jsp";
	}

}
