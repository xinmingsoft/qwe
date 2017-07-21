package nqy.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IModel {
	//所有的Model下的实现类，都必须要实现这个execute方法
	//所有的业务逻辑都是在这个方法中完成的
	//返回的事跳转地址
	
	public String execute(HttpServletRequest request, HttpServletResponse response);

}
