<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 선언 부는 햇갈리지 않기 위해서 처음에 작성한다. -->
<%!
	public String printIDPW(String id, String pw){
		String result = "";
		for(int i = 0; i<10; i++){
			result += id + " " + pw + "<br/>";
		}
		return result;
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("id");
String pw=request.getParameter("pw");
%>
<%=printIDPW(id,pw)%>
</body>
</html>