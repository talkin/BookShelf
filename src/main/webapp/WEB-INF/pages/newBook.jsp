<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Book</title>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
</head>

<body>
<div class="container" style="width: 350px">
        <form:form action="newBook" method="get" modelAttribute="book">

            <div class="form-group">
                <label class="control-label">Title</label>

                <div class="span6">
                    <form:input path="title" cssClass="form-control" placeholder="title"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">Authors</label>

                <div class="span6">
                    <form:input path="authors" cssClass="form-control" placeholder="authors"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">ImagePath</label>

                <div class="span6">
                    <form:input path="imagePath" cssClass="form-control" placeholder="imagePath"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">ISBN</label>

                <div class="span6">
                    <form:input path="isbn" cssClass="form-control" placeholder="isbn"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">Price</label>

                <div class="span6">
                    <form:input path="price" cssClass="form-control" placeholder="price"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">Type</label>

                <div class="span6">
                    <form:select path="type" cssClass="form-control">
                        <form:option value="EBook">EBook</form:option>
                        <form:option value="PaperBook">PaperBook</form:option>
                    </form:select>
                </div>
            </div>

            <div class="form-group">
                <button type="submit" id="submitRequest" class="btn btn-primary pull-right">
                    <span class="glyphicon glyphicon-ok"></span> Submit
                </button>
            </div>

        </form:form>

</div>

<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>