<%@page import="com.regnant.session.BusBean"%> 
<%@page import="java.util.List"%>
<%@page import="com.regnant.session.BusBookingServlet"%>
<%@page import="com.regnant.session.BusDBCRUDOperations"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bus Booking Inc.</title>
<link rel="stylesheet" type="text/css" href="buslist.css">
</head>
<body>
<p class="as"><a href="http://localhost:8080/SessionSample/logout.jsp">Logout</a></p>
<h1>Bus List</h1>

<table>
<thead>
<tr>
<th>ID</th>
<th>SOURCE</th>
<th>DESTINATION</th>
<th>DOJ</th>
<th>TIME</th>
<th>BUS NAME</th>
<th>BUS TYPE</th>
<th>BUS CONDITION</th>
<th>BUS NO</th>
</tr>
</thead>
<%List<BusBean> buslist=(List<BusBean>)request.getAttribute("buslist");
for(BusBean b:buslist){
%>
<tr>
<td><%=b.getId()%></td>
<td><%=b.getBSource()%></td>
<td><%=b.getBDestination()%></td>
<td><%=b.getBDOJ()%></td>
<td><%=b.getBTime()%></td>
<td><%=b.getBName()%></td>
<td><%=b.getBType()%></td>
<td><%=b.getBConditon()%></td>
<td><%=b.getBno()%></td>
<%}%>
</tr>
</table>
</body>
</html>