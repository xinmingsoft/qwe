package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.dao.Impl.LyDao;
import nqy.entity.Ly;

public class LyGetUpdAction implements IModel {

	private LyDao dao = null;
	public LyGetUpdAction()
	{
		dao = new LyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String flh = request.getParameter("flh");
		String mz = request.getParameter("mz");
		String ywm = request.getParameter("ywm");
		String xb = request.getParameter("xb");
		String yj = request.getParameter("yj");
		String dh = request.getParameter("dh");
		String lynr = request.getParameter("lynr");
		String lsj = request.getParameter("lsj");
		String hfnr = request.getParameter("hfnr");
		String hsj = request.getParameter("hsj");
		String sfhf = request.getParameter("sfhf");
		Ly ly = new Ly();
		ly.setId(Integer.valueOf(id));
		ly.setFlh(Integer.valueOf(flh));
		ly.setMz(mz);
		ly.setYwm(ywm);
		ly.setXb(xb);
		ly.setYj(yj);
		ly.setDh(dh);
		ly.setLynr(lynr);
		ly.setLsj(lsj);
		ly.setHfnr(hfnr);
		ly.setHsj(hsj);
		ly.setSfhf(Integer.valueOf(sfhf));
		dao.update(ly);
		return "Ly.do?ActionName=getAllAction";
	}

}
