package nqy.model;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LyflDao;
import nqy.entity.Lyfl;

public class LyflGetAllAction implements IModel{

	private LyflDao dao = null;
	public LyflGetAllAction()
	{
		dao = new LyflDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Lyfl> list = dao.getData();
		request.setAttribute("List", list);
		return "admin/Lyflshow.jsp";
	}

	

}
