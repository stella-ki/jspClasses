<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String type = request.getParameter("type");
	if(type ==null){
		return;
	}
		
	switch(type){
		case "A":%>
			강한 내구성
			<%
			break;
		case "B":%>
			뛰어난 대처능력
			<%
			break;
		default:%>
			모름
			<%
			break;
	}

%>