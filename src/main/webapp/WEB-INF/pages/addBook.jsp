<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>Add Book</h1>

<table>
    <table class="table">

        Title:<br>
        <input type="text" name="title" placeholder="title"/><br>
        Authors:<br>
        <input type="text" name="authors" placeholder="authors"/><br>
        ImagePath:<br>
        <input type="text" name="imagePath" placeholder="imagePath"/><br>
        ISBN:<br>
        <input type="text" name="isbn" placeholder="isbn"/><br>
        Price:<br>
        <input type="text" name="price" placeholder="price"/><br>

        <form:form action="home" method="post">
            <button type="submit">submit</button>
        </form:form>

    </table>

</table>
</body>
</html>