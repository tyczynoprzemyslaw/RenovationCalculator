  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	
    <meta charset="UTF-8">
   <title>Renovation Calculator</title>
</head>
<body>
    
  
    <center>
   			<form:form method="post" modelAttribute="RoomDimensions">
   				WAll A:<form:input path="a" type="number"/><br>
   				<form:errors path="a" style="color:red"/></br>
   				WALL B:<form:input path="b" type="number"/><br>
   				<form:errors path="b" style="color:red"/></br>
   				HIGH<form:input path="h" type="number"/><br>
   				<form:errors path="h" style="color:red"/></br>
   				<form:button type="submit" >send</form:button>
   			</form:form>
	
		
</fieldset>
</form>
    </center>
</body>
</html>
