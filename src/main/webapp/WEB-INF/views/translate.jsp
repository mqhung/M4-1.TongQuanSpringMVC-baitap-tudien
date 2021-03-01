<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translate</title>
</head>
<body>
<form method="post" action="">
    <input type="text" name="search"><br>
    <input type="submit" value="Translate">
</form>
<h1>Result is: ${result}</h1>
<c:if test="${result==null}">
    <h1>Word not found.</h1>
</c:if>
</body>
</html>
