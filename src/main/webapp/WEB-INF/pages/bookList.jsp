<%@ page language="java" contentType="text/html; charset=GB2312" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
<body>
<h1>My BookList</h1>

<table>


    <table class="table">
        <thead>
        <tr>
            <th>Image</th>
            <th>Id</th>
            <th>Title</th>
            <th>Authors</th>
            <th>ISBN</th>
            <th>Price</th>
            <th>Type</th>

            <th>
                <form:form action="newPage" method="get">
                    <button>add book</button>
                </form:form>
            </th>
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
                    <form action="deleteBook/${book.id}" method="post" modelAttribute="book">
                        <button type="submit">delete</button>
                    </form>
                </td>

                <td>
                    <form action="editBook/id=${book.id}" method="get" modelAttribute="book">
                        <button type="submit">amend</button>
                    </form>
                </td>

                <td>
                    <form action="view/id=${book.id}" method="get" modelAttribute="book">
                        <button type="submit">view</button>
                    </form>
                </td>

                <td>

                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</table>
</body>
</html>