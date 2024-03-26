<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Tutoring Site - Profile</title>
</head>
<body>
    <div>
        <div>
            <section>
                <h2>User Profile</h2>
                <form action="ProfileServlet" method="post">
                    <!-- Bio Section -->
                    <label for="bio">Bio:</label><br>
                    <textarea name="bio" id="bio" rows="4" cols="50" placeholder="Write your bio here..."></textarea><br>

                    <!-- Categories in Need Section -->
                    <label for="categories">Categories in Need:</label><br>
                    <input type="text" name="categories" id="categories" placeholder="e.g., Math, Science, Programming"><br>

                    <input type="submit" value="Save Changes">
                </form>
            </section>

            <%-- Display user's current information --%>
            <section>
                <h2>Your Current Information</h2>
                <p><strong>Username:</strong> <%= request.getAttribute("name") %></p>
                <p><strong>Last Name:</strong> <%= request.getAttribute("lastName") %></p>
                <p><strong>Role:</strong> <%= request.getAttribute("role") %></p>
            </section>
        </div>
    </div>
</body>
</html>
