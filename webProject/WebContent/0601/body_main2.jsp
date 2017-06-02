<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% 
request.setCharacterEncoding("utf-8");
%>

body_main 전 name 파라미터 값 : <%= request.getParameter("name") %><br/>
body_main 전 key 파라미터 값 : <%= request.getParameter("key") %><br/>

<jsp:include page="./body_sub2.jsp" flush = "false">
	<jsp:param  name="name" value="최범균"/>
	<jsp:param  name="key" value="열쇠"/>
</jsp:include>
