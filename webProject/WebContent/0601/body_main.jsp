<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% 
request.setCharacterEncoding("utf-8");
%>

body_main 전 name 파라미터 값 : <%= request.getParameter("name") %><br/>

<jsp:include page="./body_sub.jsp" flush = "false">
	<jsp:param  name="name" value="최범균"/>
</jsp:include>

include 후 name 파라미터 값 : <%= request.getParameter("name") %><br/>

<!-- 여기에서의 request는 main만의 request이기 때문에 늘 null이다. -->