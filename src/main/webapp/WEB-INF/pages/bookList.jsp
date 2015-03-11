<%@ page language="java" contentType="text/html; charset=GB2312" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<html>
<head>
    <link href="style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
</head>
<body>
<h1>My BookList</h1>

<div class="container">
    <table>

        <th>
            <form:form action="newBook" method="get">
                <button id="addBook" class="btn btn-info">add book</button>
            </form:form>
        </th>

        <th>
            <form:form action="user" method="get">
                <button id="userLogIn" class="btn btn-info">user log in</button>
            </form:form>
        </th>


        <th>
            <button type="button" class="btn btn-lg btn-primary" data-animation="am-fade-and-scale"
                    data-placement="center" bs-modal="modal">Click to toggle modal<br>
                <small>(using an object)</small>
            </button>
        </th>

        <table class="table table-striped">
            <thead>
            <tr class="success">
                <th>Image</th>
                <th>Id</th>
                <th>Title</th>
                <th>Authors</th>
                <th>ISBN</th>
                <th>Price</th>
                <th>Type</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="book" items="${bookList}" varStatus="status">
                <tr>
                    <td><img src="${book.imagePath}"></td>
                    <td><c:out value="${book.id}"/></td>
                    <td><c:out value="${book.title}"/></td>
                    <td><c:out value="${book.authors}"/></td>
                    <td><c:out value="${book.isbn}"/></td>
                    <td><c:out value="${book.price}"/></td>
                    <td><c:out value="${book.type}"/></td>
                    <td>
                        <form action="view/id=${book.id}" method="get" modelAttribute="book">
                            <button id="view" type="submit" class="btn btn-info">view</button>
                        </form>
                    </td>
                    <td>
                        <form action="editBook/id=${book.id}" method="get" modelAttribute="book">
                            <button id="amend" type="submit" class="btn btn-primary">amend</button>
                        </form>
                    </td>
                    <td>
                        <form action="deleteBook/${book.id}" method="post" modelAttribute="book">
                            <button id="delete" type="submit" onclick="confirmDelete()" class="btn btn-danger">delete</button>
                        </form>
                    </td>

                </tr>
            </c:forEach>
            </tbody>
        </table>

    </table>
</div>

<script type="text/javascript" src="<c:url value="/resources/jquery/jquery-1.11.2.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/bootstrap/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bookList.js"/>"></script>
</body>
</html>