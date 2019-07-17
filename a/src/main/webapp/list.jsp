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
	function qx(){
		$(":checkbox").attr("checked",true);
	}
	function qbx(){
		$(":checkbox").attr("checked",false);
	}
	function fx(){
		$(":checkbox").each(function(){
			this.checked=!this.checked;
		})
	}
	function plsc(){
		var str="";
		$(":checkbox:checked").each(function(){
			str += ","+this.value;
		})
		str=str.substring(1);
		window.location.href="${pageContext.request.contextPath}/delete?str="+str;
	}
</script>
</head>
<body>
<form action="" method="post">
	菜名:<input type="text" name="mname" value="menu.mname"><input type="submit" value="查询">
</form>
	<input type="button" value="注销" onclick="window.location.href='${pageContext.request.contextPath}/user'">
	<table border="1">
		<tr>
			<td>
				<input type="button" value="全选" onclick="qx()">
				<input type="button" value="全不选" onclick="qbx()">
				<input type="button" value="反选" onclick="fx()">
			</td>
			<td>编号</td>
			<td>菜名</td>
			<td>价格</td>
			<td>材料</td>
			<td>操作
				<input type="button" value="新增" onclick="window.location.href='${pageContext.request.contextPath}/add.jsp'">
				<input type="button" value="批量删除" onclick="plsc()">
			</td>
		</tr>
			<c:forEach items="${menus.list }" var="m">
				<tr>
					<td>
						<input type="checkbox" value="${m.menuId }">
					</td>
					<td>${m.menuId }</td>
					<td>${m.mname }</td>
					<td>${m.price }</td>
					<td>
					<c:forEach items="${m.mains }" var="mm">
						${mm.green },
					</c:forEach>
					</td>
					<td>
						<input type="button" value="删除" onclick="window.location.href='${pageContext.request.contextPath}/dele?id=${m.menuId}'">
						<input type="button" value="查看" onclick="window.location.href='${pageContext.request.contextPath}/byId?id=${m.menuId}'">
						<input type="button" value="修改" onclick="window.location.href='${pageContext.request.contextPath}/update?id=${m.menuId}'">
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="11">
					<a href="${pageContext.request.contextPath }/queryAll?page=1&rows=${menus.pageSize}&mname=${menu.mname}">首页</a>
					<a href="${pageContext.request.contextPath }/queryAll?page=${menus.prePage }&rows=${menus.pageSize}&mname=${menu.mname}">上一页</a>
					<a href="${pageContext.request.contextPath }/queryAll?page=${menus.nextPage }&rows=${menus.pageSize}&mname=${menu.mname}">下一页</a>
					<a href="${pageContext.request.contextPath }/queryAll?page=${menus.pages }&rows=${menus.pageSize}&mname=${menu.mname}">尾页</a>
					当前第${menus.pageNum }页
				</td>
			</tr>
	</table>
</body>
</html>