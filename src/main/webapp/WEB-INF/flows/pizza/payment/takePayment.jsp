<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017-3-7
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Spizza</title>
        <script type="text/javascript" src="<c:url value="/resources/js/jquery-3.1.1.min.js " />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/takePayment.js" />"></script>
    </head>
    <body>
        <h2>Take Payment</h2>
        <form:form commandName="paymentDetails" name="paymentForm">
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
            <form:radiobutton path="paymentType" value="CASH" label="Cash (taken at delivery)" id="cash" /><br />
            <form:radiobutton path="paymentType" value="CHECK" label="Check (taken at delivery)" id="check" /><br />
            <form:radiobutton path="paymentType" value="CREDIT_CARD" label="Credit Card:" id="creditCard" /><br />

            <form:input path="creditCardNumber" id="creditCardNumber" />
            <br /><br />

            <input type="submit" class="button" name="_eventId_paymentSubmitted" value="Submit" />
            <input type="submit" class="button" name="_eventId_cancel" value="Cancel" />
        </form:form>
    </body>
</html>
