<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	// 초기화 파라미터값 조회
	/*
		web.xml에서 아래와 같이 설정한 정보는 ServletContext객체에 초기화 파라미터 값으로 저장된다.
	
		 <context-param>
			 <param-name>adminEmail</param-name>
			 <param-value>admin@gmail.com/</param-value>
		 </context-param>
		 <context-param>
			 <param-name>adminTel</param-name>
			 <param-value>010-1234-5678</param-value>
		 </context-param>
	*/
	
	String email = application.getInitParameter("adminEmail");
	String tel = application.getInitParameter("adminTel");
%>
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
	<h1>초기화 파라미터값 조회</h1>
	
	<h3>초기화 파라미터</h3>
	<dl>
		<dt>관리자 이메일</dt><dd><%=email %></dd>
		<dt>관리자 전화번호</dt><dd><%=tel %></dd>
	</dl>
</div>
</body>
</html>