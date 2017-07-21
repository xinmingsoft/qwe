package nqy.model;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LyflDao;
import nqy.entity.Lyfl;

public class LyflGetIdAction implements IModel {

	private LyflDao dao = null;
	public LyflGetIdAction()
	{
		dao = new LyflDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id =  request.getParameter("ab");
		Lyfl lyfl = dao.getDataById(Integer.valueOf(id));
		request.setAttribute("list", lyfl);
		return "admin/lyflxiugai.jsp";
	}

}
