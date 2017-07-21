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
<script src = "qwe/../jsp/jquery2.1.4.js"></script>
<script>
	$(function(){
		$("#t").click(function(){
			$("#ti").toggle();
		})
	})
</script>
</head>
<body>
	<input type = "button" id ="t" value = "添加">
	<table width = "100%" border = "1">
		<tr>
			<td>编号</td>
			<td>栏目表</td>
			<td>专题表</td>
			<td>标题</td>
			<td>副标题</td>
			<td>大图</td>
			<td>小图</td>
			<td>简介</td>
			<td>内容</td>
			<td>作者</td>
			<td>发时间</td>
			<td>改时间</td>
			<td>跳转方式</td>
			<td>对应页面</td>
			<td>修改啊</td>
			<td>删除啊</td>
			
		</tr>
		<c:forEach var = "list" items = "${nrblist }">
		<tr>
			<td>${list.id }</td>
			<td>${list.lmh }</td>
			<td>${list.zth }</td>
			<td>${list.bt }</td>
			<td>${list.fbt }</td>
			<td>${list.dt }</td>
			<td>${list.xt }</td>
			<td>${list.jj }</td>
			<td>${list.nr }</td>
			<td>${list.zz }</td>
			<td>${list.fsj }</td>
			<td>${list.gsj }</td>
			<td>${list.tzfs }</td>
			<td>${list.dyym }</td>
			<td><a href = "Nrb.do?ActionName=getIdAction&ab=${list.id }">修改</a></td>
			<td><a href = "Nrb.do?ActionName=getDelAction&ab=${list.id }">删除</a></td>
			
		</tr>
		</c:forEach>
	</table>
	
		<div id = "ti">
			<form action ="Nrb.do?ActionName=getAddAction" method = "post" >
				编号<input type = "text" name = "id"/><br/>
				栏目号<input type = "text" name = "lmh"/><br/>
				专题号<input type = "text" name = "zth"/><br/>
				标题<input type = "text" name = "bt"/><br/>
				副标题<input type = "text" name = "fbt"/><br/>
				大图<input type = "text" name = "dt"/><br/>
				小图<input type = "text" name = "xt"/><br/>
				简介<input type = "text" name = "jj"/><br/>
				内容<input type = "text" name = "nr"/><br/>
				作者<input type = "text" name = "zz"/><br/>
				发时间<input type = "text" name = "fsj"/><br/>
				改时间<input type = "text" name = "gsj"/><br/>
				跳转方式<input type = "text" name = "tzfs"/><br/>
				对应页面<input type = "text" name = "dyym"/><br/>
				<input type = "submit">
			</form>
		</div>


</body>
</html>