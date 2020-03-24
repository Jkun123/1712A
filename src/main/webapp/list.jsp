<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet"> 
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	
	$(function(){
		$("#ps").toggle(function(){
			if(confirm("确定删除吗?")){
				var ids = $("[name=box]:checked").map(function(){
					return $(this).val()
				}).get().join();
			
				$.post("del1",{"ids":ids},function(date){
					if(date){
						alert("删除成功");
						location = "list";
					}else{
						alert("删除失败");
					}
				})
			}else{
				
			}
		},function(){
			if(confirm("确定删除吗?")){
				var ids = $("[name=box]:checked").map(function(){
					return $(this).val()
				}).get().join();
			
				$.post("del2",{"ids":ids},function(date){
					if(date){
						alert("删除成功");
						location = "list";
					}else{
						alert("删除失败");
					}
				})
			}else{
				
			}
		})
	})
</script>
</head>
<body>
	
	<table>
		<tr>
			<td colspan="7">
				<form action="list" method="post">
					<input type="text" name="lname">
					<input type="submit" value="查询">
				</form>
				<a href="add.jsp"><input type="button" value="新增"></a>
				<input type="button" value="批量删除"  id="ps">
			</td>
		</tr>
		<tr>
			<td>
				<input type="checkbox" id="qx">全选
			</td>
			<td>编号</td>
			<td>品牌</td>
			<td>分类</td>
			<td>发布时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="g">
			<tr>
				<td><input type="checkbox" name="box" value="${g.gid }"> </td>
				<td>${g.gid }</td>
				<td>${g.gname }</td>
				<td>${g.tname }</td>
				<td>${g.datea }</td>
				<td>
					<a href="queryGoodsById?gid=${g.gid }">详情</a>
					<a href="toUpdate?gid=${g.gid }">编辑</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="7">
				<a href="list?pageNum=1">首页</a>
				<a href="list?pageNum=${page.pageNum-1<0?page.pageNum:page.pageNum-1 }">上一页</a>
				<a href="list?pageNum=${page.pageNum+1>page.pages?page.pages:page.pageNum+1 }">下一页</a>
				<a href="list?pageNum=${page.pages}">末页</a>
				当前为${page.pageNum }/${page.pages }页
			
			</td>
		</tr>
	</table>
	
</body>
</html>