<%--
  Created by IntelliJ IDEA.
  User: jtao
  Date: 1/6/15
  Time: 12:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>example result</title>
</head>
<body>

${user.name}<br>
${user.password}<br>
${user.email}<br>
${user.location}<br>
${user.gender}<br>
${user.notes}<br>

</body>
<script type="text/javascript" src="<c:url value="/resources/jquery/jquery-1.11.2.js" />"></script>
</html>
