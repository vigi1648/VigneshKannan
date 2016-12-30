<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="FormServlet">
<h2>Registration</h2>
<p style="background-color:#66CCFF">

User name or password is incorrect,${requestScope.user}

<b>User Name</b>
<input type="text" name="userName" required="true"/><br><br>

   Password:<input type="password" name="pass" /><br/>
        
          

<b>Email id:</b>
<input type="email" name="mail" required placeholder='Enter a valid e-mail address'/><br><br>


<input type="Submit" value="Submit"/>
 <h1><input type="Reset" value="Reset"/></h1>
</form>
</body>
</html>