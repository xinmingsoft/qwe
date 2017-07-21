package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.GlyDao;
import nqy.entity.Gly;

public class GlyGetAddAction implements IModel{
	private GlyDao dao = null;
	public GlyGetAddAction()
	{
		dao = new GlyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String usr = request.getParameter("usr");
		String pwd = request.getParameter("pwd");
		String lve = request.getParameter("lve");
		
		Gly gly = new Gly();
		gly.setYhm(usr);
		gly.setMm(pwd);
		gly.setJb(Integer.valueOf(lve));
		
		dao.insert(gly);
		
		return"Gly.do?ActionName=getAllAction";
	}

}
