<%-- 
    Document   : soba
    Created on : Oct 23, 2016, 9:09:09 PM
    Author     : Darko
--%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h2>Unesite informacije o sobi</h2>
<form:form method="POST" action="/DarkoMisic2305/addSoba">
    <table>
        <tr>
            <td><form:label path="brojKreveta"><spring:message code="numOfBeds" /></form:label></td>
            <td><form:input path="brojKreveta" /></td>
        </tr>
        <tr>
            <td><form:label path="velicina"><spring:message code="size" /></form:label></td>
            <td><form:input path="velicina" /></td>
        </tr>
        <tr>
            <td><form:label path="imaKupatilo"><spring:message code="hasBathroom" /></form:label></td>
            <td><form:checkbox path="imaKupatilo" /></td>
        </tr>
        <tr>
            <td><form:label path="imaTv"><spring:message code="hasTv" /></form:label></td>
            <td><form:checkbox path="imaTv" /></td>
        </tr>
        <tr>
            <td><form:label path="imaKlima"><spring:message code="hasAC" /></form:label></td>
            <td><form:checkbox path="imaKlima" /></td>
        </tr>
        <tr>
            <td><form:label path="cenaPoDanu"><spring:message code="pricePerDay" /></form:label></td>
            <td><form:input path="cenaPoDanu" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Pošalji"/>
            </td>
        </tr>
    </table>
</form:form>