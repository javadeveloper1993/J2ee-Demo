<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request Dispatcher Forward Demo</title>
</head>
<body>
<h3>Hello World.</h3>
<div><b>Referer URL : </b><%=response.getHeader("referer") %></div>
</body>
</html>