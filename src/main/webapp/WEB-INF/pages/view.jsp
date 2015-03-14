<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>

<head>
    <title>View Book</title>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
</head>

<div class="container" style="width: 350px">

        <form:form action="/BookShelf" method="get" modelAttribute="book">

            <div class="form-group">
                <label class="control-label">Id</label>
                <div class="span6">
                    <form:input path="id" cssClass="form-control" readonly="true"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">Title</label>

                <div class="span6">
                    <form:input path="title" cssClass="form-control" readonly="true"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">Authors</label>

                <div class="span6">
                    <form:input path="authors" cssClass="form-control" readonly="true"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">ImagePath</label>

                <div class="span6">
                    <form:input path="imagePath" cssClass="form-control" readonly="true"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">ISBN</label>

                <div class="span6">
                    <form:input path="isbn" cssClass="form-control" readonly="true"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">Price</label>

                <div class="span6">
                    <form:input path="price" cssClass="form-control" readonly="true"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">Type</label>

                <div class="span6">
                    <form:input path="type" cssClass="form-control" readonly="true"/>
                </div>
            </div>

            <button type="submit" class="btn btn-info">ok</button>
        </form:form>

</div>

<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

</body>
</html>