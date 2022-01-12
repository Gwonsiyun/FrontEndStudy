<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="boardWeb.vo.*" %>
<%
	Member user_ = (Member)session.getAttribute("loginUser");
%>
<%
	request.setCharacterEncoding("UTF-8");
	String searchType = request.getParameter("searchType");
	String searchValue = request.getParameter("searchValue");
	
	String bidx= request.getParameter("bidx");

	String url	= "jdb:oracle:thin:@localhost:1522:xe";
	String user = "system";
	String pass = "1234";
	
	Connection conn	= null;
	PreparedStatement psmt = null;
	ResultSet rs	= null;
	
	String subject_ = "";
	String writer_ = "";
	String content_ = "";
	int bidx_ = 0;
	int midx_ = 0;
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,user,pass);
		
		String sql = " select * from board where bidx = "+bidx;
		
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
		
		if(rs.next()){
			subject_ = rs.getString("subject");
			writer_ = rs.getString("writer");
			content_ = rs.getString("content");
			bidx_ = rs.getInt("bidx");
			midx_ = rs.getInt("midx");
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(conn != null){
			conn.close();		
		}
		if(psmt != null){
			psmt.close();		
		}
		if(rs != null){
			rs.close();		
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/base.css" rel="stylesheet">
</head>
<body>
	<%@ include file="/header.jsp" %>
	<section>
		<h2>게시글 상세조회</h2>
		<article>
			<table border="1" width="70%">
				<tr>
					<th>글제목</th>
					<td colsqan="3"><%=subject_ %></td>
				</tr>
				<tr>
					<th>글번호</th>
					<td><%=bidx_ %></td>
					<th>작성자</th>
					<td><%=writer_ %></td>
				</tr>
				<tr height = "300px">
					<th>내용</th>
					<td colspan="3"><%=content_ %></td>
				</tr>
			</table>
			<button type="button" onclick="location.href='list.jsp?searchType=<%=searchType%>&searchValue=<%=searchValue%>'">목록</button>
			<%if(user_!= null && user_.getMidx() == midx_){ %>
			<button type="button" onclick="location.href='modify.jsp?bidx=<%=bidx_%>&searchType=<%=searchType%>&searchValue=<%=searchValue%>'">수정</button>
			<button type="button" onclick="deleteFn()">삭제</button>
			<%} %>
			<form name="frm" method="post">
				<input type="hidden" name="bidx" value="<%=bidx_%>">
			</form>
		</article>
	</section>
	<%@ include file="/footer.jsp" %>
	<script>//외부로 빼서 사용(보안상의 이유 삭제페이지정보가 넘어가면 안됨)
		function deleteFn(){
			document.frm.action="deleteOk.jsp";
			document.frm.submit();
		}
	</script>
</body>
</html>