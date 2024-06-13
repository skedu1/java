<%-- 
    Document   : StudInfo
    Created on : 29 May, 2024, 7:36:22 PM
    Author     : durga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Register User</title>
    </head>
    <body>
        <jsp:useBean id="stud" scope="session" class="java_beans.Bean">
            <jsp:setProperty name="stud" property="*"/>
        </jsp:useBean>
        <p>Your Registration Number is : <jsp:getProperty name="stud" property="regNo" />.</p>
        <p>Your First Name is : <jsp:getProperty name="stud" property="firstName" />.</p>
        <p>Your Last Name is : <jsp:getProperty name="stud" property="lastName" />.</p>
        <p>Your Course is : <jsp:getProperty name="stud" property="course" />.</p>
        <p>Your Semester is : <jsp:getProperty name="stud" property="sem" />.</p>
       
    </body>
</html>