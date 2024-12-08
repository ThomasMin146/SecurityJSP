<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<sec:authentication property="principal.username" var="username"/>
<div id="menu">

    <sec:authorize access="hasAuthority('ROLE_DMS_LOGIN')" >
        <p>We're glad to have you here, Mr. ${username}.</p>
    </sec:authorize>
</div>
