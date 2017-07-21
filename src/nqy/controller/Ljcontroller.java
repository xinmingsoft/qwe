package nqy.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.model.IModel;
import nqy.model.LjGetAddAction;
import nqy.model.LjGetAllAction;
import nqy.model.LjGetDelAction;
import nqy.model.LjGetIdAction;
import nqy.model.LjGetUpdAction;


/**
 * Servlet implementation class Ljcontroller
 */
@WebServlet("/Ljcontroller")
public class Ljcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//初始化调用Action方法
   public void init()
   {
	   ServletContext application = getServletContext();
	   application.setAttribute("getAllAction", new LjGetAllAction());
	   application.setAttribute("getAddAction", new LjGetAddAction());
	   application.setAttribute("getIdAction", new LjGetIdAction());
	   application.setAttribute("getUpdAction", new LjGetUpdAction());
	   application.setAttribute("getDelAction", new LjGetDelAction());
	   
   }
    public Ljcontroller() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
