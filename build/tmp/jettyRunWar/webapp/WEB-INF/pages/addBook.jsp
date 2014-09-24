<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>${items}</h1>

<table>
    <div class="page-action">Your Orders</div>
    <table class="table">
        <thead>
        <tr>
            <th>Title</th>
            <th>Authors</th>
            <th>Path</th>
            <th>ISBN</th>
            <th>Price</th>
        </tr>
        </thead>

        <input type="text" name="title" placeholder="title"/>
        <input type="text" name="price" placeholder="price"/>

        <form:form action="addBook" method="get">
            <button type="submit">add book</button>
        </form:form>

    </table>

</table>
</body>
</html>