package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LjDao;
import nqy.entity.Lj;

public class LjGetUpdAction implements IModel {

	private LjDao dao = null;
	public LjGetUpdAction()
	{
		dao = new LjDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String mc = request.getParameter("mc");
		String wz = request.getParameter("wz");
		String tp = request.getParameter("tp");
		String dz = request.getParameter("dz");
		Lj lj = new Lj();
		lj.setId(Integer.valueOf(id));
		lj.setMc(mc);
		lj.setWz(wz);
		lj.setTp(tp);
		lj.setDz(dz);
		dao.update(lj);
		return "Lj.do?ActionName=getAllAction";
	}

}
