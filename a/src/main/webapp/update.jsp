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
	function update(){
		var menuId=$("#id4").val();
		var mname=$("#id3").val();
		var price=$("#id2").val();
		var str=[];
		$('input:checkbox:checked').each(function(){
			str.push($(this).val());
		});
		//alert(menuId+","+mname+","+price+","+str);
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath }/toupdate?menuId='+menuId+'&mname='+mname+'&price='+price+'&str='+str,
			dataType:'json',
			success:function(data){
				window.location.href='${pageContext.request.contextPath }/queryAll'
			}
		})
	}
</script>
</head>
<body>
	
			<input id="id4" type="hidden" name="menuId" value="${menu.menuId }">
		菜名:<input type="text" id="id3" name="mname" value="${menu.mname }"><br>
		价格:<input type="text" id="id2" name="price" value="${menu.price }"><br>
		材料:<div id="id1">
				<c:forEach items="${mainlist }" var="m">
					<!-- 含有标记 -->
					<input type="checkbox" value="${m.mainId }"
						<c:if test="${m.green.contains('+') }"> checked="checked"</c:if>
					>
					<!-- 如果有去除 -->
					<c:if test="${m.green.contains('+') }">${m.green.substring(1) }</c:if>
					<c:if test="${!m.green.contains('+')}">${m.green }</c:if>
				</c:forEach>
			</div>
		<input type="button" value="修改" onclick="update()">
</body>
</html>