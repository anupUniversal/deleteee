<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br /><br /><br /><br /><br />
	<s:form action="addRoom">
		<s:textfield name="aroom.roomName" label="room name" />
		<s:textfield name="aroom.type" label="type" />
		<s:textarea  name="aroom.features" label="features" />
		<input action="action" type="button" value="Back" onclick="history.go(-1);" />	<s:submit />
	</s:form>
	
</body>
</html>