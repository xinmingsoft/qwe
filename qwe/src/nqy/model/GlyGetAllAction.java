package nqy.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.GlyDao;
import nqy.entity.Gly;
//
public class GlyGetAllAction implements IModel {

    private GlyDao dao = null;
	public GlyGetAllAction()
	{
		dao = new GlyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Gly> list = dao.getData();
		request.setAttribute("glyList", list);
		return "admin/glyshow.jsp";
	}
	

}
