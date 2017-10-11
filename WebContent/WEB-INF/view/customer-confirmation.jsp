<!--  
	%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 -->

<!DOCTYPE html>

<html>
<head>
<title>Customer confirmation</title>
</head>
<body>

	<h1>Customer confirmation</h1>
	<hr>
	<br>
	<br>
	<div>
		<p>Customer "${customer.firstName} ${customer.lastName}" has been
			registered successfully :-)</p>
		<p>Number of free passes: ${customer.freePasses}</p>
		<p>Course code: ${customer.courseCode}</p>
		<p>Postal code: ${customer.postalCode}</p>
		<hr>
		<br>
		<br>
		<p>
			<a href="../">back to menu</a>
		</p>

	</div>

</body>
</html>