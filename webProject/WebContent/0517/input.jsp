<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<!-- 
form tag에 method를 적지 않으면 get 방식이다. 
name, type, action, method등을 properties라고 부른다.

-->

<form name = "form1" action = "./output.jsp" method = "POST">
<input type = "text" name = "id" id = "id"/><br/>
<input type = "text" name = "pwd" id = "pwd"/><br/>
<input type = "submit" value ="회원가입"/>
</form>


</body>
</html>