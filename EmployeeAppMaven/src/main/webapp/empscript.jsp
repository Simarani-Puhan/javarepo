<%@page import="com.employeeapp.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Employee employee=(Employee)request.getAttribute("employee");%>
<%="Welcome "+employee.getEmployeeName() %><br>
<%= "Id "+employee.getEmployeeId() %><br>
<%= "Salary "+employee.getSalary() %><br>
<%= "City "+employee.getCity() %><br>
 
</body>
</html>