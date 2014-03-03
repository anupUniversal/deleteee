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
	
	<s:form action="addRoom">
		<s:textfield name="roomId" label="room_id" />
		<s:textfield name="tenantid" label="tenant_id" />
		<s:textfield name="electroId" label="electro_id" />
		<s:textfield name="issueOn" label="issue_on" />
		<s:textfield name="electroRates" label="electro_rates" />
		<s:textfield name="deposit" label="deposit" />
		<s:textfield name="exitDate" label="exit_date" />
		<s:textfield name="exitRemarks" label="exit_remarks" />
		<s:textfield name="agreementLetter" label="agreement_letter" />
		<s:textfield name="lastModified" label="last_modified" />
		<s:textfield name="roomRates" label="room_rates" />
		<s:textfield name="status" label="status" />
		
	<s:submit />
	</s:form>
</body>
</html>