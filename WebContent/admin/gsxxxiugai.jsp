<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Gsxx.do?ActionName=getUpdAction" method="post">
		编号<input type ="text" name = "id" value = "${list.id }"><br/>
		名称<input type ="text" name = "mc" value = "${list.mc }"><br/>
		执照<input type ="text" name = "zz" value = "${list.zz }"><br/>
		电话<input type ="text" name = "dh" value = "${list.dh }"><br/>
		传真<input type ="text" name = "cz" value = "${list.cz }"><br/>
		手机<input type ="text" name = "sj" value = "${list.sj }"><br/>
		邮件<input type ="text" name = "yj" value = "${list.yj }"><br/>
		网址<input type ="text" name = "wz" value = "${list.wz }"><br/>
		QQ<input type ="text" name = "qq" value = "${list.qq }"><br/>
		微信<input type ="text" name = "wx" value = "${list.wx }"><br/>
		地址<input type ="text" name = "dz" value = "${list.dz }"><br/>
		简介<input type ="text" name = "jj" value = "${list.jj }"><br/>
		信息<input type ="text" name = "xx" value = "${list.xx }"><br/>
		规模<input type ="text" name = "gm" value = "${list.gm }"><br/>
		备注<input type ="text" name = "bz" value = "${list.bz }"><br/>
		<input type = "submit">
	</form>

</body>
</html>