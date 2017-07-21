package nqy.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.model.GlyGetAllAction;
import nqy.model.GsxxGetAddAction;
import nqy.model.GsxxGetAllAction;
import nqy.model.GsxxGetDelAction;
import nqy.model.GsxxGetIdAction;
import nqy.model.GsxxGetUpdAction;
import nqy.model.IModel;

/**
 * Servlet implementation class Gsxxcontroller
 */
@WebServlet("/Gsxxcontroller")
public class Gsxxcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void init()
    {
    	ServletContext application = getServletContext();
  	   	application.setAttribute("getAllAction", new GsxxGetAllAction());
  	   	application.setAttribute("getAddAction", new GsxxGetAddAction());
  		application.setAttribute("getIdAction", new GsxxGetIdAction());
  		application.setAttribute("getUpdAction", new GsxxGetUpdAction());
  		application.setAttribute("getDelAction", new GsxxGetDelAction());
  		
  		
    }
    public Gsxxcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cmd = request.getParameter("ActionName");
		IModel model = (IModel)getServletContext().getAttribute(cmd);
		String url = model.execute(request, response);
		//请求转发
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
