<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

</DOCTYPE html>
<html>
<head>
<title>Customer Registration</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<br>
	<hr>
	<h2>Please fill out the form.</h2>
	<hr>

	<form:form action="processForm" modelAttribute="customer">
		<br>
		<br>
		First name (*) <form:input path="firstName" autofocus="true" />
		<form:errors path="firstName" cssClass="error" />
		<br>
		<br>
		Last name (*) <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		Free passes (*) <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br>
		<br>
		Course code <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" />
		<br>
		<br>
		Postal code (*) <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />

		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
	<br>
	<br>
	<hr>
	<h4>(*) means mandatory</h4>

</body>
</html>