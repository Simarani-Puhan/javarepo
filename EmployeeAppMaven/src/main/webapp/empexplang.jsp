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
<h1>Employee Details</h1>

Welcome ${employee.employeeName }<br>
EmployeeId ${employee.employeeId }<br>
Salary ${employee.salary }<br>
City ${employee.city }<br>

 ${message }<br>
 ${message1 }<br>
 ${sessionScope.message1 }
 
</body>
</html>