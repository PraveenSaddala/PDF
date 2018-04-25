<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.springframework.web.context.request.RequestScope"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RequestForm</title>
</head>
<body>
	<form id="URL" name="URL" method="POST"	action="http://14.142.129.242/EsignAuth/getEkycDetails">
		<input type="Submit" value="Ashok_Submit" /> 
		<input type="hidden" value="987450726093" name="obj" /> 
		<input type="hidden" name="msg" value='${requestXml}' />
	</form>
</body>
</html>