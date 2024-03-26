<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Tutoring Site</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #4CAF50;
            color: white;
            padding: 15px;
            text-align: center;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        nav {
            display: flex;
        }

        nav a {
            margin: 0 10px;
            color: white;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to Student Tutoring Site</h1>
        <nav>
            <%-- Check if the user is logged in to decide which links to show --%>
           <% if (session.getAttribute("firstName") == null) { %>
    <a href="login.jsp">Login</a>
    <a href="register.jsp">Register</a>
<% } else { %>
    <a href="profile.jsp">Profile</a>
    <a href="LogoutServlet">Logout</a>
<% } %>

        </nav>
    </header>
</body>
</html>
