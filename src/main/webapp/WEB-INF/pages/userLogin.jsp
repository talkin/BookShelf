<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jtao
  Date: 1/5/15
  Time: 9:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC form</title>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="http://rawgithub.com/sliptree/bootstrap-tokenfield/master/dist/css/bootstrap-tokenfield.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
</head>

<script type="text/javascript">
    $(document).ready(function () {
        console.log("hehe");
        $('#tags').tokenfield();

        $('button[type="submit"]').attr('disabled', 'disabled');
        $('#name').keyup(function () {
            if ($('#name').val() == "") {
                $('button[type="submit"]').attr('disabled', 'disabled');
            }
            else {
                $('button[type="submit"]').removeAttr('disabled');
            }
        });

        $('userForm').on('reset', function (event) {
            event.preventDefault();
            $('#userForm')[0].reset();
        });
    });
</script>

<body>
<div class="container" style="width: 350px">

    <form:form modelAttribute="userForm" method="post" class="form-horizontal">

        <div class="form-group">
            <label class="control-label" for="tags">Tags</label>

            <div class="input-group">
                <span class="input-group-addon"><span class="glyphicon glyphicon-star"></span></span>
                <input type="text" id="tags" class="form-control" placeholder="Type something"/>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label">Name</label>
            <span class="require">*</span>

            <div class="span6">
                <form:input path="name" cssClass="form-control" placeholder="name"/>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label">Email</label>
            <span class="require">*</span>

            <div class="span6">
                <form:input path="email" cssClass="form-control" placeholder="email"/>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label">Password</label>
            <span class="require">*</span>

            <div class="span6">
                <form:input path="password" cssClass="form-control" placeholder="password"/>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label">Location</label>
            <span class="require">*</span>

            <div class="span6">
                <form:select path="location" cssClass="form-control">
                    <form:option value="Please select"></form:option>
                    <form:option value="WuHan">WuHan</form:option>
                    <form:option value="ChengDu">ChengDu</form:option>
                    <form:option value="BeiJing">BeiJing</form:option>
                </form:select>
            </div>

        </div>

        <div class="form-group">
            <label class="control-label">Gender</label>
            <span class="require">*</span>

            <div class="span6">
                <form:select path="gender" cssClass="form-control">
                    <form:option value="Please select"></form:option>
                    <form:options items="${genders}"/>
                </form:select>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label">Comments</label>
            <span class="require">*</span>

            <div class="span6">
                <form:textarea path="comments" cssClass="form-control" rows="3"/>
            </div>
        </div>

        <div class="form-group">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Remember me
                </label>
            </div>
        </div>

        <div class="form-group">
            <button type="reset" class="btn btn-danger pull-left">
                <span class="glyphicon glyphicon-transfer"></span> Reset
            </button>
            <button type="submit" id="submitRequest" class="btn btn-primary pull-right">
                <span class="glyphicon glyphicon-ok"></span> Submit
            </button>
        </div>

    </form:form>
</div>


<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="http://rawgit.com/sliptree/bootstrap-tokenfield/master/dist/bootstrap-tokenfield.js"></script>
<%--<script type="text/javascript" src="<c:url value="/resources/js/userLogin.js" />"></script>--%>

</body>
</html>
