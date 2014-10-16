<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>view Book</h1>

<table>
    <table class="table">

        <form:form action="/{book.id}" method="get" modelAttribute="book">
            Id:${book.id}
            Title:${book.title}
            Authors:${book.authors}
            ImagePath:${book.imagePath}
            ISBN:${book.isbn}
            Price:${book.price}
        </form:form>

    </table>

</table>
</body>
</html>