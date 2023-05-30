<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
<title></title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
</head>
<body>
<div class="container">
	<h1>속성값 확인하기</h1> 
	
<%
	// 요청객체에 저장된 속성값 조회하기
	String value1 = (String) request.getAttribute("n1");

	// 세션객체에 저장된 속성값 조회하기
	String value2 = (String) session.getAttribute("n2");
	
	// 애플리케이션객체에 저장된 속성값 조회하기
	String value3 = (String) application.getAttribute("n3");
%>
	<p>요청객체의 속성값 조회: <%=value1 %></p>	
	<p>세션객체의 속성값 조회: <%=value2 %></p>	
	<p>애플리케이션객체의 속성값 조회: <%=value3 %></p>	
</div>
</body>
</html>