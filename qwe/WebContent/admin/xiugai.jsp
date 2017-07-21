<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Gly.do?ActionName=glyUpdAction" method="post">
	ID:<input type = "text" name = "id" value = "${gly.id }" readonly="readonly"/>
	用户名：<input type = "text" name = "usr" value = "${gly.yhm }"/>
	密码：<input type = "text" name = "pwd" value = "${gly.mm }">
	级别：<input type = "text" name = "lve" value = "${gly.jb }"><br/>
	<input type = "submit"/>
	</form>
</body>
</html>