<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		//jsp에서 스크립팅 요소는 서버를 통해 바로 출력되는것이 아니라
		//웹 컨테이너를 통해 실행하고 실행한 결과를 서버를 통해 클라이언트에게 출력된다.
		int a =10;
		int b = 20;
		if(a<b){
			out.print(a);
		}else{
			out.print(b);
		}
	%>
	안녕하세요 인덱스 페이지 입니다.
	<br>
	<a href="0106/ex01.jsp">0106/ex01.jsp</a><br>
	<a href="/studyJSP/0106/ex01.jsp">/studyJSP/0106/ex01.jsp</a><br>
	<a href="<%=request.getContextPath()%>/0106/ex01.jsp">/0106/ex01.jsp</a>
	
	<br>
	1~100까지 화면에 출력하기 (jsp 스트립팅-스트립틀릿을 이용하여 출력하기)
	<br>
	<%
		for(int i = 1; i<=100; i++){
			out.println(i);
		}
	%>
	<br>
	<%
		for(int i=1; i<=100; i++){	
	%>
		<%=i %>&nbsp;
	<%
		}
	
		String[] sArray= {"홍길동","김길동","박길동","이길동"};
		//위 sArray를 테이블을 활용하여 화면에 4행 1열로 출력될 수 있도록 해주세요
	%>
	<table border=1>
		<thead>
			<tr>
				<th>sArray</th>
			<tr>
		</thead>
		<tbody>
		<%
			for(int i=0; i<sArray.length; i++){	
		%>
			<tr>
				<td><%=sArray[i]%></td>
			</tr> 
		<% 
			}
		%>
		</tbody>
	</table>
	
	
</body>
</html>