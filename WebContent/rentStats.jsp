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
	<br /> <br />
	Room statistics :
	<br /> <br /> <br />
	<table border="1">
		<tr> <th> Number </th>  <th> Name </th> <th> Type  </th>  <th> Features  </th> </tr>
			<s:iterator var="room" value="roomStat">
				<tr>
				<td> ${ room.id }	</td>
				<td> ${ room.type } </td>
				<td> ${ room.roomName } </td>
				<td> ${ room.features } </td>
				</tr>
			</s:iterator>
	</table>
</body>
</html>