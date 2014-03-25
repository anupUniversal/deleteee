<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RMS</title>
<script type="text/javascript">
    
function show()
{
	popupWindow = window.open('/EasyLease/forms/addRoom.jsp', "_top", 
			"directories=no, status=no, menubar=no, scrollbars=yes, resizable=no,width=600, height=280,top=200,left=200");
}
</script>
</head>
<body>
	<br /><br /><br />
	<p>	
	<a href="/EasyLease">Home</a>
	Room statistics : <input type="button" onclick="show()" value="Add Room">  
	</p>
	<br /><br />
	<s:form action="deleteRoom">
	<s:submit value="delete" />
	
	<%-- <s:checkboxlist label="What's your favor color" list="roomStat" listKey="type"   name="yourColor" /> --%>
	
	<table border="1" >
		<tr>
			
			<!-- <th> Number </th> -->
			 <th> Name </th>
			  <th> Type  </th>  
			  <th> Features  </th>
			  <th> delete </th> 
		</tr>
			
				<s:iterator var="room" value="roomStat">
		<tr>
						<%-- <td> ${ room.id }	</td> --%>
						<td> ${ room.type } </td>
						<td> ${ room.roomName } </td>
						<td> ${ room.features } </td>
						<td> <input type="checkbox" name="selectedItems" value="${room.id}"> </td>			
					</tr>
					
				</s:iterator>
	</table>
	</s:form>
</body>
</html>