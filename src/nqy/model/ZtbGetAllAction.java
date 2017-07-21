package nqy.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.ZtbDao;
import nqy.entity.Ztb;

public class ZtbGetAllAction implements IModel {

	private ZtbDao dao = null;
	public ZtbGetAllAction()
	{
		dao = new ZtbDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Ztb> list = dao.getData();
		request.setAttribute("Ztblist", list);
		return "admin/ztbshow.jsp";
	}

}
