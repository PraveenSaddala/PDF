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
<title>NSDL Home</title>
</head>
<body>
	<form:form method="POST" modelAttribute="fileBean" enctype="multipart/form-data" action="${pageContext.request.contextPath}/nsdl/fileupload">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>Aadhaar No</td>
				<td><input type="text" name="uid"/></td>
			</tr>
			<tr>
				<td>Select a file to upload</td>
				<td><input type="file" name="multipartFile" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Upload" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>