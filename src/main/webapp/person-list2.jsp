<%@ page import="com.javadub1.organizer.model.Person" %>
<%@ page import="java.util.List" %><%--
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
<table width="100%" border="1">
    <tr>
        <th>Id:</th>
        <th>Imie:</th>
        <th>Nazwisko:</th>
        <th>Wiek:</th>
        <th>Address:</th>
        <th>Telefon:</th>
        <th>Czy wyslano:</th>
        <th>Czy potwierdzone:</th>
    </tr>
    <%
        List<Person> personList = (List<Person>) request.getAttribute("personListAttribute");
        for (Person person : personList) {
            out.print("<tr>");
            out.print("<td>" + person.getId() + "</td>");
            out.print("<td>" + person.getFirstName() + "</td>");
            out.print("<td>" + person.getLastName() + "</td>");
            out.print("<td>" + person.getAge() + "</td>");
            out.print("<td>" + person.getAddress() + "</td>");
            out.print("<td>" + person.getPhoneNumber() + "</td>");
            out.print("<td>" + "czy wyslane" + "</td>");
            out.print("<td>" + "czy potwierdzone" + "</td>");
            out.print("</tr>");
        }
    %>
</table>


</body>
</html>
