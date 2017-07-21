<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 路径不要写错 -->
	<form action="/qwe/Gly.do?ActionName=glyDLAction" method = "post">
		用户名：<input type = "text" name = "yhm"/><br></br>
		<!-- 用password 输入时就变成小圆点 -->
		密　码：<input type = "password" name = "mm"/><br></br>
		<input type = "submit" value = "登录"/>
	</form>

</body>
</html>