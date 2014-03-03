<%@ page language="java" contentType="text/html" label=" charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" label=" charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<s:form action="addTenant">		
			<s:textfield name="fname" label="fname" />
		<s:textfield name="mname" label="mname" />
		<s:textfield name="lname" label="lname" />
		<s:textfield name="dob" label="dob" />
		<s:textfield name="permanentAddress" label="permanentAddress" />
		<s:textfield name="idCard" label="idCard" />
		<s:textfield name="workingAs" label="workingAs" />
		<s:textfield name="workingAddress" label="workingAddress" />
		<s:textfield name="contactNum1" label="contactNum1" />
		<s:textfield name="contactNum2" label="contactNum2" />
		<s:textfield name="referenceName" label="referenceName" />
		<s:textfield name="referenceContact" label="referenceContact" />
		<s:textfield name="panNum" label="panNum" />
		<s:textfield name="adhaarNum" label="adhaarNum" />
		<s:textfield name="lastModified" label="lastModified" />
		
		
		<s:submit />
	</s:form>
	
	
</body>
</html>