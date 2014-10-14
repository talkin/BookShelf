<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>Add Book</h1>

<table>
    <table class="table">

        <form:form action="newBook" method="post" modelAttribute="book">

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


            <button type="submit">submit</button>
        </form:form>

    </table>

</table>
</body>
</html>