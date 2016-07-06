<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page import = "java.io.File" %>

<html lang="en">

<head>

<% for(String name : new File("C:/Users/Michael/Desktop/code/fasttrackd-next/assignments/java/example/src/main/resources/static/imports").list()) { %>
<script src="imports/<%= name %>"></script>
<% } %>

</head>

<body>
	jsp activated
</body>

</html>