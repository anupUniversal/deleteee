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
	
	<s:form action="addEmeter">
		<s:textfield name="mNum" label="room name" />
		<s:textfield name="deployedOn" label="type" />
		<s:textfield name="recording" label="features" />
		<s:textfield name="receipt" label="receipt"/>
		<s:submit />
	</s:form>
	
	
</body>
</html>