<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="qwe/../jsp/jquery2.1.4.js"></script>

</head>
<body>
	
	<table width = "100%" border = "1">
		<tr>
			<th>编号</th>
			<th>名称</th>
			<th>文字</th>
			<th>图片</th>
			<th>地址</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
		<c:forEach var = "list" items = "${Ljlist }">
		<tr>
			<td>${list.id }</td>
			<td>${list.mc }</td>
			<td>${list.wz }</td>
			<td>${list.tp }</td>
			<td>${list.dz }</td>
			<td><a href = "Lj.do?ActionName=getIdAction&ab=${list.id }">修改</a></td>
			<td><a href = "Lj.do?ActionName=getDelAction&ab=${list.id }">删除</a></td>
		</tr>
		</c:forEach>
	</table>
	<p>以下添加</p>
	<div>
	<form action="Lj.do?ActionName=getAddAction" method = "post">
	
		名称<input type = "text" name = "mc"/><br/>
		文字<input type = "text" name = "wz"/><br/>
		图片<input type = "text" name = "tp"/><br/>
		地址<input type = "text" name = "dz"/><br/>
		<input type = "submit"/>
	</form>
	</div>

</body>
</html>