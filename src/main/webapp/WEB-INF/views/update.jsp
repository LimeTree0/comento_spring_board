<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update.jsp</title>
</head>
<body>
    <form action="/board/update" method="post" name="updateForm">
        <input type="hidden" name="id" value="${board.id}" readonly>
        author: <input type="text" name="author" value="${board.author}" readonly>
        title: <input type="text" name="title" value="${board.title}">
        content: <textarea name="content" cols="30" rows="10">${board.content}</textarea>
        <input type="submit" value="수정">
    </form>
</body>
</html>