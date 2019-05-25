<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcomeuser</title>
<link rel="stylesheet" type="text/css" href="bus.css">
</head>
<body>
<%String name=request.getParameter("uname"); %>
<h1>Hello <%=name %>!! You have logged in succesfully!</h1>
<p class="as"><a href="http://localhost:8080/SessionSample/logout.jsp">Logout</a></p>

<form action="BusBookingServlet" class="form" method=get>
Source: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Destination:<br>
<input type="text" name="bsource">
<input type="text" name="bdestination"><br><br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp DOJ:<input type="date" name="doj">
<input type="submit" value="submit">
</form>

<form action="ACContext" method="get">
<pre>
AC/NON-AC:
<input type="text" name="ac/non_ac">
<input type="submit" value="submit">
</pre>
</form>

</body>
</html>