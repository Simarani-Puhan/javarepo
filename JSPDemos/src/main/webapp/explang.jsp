<%@page import="org.apache.jasper.runtime.PageContextImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
pageContext.setAttribute("message","welcome");
request.setAttribute("message", "Good day in request");
session.setAttribute("message","Good day in request" );
application.setAttribute("message", "Fun day in application");
%>

${message }

<h2>Using scripting</h2>
<%
String msg1=(String)request.getAttribute("message");
String msg2=(String)session.getAttribute("message");
String msg3=(String)application.getAttribute("message");
%>
<%= msg1 %>
<%=msg2 %>
<%=msg3 %>

${requestScope.message }
${sessionScope.message }
${applicationScope.message }


</body>
</html>