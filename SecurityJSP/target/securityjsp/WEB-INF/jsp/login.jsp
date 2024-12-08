<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<%--    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />--%>
<%--    <meta name="X-CSRF-Token" content="${_csrf.token}"/>--%>

    <title>Login Title</title>

<%--    <base href="${pageContext.request.contextPath}/" />--%>

<%--    <link rel="stylesheet" href="resources/css/font.roboto.css" type="text/css" media="print, projection, screen" />--%>
<%--    <link rel="stylesheet" href="resources/css/theme/login.css" type="text/css" media="print, projection, screen" />--%>
</head>
<body>
<div class="content">
    <div class="panel">
<%--        <div class="logo">--%>
<%--            <img src="resources/images/login.png">--%>
<%--        </div>--%>


        <%
            Exception error = ((Exception) session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION"));
            if (error != null && request.getParameter("error") != null) {
        %>
        <div class="alert alert-danger">
            <%= error.getMessage() %>
        </div>
        <%
            }
        %>

        <form name='f' action="login" method='POST'>
            <div class="form-group">
                <label class="label-control">
                    <span class="label-text">Meno</span>
                </label>

                <div>
                    <input class="form-control" type='text' name='username' value='' />
                </div>
            </div>

            <div class="form-group mt-2">
                <label class="label-control">
                    <span class="label-text">Heslo</span>
                </label>

                <div>
                    <input class="form-control" type='password' name='password' />
                </div>
            </div>

            <input class="btn w-100 mt-5" name="submit" type="submit" value="Prihlásiť do aplikácie">
        </form>
    </div>
</div>
</body>
</html>
