<%-- 
    Document   : prikaz_soba
    Created on : Oct 23, 2016, 9:43:23 PM
    Author     : Darko
--%>

<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <title>IT355DZ02</title>
    </head>
    <body>
        <h2>Podaci o sobi</h2>
        <table>
            <tr>
                <td><spring:message code="numOfBeds" /></td>
                <td>${brojKreveta}</td>
            </tr>
            <tr>
                <td><spring:message code="size" /></td>
                <td>${velicina}</td>
            </tr>
            <tr>
                <td><spring:message code="hasBathroom" /></td>
                <td>${imaKupatilo?"Da":"Ne"}</td>
            </tr>
            <tr>
                <td><spring:message code="hasTv" /></td>
                <td>${imaTv?"Da":"Ne"}</td>
            </tr>
            <tr>
                <td><spring:message code="hasAC" /></td>
                <td>${imaKlima?"Da":"Ne"}</td>
            </tr>
            <tr>
                <td><spring:message code="pricePerDay" /></td>
                <td>${cenaPoDanu}<spring:message code="currency" /></td>
            </tr>
        </table>
    </body>
</html>
