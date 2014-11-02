<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>edit Book</h1>

<table>
    <table class="table">

        <form:form action="id=${id}" method="post" modelAttribute="book">

            Id:${id}<br>
            Title:<br>
            <input type="text" name="title" placeholder="title" value="${book.title}"/><br>
            Authors:<br>
            <input type="text" name="authors" placeholder="authors" value="${book.authors}"/><br>
            ImagePath:<br>
            <input type="text" name="imagePath" placeholder="imagePath" value="${book.imagePath}"/><br>
            ISBN:<br>
            <input type="text" name="isbn" placeholder="isbn" value="${book.isbn}"/><br>
            Price:<br>
            <input type="text" name="price" placeholder="price" value="${book.price}"/><br>
            Type:<br>
            <select name="type" id="type">
                <option value="EBook">EBook</option>
                <option value="PaperBook">PaperBook</option>

                    <%--<c:forEach items="${typeList}">--%>
                    <%--<c:if test="${book.type eq type}">--%>
                    <%--<option value=${book.type} selected="selected">${book.type}</option>--%>
                    <%--</c:if>--%>
                    <%--<c:if test="${book.type ne type}">--%>
                    <%--<option value=${book.type}>${book.type}</option>--%>
                    <%--</c:if>--%>
                    <%--</c:forEach>--%>
            </select>

            <button type="submit">submit</button>
        </form:form>

    </table>

</table>
</body>
</html>