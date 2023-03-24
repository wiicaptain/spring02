<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- "author" "Site"是key，使用後會呼叫出value
"CHaitanya" "Book"
-->
<%
application.setAttribute("author", "CHaitanya");
application.setAttribute("Site","Book");
%>
<a href="display2.jsp">Click</a>
</body>
</html>