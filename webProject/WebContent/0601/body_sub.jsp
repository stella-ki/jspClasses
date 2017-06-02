<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
body_sub에서 name 파라미터 값: <%= request.getParameter("name")  %>
<br/>
name 파라미터 값 목록:
<ul>
<%
String[] names = request.getParameterValues("name");
for(String name: names){
%>
	<li> <%=name %></li>

<%
}
%>
</ul>

<!-- main에서 name을 읽어왔고, request는 main으로 부터 왔기 때문에 값이 존재한다.-->