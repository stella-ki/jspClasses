<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext 기본 객체</title>
</head>
<body>
<%
HttpServletRequest req = (HttpServletRequest) pageContext.getRequest();
%>
request 기본 객체와 pageContext.getRequest()의 동일 여부:
<%= request == req %>
<br>

pageContext.getOut() 메서드를 사용한 데이터 출력:

<% pageContext.getOut().println("안녕하세요?!"); %>

</body>
</html>