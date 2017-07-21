package nqy.model;


import java.math.BigInteger;
import java.security.MessageDigest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nqy.dao.Impl.GlyDao;
import nqy.entity.Gly;

public class GlyDLAction implements IModel {

	private GlyDao dao = null;
	public GlyDLAction()
	{
		dao = new GlyDao();
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String yhm = request.getParameter("yhm");
		String mm = request.getParameter("mm");
		String mm1 = getMD5(mm);
		
		Gly gly = new Gly();
		gly.setYhm(yhm);
		//赋值之前就加密
	 	gly.setMm(mm1);
	 	
		int a = dao.getDl(gly);
		if(a == 0)
		{
			//错误的话要去登录界面 不能死循环登录操作了
			return "admin/denglu.jsp";
		}		else
		{
					//得到Session对象
			request.getSession().setAttribute("uu", yhm);
			return "Gly.do?ActionName=getAllAction";
			
		}
	}
	
	public static String getMD5(String str) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
	
	
	
	
	
	
}
	
	

