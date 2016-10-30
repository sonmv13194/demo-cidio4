<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
           <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
	<title><tiles:getAsString name="title" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Phone Market</title>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/prettyPhoto.css" rel="stylesheet">
    <link href="resources/css/responsive.css" rel="stylesheet">
    <link rel="stylesheet" href="resources/css/font-awesome.min.css">
	<link href="resources/stylecss/css.css" rel="stylesheet">

</head>
<body>
<header id="header">
	<tiles:insertAttribute name="header">
	</tiles:insertAttribute>
</header>
<div class="container-fluid">
    <div class="row">
        <div class="container content">
<tiles:insertAttribute name="body">
</tiles:insertAttribute>
</div>
 <div class="col-md-1"></div>
</div>
</div>
<footer id="footer">
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</footer>
</body>
	<script src="resources/jquerry/jquery-3.1.1.js"></script>
	<script src="resources/jquerry/jquery-3.1.1.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
</html>