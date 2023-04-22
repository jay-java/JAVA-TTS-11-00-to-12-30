<%@page import="dao.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

  <%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);

  if(session.getAttribute("data")==null)
      response.sendRedirect("login.jsp");
  %> 

	<%
	User u = null;
	if (session.getAttribute("data") != null) {
		u = (User) session.getAttribute("data");
	} else {
		response.sendRedirect("login.jsp");
	}
	%>

	Welcome,
	<%=u.getName()%>

	<div class="container">
		<h2 class="text-center">User Table</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Contact</th>
					<th>Address</th>
					<th>Email</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<User> list = UserDao.getAllUsers();
				%>
				<%
				for (User u1 : list) {
				%>
				<tr>
					<td><%=u1.getId()%></td>
					<td><%=u1.getName()%></td>
					<td><%=u1.getContact()%></td>
					<td><%=u1.getAddress()%></td>
					<td><%=u1.getEmail()%></td>
					<td><%=u1.getPassword()%></td>
					<td><form action="UserController" method="post">
							<input type="hidden" name="id" value="<%=u1.getId()%>">
							<input type="submit" name="action" value="edit">
						</form></td>
					<td><form action="UserController" method="post">
					<input type="hidden" name="id" value="<%=u1.getId()%>">
							<input type="submit" name="action" value="delete">
						</form></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
	<div class="text-center">
		<h1>
			<a href="logout.jsp">Logout</a>
		</h1>
	</div>



</body>
</html>