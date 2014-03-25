<%@ page language="java" contentType="text/html"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" >
<title>Insert title here</title>
</head>
<body>
			<input action="action" type="button" value="Back" onclick="history.go(-1);" />	<s:submit />
	
	<s:form action="addTenant">	
			<s:textfield name="tenant.fname" label="fname" />
		<s:textfield name="tenant.mname" label="mname" />
		<s:textfield name="tenant.lname" label="lname" />
		<s:textfield name="tenant.dob" label="dob" />
		<s:textfield name="tenant.permanentAddress" label="permanentAddress" />
		<s:textfield name="tenant.idCard" label="idCard" />
		<s:textfield name="tenant.workingAs" label="workingAs" />
		<s:textfield name="tenant.workingAddress" label="workingAddress" />
		<s:textfield name="tenant.contactNum1" label="contactNum1" />
		<s:textfield name="tenant.contactNum2" label="contactNum2" />
		<s:textfield name="tenant.referenceName" label="referenceName" />
		<s:textfield name="tenant.referenceContact" label="referenceContact" />
		<s:textfield name="tenant.panNum" label="panNum" />
		<s:textfield name="tenant.adhaarNum" label="adhaarNum" />
		<s:textfield name="tenant.lastModified" label="lastModified" />
		<s:submit />
	</s:form>
	
	
</body>
</html>