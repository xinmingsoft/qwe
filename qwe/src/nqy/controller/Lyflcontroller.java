package nqy.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nqy.model.IModel;
import nqy.model.LjGetAllAction;
import nqy.model.LyflGetAddAction;
import nqy.model.LyflGetAllAction;
import nqy.model.LyflGetDelAction;
import nqy.model.LyflGetIdAction;
import nqy.model.LyflGetUpdAction;

/**
 * Servlet implementation class Lyflcontroller
 */
@WebServlet("/Lyflcontroller")
public class Lyflcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//初始化调用Action 方法
    public void init()
    {
    	ServletContext application = getServletContext();
 	    application.setAttribute("getAllAction", new LyflGetAllAction());
 	    application.setAttribute("getAddAction", new LyflGetAddAction());
 	    application.setAttribute("getIdAction", new LyflGetIdAction());
 	   application.setAttribute("getUpdAction", new LyflGetUpdAction());
 	  application.setAttribute("getDelAction", new LyflGetDelAction());
    }
    
    public Lyflcontroller() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("ActionName");
		IModel model = (IModel) getServletContext().getAttribute(cmd);
		String url = model.execute(request, response);
		//请求转发
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
