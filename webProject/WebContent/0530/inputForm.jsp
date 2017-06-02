<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="./output.login" method="get">
	<input type = "text" id = "id" name = "id"><br>
	<input type = "password" id = "pw" name = "pw"><br>
	<input type = "text" name = "action" id = "action" value = "login" disabled=true/><br>
	<!-- 서비스를  login이라고 클라이언트 단에서 알려주기 위해서 추가한 것이다.  -->
	<input type = "submit" value="register">
</form>
</body>
</html>