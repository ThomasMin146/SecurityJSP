<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<sec:authentication property="principal.username" var="username"/>

<!DOCTYPE html>
<html>
    <head>
        <title>Welcome Page</title>
    </head>
    <body>

        <h1>Welcome, <%= SecurityContextHolder.getContext().getAuthentication().getName() %>!</h1>
<%--        <h1>Welcome, tom!</h1>--%>
    <sec:authorize access="hasAuthority('ROLE_DMS_LOGIN')" >
        <p>We're glad to have you here, Mr. ${username}.</p>
    </sec:authorize>

<%--    <jsp:include page="include/menu.jsp"/>--%>
    <%@include file="include/menu.jsp"%>

    </body>
</html>