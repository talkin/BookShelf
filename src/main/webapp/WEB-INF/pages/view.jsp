<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>Add Book</h1>

<table>
    <table class="table">

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

        <form method="post">
            <button type="submit">back to home</button>
        </form>

    </table>

</table>
</body>
</html>