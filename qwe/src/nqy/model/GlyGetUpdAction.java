package nqy.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.GlyDao;
import nqy.entity.Gly;

public class GlyGetUpdAction implements IModel {

	private GlyDao dao = null;
	public GlyGetUpdAction()
	{
		dao = new GlyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
 		String id = request.getParameter("id");
		String usr = request.getParameter("usr");
		String pwd = request.getParameter("pwd");
		String lev = request.getParameter("lve");
		
		Gly gly = new Gly();
		gly.setId(Integer.valueOf(id));
		gly.setYhm(usr);
		gly.setMm(pwd);
		gly.setJb(Integer.valueOf(lev));
		
		dao.update(gly);
		
		 
		return "Gly.do?ActionName=getAllAction";
		
		
	}

}
