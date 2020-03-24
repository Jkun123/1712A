<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet"> 
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$.post("queryTypes",function(obj){
		for ( var i in obj) {
			$("[name=tid]").append("<option value="+obj[i].tid+">  "+obj[i].tname+"  </option>");
		}
	},"json");
	

	

</script>

</head>
<body>
<h1>编辑页面</h1>
	<form action="update1" method="post">
		编号:<input type="text" name="gid" value="${g.gid }"><br><br>
		品牌:<input type="text" name="gname" value="${g.gname }"><br><br>
		分类:<select name="tid">
			<option> --请选择--</option>
			
		</select><br><br>
		价格:<input type="text" name="price" value="${g.price }"><br><br>
		时间:<input type="text" name="datea" value="${g.datea }"><br><br>
		<input type="submit" value="修改">
	</form>
</body>
</html>