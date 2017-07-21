<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Ztb.do?ActionName=getUpdAction" method = "post">
			编号<input type = "text" name = "id" value = "${Ztblist.id }" readonly = "readonly"/><br>
			分组<input type = "text" name = "fz" value = "${Ztblist.fz }"/><br>
			标题<input type = "text" name = "bt" value = "${Ztblist.bt }"/><br>
			图片<input type = "text" name = "tp" value = "${Ztblist.tp }"/><br>
			简介<input type = "text" name = "jj" value = "${Ztblist.jj }"/><br>
			跳转方式<input type = "text" name = "tzfs" value = "${Ztblist.tzfs }"/><br>
			对应页面<input type = "text" name = "dyym" value = "${Ztblist.dyym }"/><br>
			备注<input type = "text" name = "bz" value = "${Ztblist.bz }"/><br>
			<input type = "submit"/>
		</form>

</body>
</html>