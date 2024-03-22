<%@page import="com.doctorapp.model.Doctor"%>
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
Doctor doctor=(Doctor)request.getAttribute("doctor");
String doctorName=doctor.getDoctorName();
out.println("doctorName :"+doctorName+"<br>");
Integer doctorId=doctor.getDoctorId();
out.println("doctorId :"+doctorId+"<br>");
String speciality=doctor.getSpeciality();
out.println("speciality :"+speciality+"<br>");
Integer experience=doctor.getExperience();
out.println("experience :"+experience+"<br>");
double fees=doctor.getFees();
out.println("fees :"+fees+"<br>");
Integer ratings=doctor.getRatings();
out.println("ratings :"+ratings+"<br>");
%>

</body>
</html>