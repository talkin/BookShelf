<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>view Book</h1>

<table>
    <table class="table">

        <form:form action="/BookShelf" method="get" modelAttribute="book">

            Id:${id}<br>
            Title:${book.title}<br>
            Title:${book.title}<br>
            Authors:${book.authors}<br>
            ImagePath:${book.imagePath}<br>
            <img src="${imagePath}"><br>
            ISBN:${book.isbn}<br>
            Price:${book.price}<br>
            Type:${book.type}<br>

            <button type="submit">ok</button>
        </form:form>

    </table>

</table>
</body>
</html>