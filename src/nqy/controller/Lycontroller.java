package nqy.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.model.GlyGetAllAction;
import nqy.model.IModel;
import nqy.model.LyGetAddAction;
import nqy.model.LyGetAllAction;
import nqy.model.LyGetDelAction;
import nqy.model.LyGetIdAction;
import nqy.model.LyGetUpdAction;

/**
 * Servlet implementation class Lycontroller
 */
@WebServlet("/Lycontroller")
public class Lycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void init()
    {
    	ServletContext application = getServletContext();
  	   	application.setAttribute("getAllAction", new LyGetAllAction());
  		application.setAttribute("getAddAction", new LyGetAddAction());
  		application.setAttribute("getIdAction", new LyGetIdAction());
  		application.setAttribute("getUpdAction", new LyGetUpdAction());
  		application.setAttribute("getDelAction", new LyGetDelAction());
    }
    
    public Lycontroller() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("ActionName");
		IModel model = (IModel)getServletContext().getAttribute(cmd);
		String url = model.execute(request, response);
		//请求转发
		request.getRequestDispatcher(url).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
