<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/base.css" rel="stylesheet">
</head>
<body>
	<%@ include file="header.jsp" %>
	<section>
		<a href="board/list.jsp">게시판으로 이동</a>
		<a href="member/list.jsp">회원게시판으로 이동</a>
	</section>
	<%@ include file="footer.jsp" %>
</body>
</html>