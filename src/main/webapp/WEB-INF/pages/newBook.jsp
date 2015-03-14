<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add Book</title>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
</head>

<body>
<div class="container" style="width: 350px">
        <form:form method="post" modelAttribute="book">

            <div class="form-group">
                <label class="control-label">Title</label>

                <div class="span6">
                    <form:input path="title" cssClass="form-control" placeholder="title" required="required"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">Authors</label>

                <div class="span6">
                    <form:input path="authors" cssClass="form-control" placeholder="authors" required="required"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">ImagePath</label>

                <div class="span6">
                    <form:input path="imagePath" cssClass="form-control" placeholder="imagePath" required="required"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">ISBN</label>

                <div class="span6">
                    <form:input path="isbn" cssClass="form-control" placeholder="isbn" required="required"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">Price</label>

                <div class="span6">
                    <form:input path="price" cssClass="form-control" placeholder="price" required="required"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label">Type</label>

                <div class="span6">
                    <form:select path="type" cssClass="form-control" required="required">
                        <form:option value="EBook">EBook</form:option>
                        <form:option value="PaperBook">PaperBook</form:option>
                    </form:select>
                </div>
            </div>

            <div class="form-group">
                <button type="submit" id="submit" class="btn btn-primary pull-right">Submit</button>
                <form action="/BookShelf" method="get">
                    <button type="submit" id="cancel" class="btn btn-danger pull-left">Cancel</button>
                </form>
            </div>

        </form:form>

</div>

<script type="text/javascript" src="<c:url value="/resources/jquery/jquery-1.11.2.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/bootstrap/bootstrap.min.js" />"></script>
</body>
</html>