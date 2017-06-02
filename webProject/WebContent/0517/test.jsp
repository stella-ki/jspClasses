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

out.println("입력하신 ID는\t" + id + "<br>");
out.println("입력하신 pwd는\t" + pw + "<br>");
out.println("입력하신 age는\t" + age + "<br>");
out.println("입력하신 tel는\t" + tel + "<br>");
out.println("입력하신 mobile는\t" + mobile + "<br>");

%> 
</body>
</html>