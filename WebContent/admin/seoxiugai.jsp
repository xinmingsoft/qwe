<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Seo.do?ActionName=getUpdAction" method = "post" >
			编号<input type = "text" name = "id" value = "${list.id }" readonly = "readonly"/><br/>
			栏目号<input type = "text" name = "lmh" value = "${list.lmh }"/><br/>
			标题<input type = "text" name = "bt" value = "${list.bt }"/><br/>
			关键字<input type = "text" name = "gjz" value = "${list.gjz }"/><br/>
			说明<input type = "text" name = "sm" value = "${list.sm }"/><br/>
			时间<input type = "text" name = "sj" value = "${list.sj }"/><br/>
			<input type = "submit"/>
		</form>	

</body>
</html>