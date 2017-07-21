package nqy.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LjDao;
import nqy.entity.Lj;

public class LjGetAllAction implements IModel {

	private LjDao dao = null;
	public LjGetAllAction()
	{
		dao = new LjDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Lj> list = dao.getData();
		request.setAttribute("Ljlist", list);
		return "admin/ljshow.jsp";
	}

}
