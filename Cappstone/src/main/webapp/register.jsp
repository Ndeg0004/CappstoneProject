<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Tutoring Site - Register</title>
</head>
<body>
    <div>
        <div>
            <section>
                <h2>Register</h2>
                <form action="RegisterServlet" method="post">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" required><br> 
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" required><br>
                    
                    <label for="email">Email:</label>
                    <input type="text" id="email" name="email" required><br>

                    <label for="lastname">Last Name:</label>
                    <input type="text" id="lastname" name="lastname" required><br>

                    <label>Select Role:</label>
                    <div>
                        <button type="button" onclick="setRole('student')">Student</button>
                        <button type="button" onclick="setRole('tutor')">Tutor</button>
                        <input type="hidden" id="role" name="role" value="" required>
                    </div>

                    <input type="submit" value="Register">
                </form>

                <script>
                    function setRole(role) {
                        document.getElementById("role").value = role;
                    }
                </script>
            </section>
        </div>
    </div>
</body>
</html>
