<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Ly.do?ActionName=getUpdAction" method="post">
		编号<input type = "text" name = "id" value = "${list.id }" readonly = "readonly"><br/>
		分类号<input type = "text" name = "flh" value = "${list.flh }"><br/>
		名字<input type = "text" name = "mz" value = "${list.mz }"><br/>
		英文名<input type = "text" name = "ywm" value = "${list.ywm }"><br/>
		性别<input type = "text" name = "xb" value = "${list.xb }"><br/>
		邮件<input type = "text" name = "yj" value = "${list.yj }"><br/>
		电话<input type = "text" name = "dh" value = "${list.dh }"><br/>
		留言内容<input type = "text" name = "lynr" value = "${list.lynr }"><br/>
		留时间<input type = "text" name = "lsj" value = "${list.lsj }"><br/>
		回复内容<input type = "text" name = "hfnr" value = "${list.hfnr }"><br/>
		回时间<input type = "text" name = "hsj" value = "${list.hsj }"><br/>
		是否回复<input type = "text" name = "sfhf" value = "${list.sfhf }"><br/>
		<input type = "submit"/>
	</form>

</body>
</html>