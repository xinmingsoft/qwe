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
	<form action ="Nrb.do?ActionName=getUpdAction" method = "post" >
				编号<input type = "text" name = "id" value = "${Nrblist.id }" readonly = "readonly"/><br/>
				栏目号<input type = "text" name = "lmh" value = "${Nrblist.lmh }"/><br/>
				专题号<input type = "text" name = "zth" value = "${Nrblist.zth }"/><br/>
				标题<input type = "text" name = "bt" value = "${Nrblist.bt }"/><br/>
				副标题<input type = "text" name = "fbt" value = "${Nrblist.fbt }"/><br/>
				大图<input type = "text" name = "dt" value = "${Nrblist.dt }"/><br/>
				小图<input type = "text" name = "xt" value = "${Nrblist.xt }"/><br/>
				简介<input type = "text" name = "jj" value = "${Nrblist.jj }"/><br/>
				内容<input type = "text" name = "nr" value = "${Nrblist.nr }"/><br/>
				作者<input type = "text" name = "zz" value = "${Nrblist.zz }"/><br/>
				发时间<input type = "text" name = "fsj" value = "${Nrblist.fsj }"/><br/>
				改时间<input type = "text" name = "gsj" value = "${Nrblist.gsj }"/><br/>
				跳转方式<input type = "text" name = "tzfs" value = "${Nrblist.tzfs }"/><br/>
				对应页面<input type = "text" name = "dyym" value = "${Nrblist.dyym }"/><br/>
				<input type = "submit">
			</form>

</body>
</html>