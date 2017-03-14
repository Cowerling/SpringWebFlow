<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017-3-3
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Customer Registration</title>
    </head>
    <body>
        <h2>Customer Registration</h2>
        <form:form commandName="customer">
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
            <b>Phone Number: </b><form:input path="phoneNumber" /><br />
            <b>Name: </b><form:input path="name" /><br />
            <b>Address: </b><form:input path="address" /><br />
            <b>City: </b><form:input path="city" /><br />
            <b>State: </b><form:input path="state" /><br />
            <b>Zip Code: </b><form:input path="zipCode" /><br />
            <input type="submit" name="_eventId_submit" value="Submit" />
            <input type="submit" name="_eventId_cancel" value="Cancel" />
        </form:form>
    </body>
</html>
