<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<form:form modelAttribute="home" action="homeaction" method="post"> 
<table border="">
                <tr>
                    <td colspan="2" align="center"><h2>Registration</h2></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><form:input path="studentname" /></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><form:input path="age" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
 </table>

 </form:form>
${Dee}
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
