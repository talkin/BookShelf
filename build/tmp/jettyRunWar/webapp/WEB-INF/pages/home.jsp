<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>${items}</h1>

<table>
    <div class="page-action">Your BookList</div>
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
        <c:forEach var="itemNum" items="${itemList}" varStatus="row">
            <tr>
                <td>
                    <form:input path="itemNum.title" />
                </td>
                <td>
                    <form:input path="itemNum.authors" />
                </td>
                <td>
                    <form:input path="itemNum.imagePath"/>
                </td>
                <td>
                    <form:input path="itemNum.isbn"/>
                </td>
                <td>
                    <form:input path="itemNum.price" />
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>

    <input type="text" name="title" placeholder="title"/><br>
    <input type="text" name="authors" placeholder="authors"/><br>
    <input type="text" name="imagePath" placeholder="imagePath"/><br>
    <input type="text" name="isbn" placeholder="isbn"/><br>
    <input type="text" name="price" placeholder="price"/><br>

    <form:form action="addBook" method="post">
        <button type="submit">add book</button>
    </form:form>

</table>
</body>
</html>