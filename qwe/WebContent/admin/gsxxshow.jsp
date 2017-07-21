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
	<table width="100%" border="1">
		<tr>
			<th>编号</th>
			<th>名称</th>
			<th>执照</th>
			<th>电话</th>
			<th>传真</th>
			<th>手机</th>
			<th>邮件</th>
			<th>网址</th>
			<th>QQ</th>
			<th>微信</th>
			<th>地址</th>
			<th>简介</th>
			<th>信息</th>
			<th>规模</th>
			<th>备注</th>
			<th>修改啊</th>
			<th>删除啊</th>
		</tr>
		<c:forEach var ="list" items="${List }">
		<tr>
			<td>${list.id }</td>
			<td>${list.mc }</td>
			<td>${list.zz }</td>
			<td>${list.dh }</td>
			<td>${list.cz }</td>
			<td>${list.sj }</td>
			<td>${list.yj }</td>
			<td>${list.wz }</td>
			<td>${list.qq }</td>
			<td>${list.wx }</td>
			<td>${list.dz }</td>
			<td>${list.jj }</td>
			<td>${list.xx }</td>
			<td>${list.gm }</td>
			<td>${list.bz }</td>
			<td><a href="Gsxx.do?ActionName=getIdAction&ab=${list.id }">修改</a></td>
			<td><a href="Gsxx.do?ActionName=getDelAction&ab=${list.id }">删除</a></td>
		</tr>
		</c:forEach>
	</table>
	<P>添加</P>
	<form action="Gsxx.do?ActionName=getAddAction" method="post">
		
		名称<input type ="text" name = "mc"><br/>
		执照<input type ="text" name = "zz"><br/>
		电话<input type ="text" name = "dh"><br/>
		传真<input type ="text" name = "cz"><br/>
		手机<input type ="text" name = "sj"><br/>
		邮件<input type ="text" name = "yj"><br/>
		网址<input type ="text" name = "wz"><br/>
		QQ<input type ="text" name = "qq"><br/>
		微信<input type ="text" name = "wx"><br/>
		地址<input type ="text" name = "dz"><br/>
		简介<input type ="text" name = "jj"><br/>
		信息<input type ="text" name = "xx"><br/>
		规模<input type ="text" name = "gm"><br/>
		备注<input type ="text" name = "bz"><br/>
		<input type = "submit">
	</form>
</body>
</html>