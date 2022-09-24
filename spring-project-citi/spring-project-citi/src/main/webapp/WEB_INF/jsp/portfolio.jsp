<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "spring_jsp_demo";
String userId = "root";
String password = "gouravi";

try {
	Class.forName(driverName);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<html>
<head>
<title>Portfolio</title>
<style type="text/css">
<%@ include file="style.css" %>
</style>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css">

</head>
<body
	style="background-color: #8EC5FC; background-image: linear-gradient(129deg, #8EC5FC 0%, #E0C3FC 100%);">

	<form method="post" action="welcome">
		<div class="menu-wrap">
			<input type="checkbox" class="toggler" />
			<div class="hamburger">
				<div></div>
			</div>
			<div class="menu">
				<div>
					<div>
						<ul>
							<li><a href="welcome">Home</a></li>
							<li><input type="submit" name="Auto"
								value="Automobile and Auto Components" id="auto1"
								class="no-outline" /></li>
							<li><input type="submit" name="Auto"
								value="Fast Moving Consumer Goods" id="fast1" class="no-outline" /></li>
							<li><input type="submit" name="Auto"
								value="Financial Services" id="finance1" class="no-outline" /></li>
							<li><input type="submit" name="Auto" value="Healthcare"
								id="health1" class="no-outline" /></li>
							<li><input type="submit" name="Auto"
								value="Information Technology" id="it1" class="no-outline" /></li>
							<li><input value="My portfolio" type="submit" name="Auto"
								class="no-outline" /></li>
							<li><input value="Log out" type="submit" name="Auto"
								class="no-outline" /></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</form>
	<header class=" ">
		<div class="container portFolio">
			<h2 align="center">
				<font><strong>My Portfolio</strong></font>
			</h2>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Stock Name</th>
						<th scope="col">Quantity bought</th>
						<th scope="col">Total Price</th>

					</tr>
				</thead>
				<tbody>
					<%
					try {
						connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
						statement = connection.createStatement();
						String sql = "SELECT * FROM userhistory";

						resultSet = statement.executeQuery(sql);
						while (resultSet.next()) {
								%>
								<tr>
									<td><%=resultSet.getString("stockname")%></td>
									<td><%=resultSet.getString("quantity")%></td>
									<td><%=resultSet.getDouble("totalprice")%></td>
								</tr>
			
								<%
							}
					} catch (Exception e) {
					e.printStackTrace();
					}
					%>
				</tbody>


			</table>
		</div>

	</header>
</html>