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
	<form action="Lyfl.do?ActionName=getUpdAction" method = "post">
		编号<input type = "text" name = "id" value = "${list.id }" readonly="readonly"><br/>
		标题<input type = "text" name = "bt" value = "${list.bt }"><br/>
		图片<input type = "text" name = "tp" value = "${list.tp }"><br/>
		跳转方式<input type = "text" name = "tzfs" value = "${list.tzfs }"><br/>
		对应页面<input type = "text" name = "dyym" value = "${list.dyym }"><br/>
		备注<input type = "text" name = "bz" value = "${list.bz }"><br/>
		<input type = "submit">
	</form>

</body>
</html>