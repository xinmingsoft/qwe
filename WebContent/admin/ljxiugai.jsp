<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Lj.do?ActionName=getUpdAction" method = "post">
		编号<input type = "text" name = "id" value = "${Lj.id }" readonly = "readonly">
		名称<input type = "text" name = "mc" value = "${Lj.mc }">
		文字<input type = "text" name = "wz" value = "${Lj.wz }">
		图片<input type = "text" name = "tp" value = "${Lj.tp }">
		地址<input type = "text" name = "dz" value = "${Lj.dz }">
		<input type = "submit">
	</form>

</body>
</html>