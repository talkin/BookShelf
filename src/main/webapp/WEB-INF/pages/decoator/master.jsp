<%@ taglib prefix="decorator" uri="http //www.opensymphony.com/sitemesh/decorator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--用统一的的模板样式框架--%>
<html>
<head>
    <title>Hello <decorator:title default="welcome"/></title>
    <decorator:head/>
</head>
<body>

<div>
    <decorator:body/>
</div>

</body>
</html>
