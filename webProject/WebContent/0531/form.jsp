<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form 만들기 :)</title>
</head>
<body>
<!-- 메소드 구현시 !가 붙은 선언부를 사용한다. 요즘은 사실 JSP에 선언부를 잘 사용하지 않는다.  -->
<%!
	public int getInt(){
		return 1;
	}
	
%>
<%
	int sum = 0;
	int maxInt = 100;
	for(int i = 1; i <= maxInt; i++){
		sum += i;
	}
	
%>
	1부터 100까지의 합은 <%= sum %> 입니다.
</body>
</html>