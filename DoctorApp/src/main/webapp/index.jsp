<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="doctorServlet" >
   Enter doctorName<input type="text" name="doctorName"><br>
   Enter doctorId<input type="number" name="doctorId"><br>
    <select name="speciality">
   <option value="Dermatology">Dermatology</option>
   <option value="Gyaenocology">Gyaenocology</option>
   <option value="Dentist">Dentist</option>
   </select><br>
   Enter experience<input type="number" name="experience"><br>
   Enter fees<input type="number" name="fees"><br>
   Enter ratings<input type="number" name="ratings"><br>
 
   <input type="submit" value="submit"><br>
</form>

</body>
</html>