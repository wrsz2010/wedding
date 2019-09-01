<%--
  Created by IntelliJ IDEA.
  User: wrsz2
  Date: 01/09/2019
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Person</title>
</head>
<body>
<h1> *** Add Person ***</h1>
<form style="width: 50%;margin:auto;" action="/persons/add" method="post">
    <%--<div width="50%" style="margin:auto">--%>
    <label style="display:inline-block;min-width: 49%;width: 49%;" for="firstNameId">First Name:</label>
    <input style="width: 50%" id="firstNameId" name="firstNameParam" type="text">

    <br/>

        <label style="display:inline-block;min-width: 49%;width: 49%;" for="firstNameId">Last Name:</label>
        <input style="width: 50%" id="lastNameId" name="lastNameParam" type="text">

        <br/>

    <label style="display:inline-block;min-width: 49%;width: 49%;" for="ageId">Age:</label>
    <input style="width: 50%" id="ageId" name="ageParam" type="number" step="1" min="0" max="130">

    <br/>

        <label style="display:inline-block;min-width: 49%;width: 49%;" for="phoneId">Phone:</label>
        <input style="width: 50%" id="phoneId" name="phoneParam" type="text">

        <br/>
    <input style="width: 20%" type="submit">

    <%--</div>--%>
</form>
</body>
</html>
