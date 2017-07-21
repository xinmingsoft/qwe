<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src ="qwe/../jsp/jquery2.1.4.js"></script>
<script>
	$(function(){
		$("#tianjiabutton").click(function(){
			$("#tianjiacontect").toggle();
		})
	})
	
	function shouye(){
		
	}
	
	function shangyiye(){
		
	}
	
	function xiayiye(){
		
	}
	
	function moye(){
		
	}
	
	
</script>
</head>
<body>
	
	<input type="button" id = "tianjiabutton" value ="添加"/>
	<table width="100%" border="1">
		<tr>
			<th>编号</th>
			<th>用户名</th>
			<th>密码</th>
			<th>级别</th>
			<th>删除啊</th>
			<th>修改啊</th>
		</tr> 
		<!-- list是变量名 循环glylist -->
		<c:forEach var = "list" items="${glyList }">
		<tr>
			<td>${list.id }</td>
			<td>${list.yhm }</td>
			<td>${list.mm }</td>
			<td>${list.jb }</td>
			<td><a href = "Gly.do?ActionName=glyGetidAction&ab=${list.id }">修改</a></td>
			<td><a href = "Gly.do?ActionName=glyDelAction&ab=${list.id }">删除</a></td>
		</tr>
		</c:forEach>
	</table>
	
	<div id = "tianjiacontect">
		<form action="Gly.do?ActionName=glyAddAction" method="post">
			用户名：<input type = "text" name = "usr"/><br/>
			密码： <input type = "text" name = "pwd"/><br/>
			级别： <input type = "text" name = "lve"/><br/>
			<input type = "submit"/>
		</form>
	</div>
	
	<p>按like查询</p>
	<form action="Gly.do?ActionName=glyLikeAction" method="post">
		用户名<input type = "text" name = "yh"/>
		级别<input type = "text" name = "jb"/>
		<input type = "submit"/>
	</form>
	<form action="Gly.do?ActionName=getAllAction" method="post">
	<table width="100%" border="1">
		<tr>
			<th>编号</th>
			<th>用户名</th>
			<th>密码</th>
			<th>级别</th>
		</tr>
		<c:forEach var = "list" items="${listl }">
		<tr>
			<td>${list.id }</td>
			<td>${list.yhm }</td>
			<td>${list.mm }</td>
			<td>${list.jb }</td>
		</tr>
		</c:forEach>
		<tr>
			<td><a href = "#" onclick = "shouye();">首页</a></td>
			<td><a href = "#" onclick = "shangyiye();">上一页</a></td>
			<td><a href = "#" onclick = "xiayiye();">下一页</a></td>
			<td><a href = "#" onclick = "moye();">末页</a></td>
			<td><a href = "#">当前   页</a></td>
			<td><a href = "#">共      页</a></td>
		</tr>
	</table>
	<input type = "text" name = "dangqianye" value = "" id = "dangqianye"/>
	</form>
	
	

	
	
</body>
</html>