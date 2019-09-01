<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<%--
  Created by IntelliJ IDEA.
  User: wrsz2
  Date: 01/09/2019
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person List</title>
</head>
<body>

<h1>Person List</h1>
<a href="/persons/add">Add</a>
<table width="100%" border="1">
    <tr>
        <th bgcolor="#faebd7">Id:</th>
        <th bgcolor="#faebd7">Imie:</th>
        <th bgcolor="#faebd7">Nazwisko:</th>
        <th bgcolor="#faebd7">Wiek:</th>
         <th bgcolor="#faebd7">Telefon:</th>
        <th bgcolor="#faebd7">Action:</th>
    </tr>
    <c:forEach var="person" items="${requestScope.personListAttribute}">
    <tr>
        <td align="center">${person.id}</td>
        <td align="center">${person.firstName}</td>
        <td align="center">${person.lastName}</td>
        <td align="center">${person.age}</td>
        <td align="center">${person.phoneNumber}</td>
        <td><a href="/persons/remove?orderId=${person.id}">Usun</a></td>
    </tr>
    </c:forEach>

</table>

</body>
</html>
