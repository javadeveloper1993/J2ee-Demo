<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Session Technique : Http Session With Attribute</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/addHttpSessionWithAttribute">
  <div>
  	<div style="width:10%;float:left;">First Name:</div>
  	<div style="float:left;"><input type="text" name="firstName" autocomplete="off"/></div>
  </div>
  <div style="clear: both;"></div>
  <br>
  <div>
  	<div style="width:10%;float:left;">Last Name :</div>
  	<div style="float:left;"><input type="text" name="lastName" autocomplete="off"/></div>
  </div>
  <div style="clear: both;"></div>
  <br>
  <div>
  	<div style="margin-left: 10%;"><input type="submit" value="submit"></div>
  </div>
</form>
</body>
</html>