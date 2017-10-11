<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE hmtm>
<html>
<head>
<title>Student Registration</title>
</head>
<body>
	<h1>Student Registration</h1>
	<hr>
	<div>
		<form:form action="regConfirmation" modelAttribute="student">
			<br>
		First name: <form:input path="firstName" autofocus="true"/>
			<br>
			<br>
		Last name: <form:input path="lastName" />
			<br>
			<br>
		Country: 
			<form:select path="country">
				<form:options items="${theCountries}" />
			</form:select>
			<br>
			<br>
		Your favorite language:
			<br>
			<form:radiobutton path="favoriteLanguage" value="Java" /> Java<br>
			<form:radiobutton path="favoriteLanguage" value="C++" /> C++<br>
			<form:radiobutton path="favoriteLanguage" value="NodeJS" /> NodeJS<br>
			<form:radiobutton path="favoriteLanguage" value="c#" /> C#<br>
			<br>
			<br>
		Your operating systems:<br>
			<form:checkbox path="myOperatingSystems" value="Linux" /> Linux<br>
			<form:checkbox path="myOperatingSystems" value="Windows" /> Windows<br>
			<form:checkbox path="myOperatingSystems" value="Mac OS" /> Mac OS<br>
			<br>
			<br>
			
			<input type="submit" name="Submit" />
		</form:form>
	</div>
</body>
</html>