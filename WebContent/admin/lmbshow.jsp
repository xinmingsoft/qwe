<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	#tianjiacontent{display:none;}
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

	<input type = "button" id = "t" value = "添加"/>
	<table border=1 width="100%">
	<!-- 一行 -->
		<tr>
		<!-- 几列 -->
			<th>编号</th>
			<th>级别</th>
			<th>标题</th>
			<th>图片</th>
			<th>简介</th>
			<th>跳转方式</th>
			<th>对应页面</th>
			<th>备注</th>
			<th>修改啊</th>
			<th>删除啊</th>
		<tr>
		<c:forEach var = "list" items="${lmbList }">
		<tr>
			<td>${list.id }</td>
			<td>${list.jb }</td>
			<td>${list.bt }</td>
			<td>${list.tp }</td>
			<td>${list.jj }</td>
			<td>${list.tzfs }</td>
			<td>${list.dyym }</td>
			<td>${list.bz }</td>
			<td><a href = "Lmb.do?ActionName=getIdAction&ab=${list.id }">修改</a></td>
			<td><a href = "Lmb.do?ActionName=getDelAction&ab=${list.id }">删除</a></td>
		</tr>
		</c:forEach>
	</table>
	
	<div id = "ti">
		<form action="Lmb.do?ActionName=getAddAction" method="post">
			级别：<input type = "text" name = "jb"/><br/>
			标题：<input type = "text" name = "bt"/><br/>
			图片:<input type = "text" name = "tp"/><br/>
			简介:<input type = "text" name = "jj"/><br/>
			跳转方式:<input type = "text" name = "tzfs"/><br/>
			对应页面:<input type = "text" name = "dyym"/><br/>
			备注:<input type = "text" name = "bz"/><br/>
			<input type="submit"/>
		</form>
	</div>
</body>
</html>