package nqy.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.model.IModel;
import nqy.model.NrbGetAddAction;
import nqy.model.NrbGetAllAction;
import nqy.model.NrbGetDelAction;
import nqy.model.NrbGetIdAction;
import nqy.model.NrbGetUpdAction;

/**
 * Servlet implementation class Nrbcontroller
 */
@WebServlet("/Nrbcontroller")
public class Nrbcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
      //初始化Action方法
	public void init()
	{
		ServletContext application = getServletContext();
		application.setAttribute("getAllAction", new NrbGetAllAction());
		application.setAttribute("getAddAction", new NrbGetAddAction());
		application.setAttribute("getIdAction", new NrbGetIdAction());
		application.setAttribute("getUpdAction", new NrbGetUpdAction());
		application.setAttribute("getDelAction", new NrbGetDelAction());
	}
    
    public Nrbcontroller() {
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
