<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Lmb.do?ActionName=getUpdAction" method = "post">
		编号<input type = "text" name = "id" value = "${lmbList.id }" readonly = "readonly"/>
		级别<input type = "text" name = "jb" value = "${lmbList.jb }"/>
		标题<input type = "text" name = "bt" value = "${lmbList.bt }"/>
		图片<input type = "text" name = "tp" value = "${lmbList.tp }"/>
		简介<input type = "text" name = "jj" value = "${lmbList.jj }"/>
		跳转方式<input type = "text" name = "tzfs" value = "${lmbList.tzfs }"/>
		对应页面<input type = "text" name = "dyym" value = "${lmbList.dyym }"/>
		备注<input type = "text" name = "bz" value = "${lmbList.bz }"/>
		<input type = "submit"/>
		
	</form>

</body>
</html>