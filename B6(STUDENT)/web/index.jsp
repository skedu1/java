
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration</title>
        <style>
            body{
                font-family: Arial, sans-serif;
                padding: 20px;
            }
            form{
                max-width: 400px;
                margin: 0 auto;
            }
            label {
                display: inline-block;
                widows: 100px;
                margin-bottom: 5px;
            }
        </style>
    </head>
    <body>
    <center><h1>Registration Page</h1></center>
    <form action="StudInfo.jsp" method="post">
        <label for="regNo"> Regn Num:</label>
        <input type="text" id="regNo" name="regNo" maxlength="30" /><br>
        
        <label for="firstName"> First Name:</label>
        <input type="text" id="firstName" name="firstName" maxlength="30" /><br>
        
        <label for="lastName"> Last Name:</label>
        <input type="text" id="lastName" name="lastName" maxlength="30" /><br>
        
        <label for="course"> Course:</label>
        <input type="text" id="course" name="course" maxlength="30" /><br>
        
        <label for="sem">Sem:</label>
        <input type="text" id="sem" name="sem" maxlength="30" /><br>
        
        <input type="submit" value="Submit" /> 
        <input type="reset" value="Reset" />
    </form> 
</body>
</html>