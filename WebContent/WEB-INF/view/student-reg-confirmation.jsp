<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
	<h1>Student Confirmation</h1>
	<hr>
	<p>
		The student "${student.firstName} ${student.lastName}" is confirmed <br>
		<br> Country: ${student.country}<br> Favorite Language:
		${student.favoriteLanguage}<br> Operating systems: 

		<c:forEach var="temp" items="${student.myOperatingSystems}">
			${temp}, 
		</c:forEach>
	</p>

	<hr>
	<p>
		<a href="../">back to menu</a>
	</p>
</body>
</html>