<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>
<script>
	var clickBtn;
	function callList(){
		$.ajax({
			url: "ajaxList.jsp",
			type: "get",
			success: function(data){
				var json = JSON.parse(data.trim());
				console.log(json);
				var html = "";
				html += "<table border='1'>";
				html += "<thead>";
				html += "<tr>";
				html += "<th>글번호</th><th>제목</th><th>작성자</th><th> </th>";
				html += "</tr>";
				html += "</thead>";
				html += "<tbody>";
				for(var i=0; i<json.length; i++){
					html += "<tr>";
					html += "<td>"+json[i].bidx+"</td>";
					html += "<td>"+json[i].subject+"</td>";
					html += "<td>"+json[i].writer+"</td>";
					html += "<td><button onclick='modify("+json[i].bidx+",this)'>수정</button><button onclick='deleteFn("+json[i].bidx+",this)'>삭제</button></td>";
					html += "</tr>";
				}
				html += "</tbody>";
				html += "</table>";
				$("#list").html(html);
			}
		});
	}
	/*
		$.ajax({
			url : "경로",
			type : "메소드",
			data : "파라미터형식으로 된 데이터" -> "bidx=5",	<-요청 경로에서 데이터는 request.getparameter("bidx");로 찾을 수 있다.
			success : function(data){
				
				}
		});
	
	*/
	function modify(bidx,obj){
		clickBtn = obj;
		$.ajax({
			url : "ajaxView.jsp",
			type : "get",
			data : "bidx="+bidx,
			success : function(data){
				var json = JSON.parse(data.trim());
				var subject = json[0].subject;
				var writer = json[0].writer;
				var content = json[0].content;
				var bidx = json[0].bidx;
				$("input[name=subject]").val(subject);
				$("input[name=writer]").val(writer);
				$("textarea:eq(0)").val(content);
				$("input[type=hidden]").val(bidx);
			}
			
		});
	}
	function save(){
		//저장버튼 클릭시 ajax를 이용하여 해당 데이터 수정
		//1.form태그 안에 입력한 입력양식 데이터 가져오기
		//2.modify.jsp로 ajax를 통하여 1번의 데이터를 전송
		//3.modify.jsp에서는 board 테이블 수정작업
		var subject = $("input[name=subject]").val();
		var writer = $("input[name=writer]").val();
		
		$.ajax({
			url : "modify.jsp",
			type : "get",
			data : "bidx="+$("input[type=hidden]").val()+
					"&subject="+$("input[name=subject]").val()+
					"&writer="+$("input[name=writer]").val()+
					"&content="+$("textarea:eq(0)").val(),
					//&("form").serialize(),
			success:function(data){
				if(data>0){
					alert('수정완료!');
				}else{
					alert('수정실패!');
				}
				
				$(clickBtn).parent().prev().text(writer);
				$(clickBtn).parent().prev().prev().text(subject);
			}
					
		});
	}
	function deleteFn(bidx,obj){
		$.ajax({
			url : "delete.jsp",
			type : "post",
			data : "bidx="+bidx,
			
			success:function(data){
				if(data>0){
					alert('삭제완료!');
					
					$(obj).parent().parent().remove();
					
				}else{
					alert('삭제실패!');
				}
			}
			
		});
	}
</script>
</head>
<body>
	<button onclick="callList()">목록 출력</button>
	<h2>ajax를 이용한 게시판 구현</h2>
	<div id="list">
	
	</div>
	<div id="write">
		<form>
			<p>
				<label>
					제목 : <input type="text" name="subject" size="50">
				</label>
			</p>
			<p>
				<label>
					작성자 : <input type="text" name="writer">
				</label>
			</p>
			<p>
				<label>
					내용 : <textarea type="content" name="content"></textarea>
				</label>
			</p>
			<input type="hidden" name="bidx">
			<input	onclick="save()" type="button" value="저장">
			
		</form>
	</div>
</body>
</html>