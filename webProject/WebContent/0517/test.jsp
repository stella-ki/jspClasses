<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pw = request.getParameter("pwd");
String age = request.getParameter("age");
String tel = request.getParameter("tel");
String mobile = request.getParameter("mobile");

out.println("�Է��Ͻ� ID��\t" + id + "<br>");
out.println("�Է��Ͻ� pwd��\t" + pw + "<br>");
out.println("�Է��Ͻ� age��\t" + age + "<br>");
out.println("�Է��Ͻ� tel��\t" + tel + "<br>");
out.println("�Է��Ͻ� mobile��\t" + mobile + "<br>");

%> 
</body>
</html>