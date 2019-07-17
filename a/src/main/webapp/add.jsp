<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	function lod(){
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath }/mainsele',
			dataType:'json',
			success:function(data){
				for(var i=0;i<data.length;i++){
					$("#id1").append("<input type='checkbox' name='mains["+i+"].mainId' value='"+data[i].mainId+"'>"+data[i].green);
				}
			}
		})
	}
</script>
</head>
<body onload="lod()">
	<form action="${pageContext.request.contextPath }/add" method="post">
		菜名:<input type="text" name="mname"><br>
		价格:<input type="text" name="price"><br>
		材料:<div id="id1"></div>
		<input type="submit" value="添加">
	</form>
</body>
</html>