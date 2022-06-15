<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lets grab a drink?</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    
</head>
<body>
	♥♥♥♥	&#x1F498;
   <h1>Hello John</h1>

   <h2>Would you like to grab a drink?</h2>
   ♥♥♥♥ 	&#x1F498;
   <h1>Fruit Store</h1>
    <table>
        <tablehead>
            <tr>
                <th>Name</th>
                <th>Price</th>
            </tr>
        </tablehead>
        <tablebody>
            <c:forEach var="fruit" items="${fruits}">
                <tr>
                    <td><c:out value="${fruit.name}"/></td>
                    <td><c:out value="${fruit.price}"/></td>
                </tr>
            </c:forEach>
        </tablebody>
    </table>
 
</body>
</html>
