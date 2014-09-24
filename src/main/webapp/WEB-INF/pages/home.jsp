<%@ page language="java" contentType="text/html; charset=GB2312" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
<body>
<h1>My BookList</h1>

<table>
    <form:form action="addBook" method="post">
        <button type="submit">add book</button>
    </form:form>

    <table class="table">
        <thead>
        <tr>
            <th>Title</th>
            <th>Authors</th>
            <th>ImagePath</th>
            <th>ISBN</th>
            <th>Price</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="item" items="${itemList}" varStatus="status">
            <tr>
                <td><c:out value="${status.count}"/></td>
                <td><c:out value="${item.title}"/></td>
                <td><c:out value="${item.authors}"/></td>
                <td><img src="${item.imagePath}"></td>
                <td><c:out value="${item.isbn}"/></td>
                <td><c:out value="${item.price}"/></td>
                <td><button type="submit">delete</button></td>
                <td><button type="submit">amend</button></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</table>
</body>
</html>