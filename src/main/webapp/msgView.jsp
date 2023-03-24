<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
    <%@page import="Model.UserMessage" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Object obj=request.getAttribute("message");
List<UserMessage> data=(List<UserMessage> ) obj;
%>

<%for(UserMessage o:data){
	
	out.println(o.toString());
} %>

</body>
</html>