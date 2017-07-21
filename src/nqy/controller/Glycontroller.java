package nqy.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nqy.model.GlyDLAction;
import nqy.model.GlyGetAddAction;
import nqy.model.GlyGetAllAction;
import nqy.model.GlyGetDelAction;
import nqy.model.GlyGetIdAction;
import nqy.model.GlyGetLikeAction;
import nqy.model.GlyGetUpdAction;
import nqy.model.IModel;
//专门用于地址栏提交的
/**
 * Servlet implementation class Glycontroller
 */
@WebServlet("/Glycontroller")
public class Glycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   //初始化调用Action 方法               
   public void init()
   {
	 //可以再不同的servlet之间共享属性
	   ServletContext application = getServletContext();
	   application.setAttribute("getAllAction", new GlyGetAllAction());
	   application.setAttribute("glyAddAction", new GlyGetAddAction());
	   application.setAttribute("glyDelAction", new GlyGetDelAction());
	   application.setAttribute("glyGetidAction", new GlyGetIdAction());
	   application.setAttribute("glyUpdAction", new GlyGetUpdAction());
	   application.setAttribute("glyLikeAction", new GlyGetLikeAction());
	   application.setAttribute("glyDLAction", new GlyDLAction());
   }
    public Glycontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					//地址栏的内容
		String cmd = request.getParameter("ActionName");
		IModel model = (IModel)getServletContext().getAttribute(cmd);
		String url = model.execute(request, response);
		
		
		HttpSession se = request.getSession();
		String str = "";
		if(se.getAttribute("uu") != null)
		{
			str = se.getAttribute("uu").toString();
		}
		else
		{
			str = "你得登录啊";
		}
			
		request.setAttribute("yhm", str);
			
		//请求转发 前往得到的地址得到结果
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
