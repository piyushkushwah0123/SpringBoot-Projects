<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<html>

	<head>
		<title>Welcome to Application</title>
	</head>

	<body>
		<h2>Welcome to Application !</h2>
		<p>
			Id : ${object.userId}<br />
			Name : ${object.userName} <br />
			Role : ${object.userRole} <br />
			Full Data : ${object}
		</p>
		<table border=1>
			<tr>
				<th>Id</th>
				<th>NAME</th>
				<th>ROLE</th>
			</tr>

			<c:forEach var="ob" items="$(listOfObject)">
				<tr>
					<td>${ob.UserId}</td>
					<td>${ob.UserName}</td>
					<td>${ob.UserRole}</td>
				</tr>
	</body>

	</html>