
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SDET- WEB DEVELOPMENT</title>
<link rel="stylesheet" href="../../css/style.css"></link>
</head>

<body>
    <img alt="sdet-web-training" src="../../images/web-dev-2.png">
    <h2 class="hclass">Welcome to Java Web Development Training</h2>
    <hr>
    <div id="f1">
        <h3>Submit your feedback :</h3>
        <form action="thankyou" method="get">
            <p>
                <label for="name">Name:</label><input id="name" type="text" name="name">
            </p>
            <p>
                Mode:<input type="radio" name="mode" value="online">Online 
                <input type="radio" name="mode" value="class-room">Classroom
            </p>
            <p>
                Rating: 
                <select name="rating">
                    <option value="1">&#9734;</option>
                    <option value="2">&#9734;&#9734;</option>
                    <option value="3">&#9734;&#9734;&#9734;</option>
                    <option value="4">&#9734;&#9734;&#9734;&#9734;</option>
                    <option value="5">&#9734;&#9734;&#9734;&#9734;&#9734;</option>
                </select>
            </p>
            <p>Feedback:
              <textarea name="feedback" placeholder="Your feedback goes here..." 
              rows="5" cols="50"></textarea>
            </p>

            <input type="submit" value="Submit">
            <button type="reset">Reset</button>
        </form>
    </div>
    <div id="content">
        <h3>Training Participants :</h3>
        <c:choose>
            <c:when test="${not empty studentList}">
                <table>
                    <tr>
                        <th>S.No.</th>
                        <th>Name</th>
                        <th>Experience</th>
                    </tr>
                    
                    <c:forEach var="participant" items="${studentList}" varStatus="counter">
                        <tr>
                            <td>${counter.count}.</td>
                            <td>${participant.name}</td>
                            <td>${participant.exp}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:when>
            <c:otherwise>
                <p class="error">No participants are enrolled yet!</p>
            </c:otherwise>
        </c:choose>
    </div>
    <div id="main">
        <h3>Course Outline :</h3>
        <p>This training will cover these topics:</p>
        <ul>
            <li>Web Introduction</li>
            <li>HTML/CSS</li>
            <li>Servlets/JSP</li>
            <li>Spring Framework
                <ol>
                    <li>Spring Core</li>
                    <li>Spring Boot</li>
                    <li>Spring MVC</li>
                    <li>Spring JDBC</li>
                </ol>
            </li>
        </ul>
    </div>
    
    <footer>
        <p>
            Checkout our courses @ <a href="https://devlabsalliance.com"
                target="_blank">DevLabs.com</a><br>&copy; 2019 DevLabsAlliance Pvt. Ltd.
        </p>
    </footer>
</body>
</html>
