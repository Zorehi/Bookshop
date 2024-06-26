<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>

<head>
    <title>Résultats</title>
    <meta charset="UTF-8" />

    <style>
        table,
        th,
        td {
            border: 1px solid;
        }
    </style>
</head>

<body>
    <h1>Liste des livres</h1>
    <fieldset>
        <legend>Livres</legend>
        <table>
            <tr>
                <th>Titre</th>
                <th>Auteur</th>
                <th>Photo auteur</th>
                <th>Nombre de notes</th>
                <th>Moyenne des notes</th>
                <th>Prix(EUR)</th>
            </tr>
            <c:forEach items="${requestScope.BOOKS}" var="book">
                <tr>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <c:if test="${book.author_image}">
                        <td><img src="${book.author_image}"></td>
                    </c:if>
                    <c:if test="${!book.author_image}">
                        <td></td>
                    </c:if>
                    <td>${book.ratings_count}</td>
                    <td>${book.ratings_average}</td>
                    <td>${book.converted_price}</td>
                </tr>
            </c:forEach>
        </table>
    </fieldset>
</body>

</html>