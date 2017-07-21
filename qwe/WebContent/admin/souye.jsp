<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<Base target = "abc"/>
<title>Insert title here</title>
<style>
	*{padding:0px; margin:0px;}
	ul li{list-style:none;}
	.parent1, .parent2, .parent3, .parent4{font-size:30px;}
	.parent1_sub, .parent2_sub, .parent3_sub, .parent4_sub{display:none;}
</style>
<script src ="../jsp/jquery2.1.4.js"></script>
<script>
	$(function(){
		$(".parent1, .parent2, .parent3, .parent4").click(function(){
			var s = $(this)[0].className+"_sub";
			$("."+s).toggle();
		});
	});
</script>
</head>
<body>
	<table border="1px" width="100%" height = "650px;">
		<tr>
			<td height = "100px" colspan = "2">
			<h1 align = "center">网站通用后台管理系统</h1>
			</td>
		
		</tr>
		<tr>
			<td width = "20%">
				<ul>
					<li class = "parent1">新闻系统</li>
					<li class = "parent1_sub"><a href = "/qwe/Lmb.do?ActionName=getAllAction">栏目表</a></li>
					<li class = "parent1_sub"><a href = "/qwe/Ztb.do?ActionName=getAllAction">专题表</a></li>
					<li class = "parent1_sub"><a href = "/qwe/Nrb.do?ActionName=getAllAction">内容表</a></li>
					
					<li class = "parent2">SEO优化系统</li>
					<li class = "parent2_sub"><a href = "/qwe/Seo.do?ActionName=getAllAction">SEO信息表</a></li>
					<li class = "parent2_sub"><a href = "/qwe/Lj.do?ActionName=getAllAction">友情链接表</a></li>
					
					<li class = "parent3">留言系统</li>
					<li class = "parent3_sub"><a href = "/qwe/Lyfl.do?ActionName=getAllAction">留言分类表</a></li>
					<li class = "parent3_sub"><a href = "/qwe/Ly.do?ActionName=getAllAction">留言表</a></li>
					
					<li class = "parent4">系统管理</li>
					<li class = "parent4_sub"><a href = "/qwe/Gsxx.do?ActionName=getAllAction">公司信息表</a></li>
					<li class = "parent4_sub"><a href = "/qwe/Gly.do?ActionName=getAllAction">管理员</a></li>
				</ul>
			</td>
			<td valign = "top">
				<iframe src = "" width="100%" height="100%" name = "abc"></iframe>
			</td>
		</tr>
		<tr>
			<td height = "100px" colspan="2">
			<h3>xxxx有限公司</h3>
			<h3>有问题联系我啊</h3>
			</td>
		</tr>
	</table>
</body>
</html>