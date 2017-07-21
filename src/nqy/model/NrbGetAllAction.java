package nqy.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.NrbDao;
import nqy.entity.Nrb;

public class NrbGetAllAction implements IModel {

	private NrbDao dao = null;
	public NrbGetAllAction()
	{
		dao = new NrbDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Nrb> list = dao.getData();
		request.setAttribute("nrblist", list);
		return "admin/nrbshow.jsp";
	}

}
