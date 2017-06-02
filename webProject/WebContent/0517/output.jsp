<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Output test</title>
</head>
<body>

<%

//for POST: if form tag use get method, don have to use
request.setCharacterEncoding("UTF-8");

String id = (String) request.getParameter("id");
String pw = (String) request.getParameter("pwd");

out.println(id);
out.println(pw);

//when jsp compiled, variable request and out is autometically created
%>


</body>
</html>