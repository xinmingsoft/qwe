<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	#ti{display:none;}
</style>
<script src="qwe/../jsp/jquery2.1.4.js"></script>
<script>
		$(function(){
			$("#t").click(function(){
				$("#ti").toggle();
			})
		})
</script>
</head>
<body>
	<input type = "button" value = "添加" id = "t">
	<table width = "100%" border="1">
		<tr>
			<th>编号</th>
			<th>栏目号</th>
			<th>标题</th>
			<th>关键字</th>
			<th>说明</th>
			<th>时间</th>
			<th>修改啊</th>
			<th>删除啊</th>
		</tr>
		<c:forEach var = "list" items = "${Seolist }">
		<tr>
			<td>${list.id }</td>
			<td>${list.lmh }</td>
			<td>${list.bt }</td>
			<td>${list.gjz }</td>
			<td>${list.sm }</td>
			<td>${list.sj }</td>
			<td><a href = "Seo.do?ActionName=getIdAction&ab=${list.id }">修改</a></td>
			<td><a href = "Seo.do?ActionName=getDelAction&ab=${list.id }">删除</a></td>
		</tr>
		</c:forEach>
	</table>
	<div id = "ti">
		<form action="Seo.do?ActionName=getAddAction" method = "post" >
			编号<input type = "text" name = "id"/><br/>
			栏目号<input type = "text" name = "lmh"/><br/>
			标题<input type = "text" name = "bt"/><br/>
			关键字<input type = "text" name = "gjz"/><br/>
			说明<input type = "text" name = "sm"/><br/>
			时间<input type = "text" name = "sj"/><br/>
			<input type = "submit"/>
		</form>	
	</div>
	

</body>
</html>