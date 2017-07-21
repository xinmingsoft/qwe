<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width = "100%" border = "1">
		<tr>
			<th>编号</th>
			<th>分类号</th>
			<th>名字</th>
			<th>英文名</th>
			<th>性别</th>
			<th>邮件</th>
			<th>电话</th>
			<th>留言内容</th>
			<th>留时间</th>
			<th>回复内容</th>
			<th>回时间</th>
			<th>是否回复</th>
			<th>修改啊</th>
			<th>删除啊</th>
		</tr>
		<c:forEach var ="list" items = "${List }">
		<tr>
			<td>${list.id }</td>
			<td>${list.flh }</td>
			<td>${list.mz }</td>
			<td>${list.ywm }</td>
			<td>${list.xb }</td>
			<td>${list.yj }</td>
			<td>${list.dh }</td>
			<td>${list.lynr }</td>
			<td>${list.lsj }</td>
			<td>${list.hfnr }</td>
			<td>${list.hsj }</td>
			<td>${list.sfhf }</td>
			<td><a href = "Ly.do?ActionName=getIdAction&ab=${list.id }">修改</a></td>
			<td><a href = "Ly.do?ActionName=getDelAction&ab=${list.id }">删除</a></td>
			
		</tr>
		</c:forEach>
	</table>
	<p>添加</p>
	<form action="Ly.do?ActionName=getAddAction" method="post">
		
		分类号<input type = "text" name = "flh"><br/>
		名字<input type = "text" name = "mz"><br/>
		英文名<input type = "text" name = "ywm"><br/>
		性别<input type = "text" name = "xb"><br/>
		邮件<input type = "text" name = "yj"><br/>
		电话<input type = "text" name = "dh"><br/>
		留言内容<input type = "text" name = "lynr"><br/>
		留时间<input type = "text" name = "lsj"><br/>
		回复内容<input type = "text" name = "hfnr"><br/>
		回时间<input type = "text" name = "hsj"><br/>
		是否回复<input type = "text" name = "sfhf"><br/>
		<input type = "submit"/>
		
	</form>

</body>
</html>