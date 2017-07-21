package nqy.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.model.IModel;
import nqy.model.LmbGetAllAction;
import nqy.model.ZtbGetAddAction;
import nqy.model.ZtbGetAllAction;
import nqy.model.ZtbGetDelAction;
import nqy.model.ZtbGetIdAction;
import nqy.model.ZtbGetUpdAction;

/**
 * Servlet implementation class Ztbcontroller
 */
@WebServlet("/Ztbcontroller")
public class Ztbcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       //初始化调用Action方法
   public void init()
   {
	   ServletContext application = getServletContext();
	   application.setAttribute("getAllAction", new ZtbGetAllAction());
	   application.setAttribute("getAddAction", new ZtbGetAddAction());
	   application.setAttribute("getIdAction", new ZtbGetIdAction());
	   application.setAttribute("getUpdAction", new ZtbGetUpdAction());
	   application.setAttribute("getDelAction", new ZtbGetDelAction());
   }
	
    public Ztbcontroller() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("ActionName");
		IModel model = (IModel) getServletContext().getAttribute(cmd);
		String url = model.execute(request, response);
		//请求转发
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
