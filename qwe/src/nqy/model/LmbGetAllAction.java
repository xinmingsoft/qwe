package nqy.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LmbDao;
import nqy.entity.Lmb;

public class LmbGetAllAction implements IModel {
	
	private LmbDao dao = null;
	public LmbGetAllAction()
	{
		dao = new LmbDao();
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		List<Lmb> list = dao.getData();
		request.setAttribute("lmbList", list);
		return "admin/lmbshow.jsp";
		
	}

}
