package nqy.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.GlyDao;
import nqy.entity.Gly;

public class GlyGetLikeAction implements IModel {

	private GlyDao dao = null;
	public GlyGetLikeAction()
	{
		dao = new GlyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String yhm = request.getParameter("yh");
		String jb = request.getParameter("jb");
		Gly gly = new Gly();
		gly.setYhm(yhm);
		gly.setJb(Integer.valueOf(jb));
		 List<Gly> list =  dao.getLike(gly);
		request.setAttribute("listl", list); 
		return "Gly.do?ActionName=getAllAction";
	}

}
