<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Tutoring Site - Schedule</title>
    <style>
        #calendar {
            width: 80%;
            margin: auto;
        }
    </style>
</head>
<body>
    <div>
        <div>
            <section>
                <h2>Schedule a Tutoring Session</h2>
                <form action="process-schedule.jsp" method="post">
                    Date: <input type="text" name="date" placeholder="YYYY-MM-DD" required><br>
                    Time: <input type="text" name="time" placeholder="HH:MM AM/PM" required><br>
                    Subject: <input type="text" name="subject" placeholder="Subject" required><br>
                    <input type="submit" value="Schedule Session">
                </form>
            </section>

            <section>
                <h2>Tutoring Calendar</h2>
                <div id="calendar">
                    Calendar goes here.
                </div>
            </section>
        </div>
    </div>
</body>
</html>
