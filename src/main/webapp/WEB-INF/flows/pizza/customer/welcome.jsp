<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017-3-3
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Spizza</title>
    </head>
    <body>
        <h2>Welcome to Spizza!</h2>
        <form:form>
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
            <input type="text" name="phoneNumber" /><br />
            <input type="submit" name="_eventId_phoneEntered" value="Lookup Customer" />
        </form:form>
    </body>
</html>
