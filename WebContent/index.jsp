<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RMS</title>
</head>
<body>
	Hello
	<a href="demo">click here</a>
	
	<a href="rooms">Room</a>
	
	User : ${ session.user } <s:property value="#session.user" />
	<br>
	${ errorMessage }
	
	<br><br><br><br>
	
	
	<s:form action="login">
		<s:textfield name="user" label="Username" />
		<s:password name="password" label="Password" />
		<s:submit />
	</s:form>
	
</body>
</html>