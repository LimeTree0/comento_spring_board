<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save</title>
</head>
<body>
    <form action="/board/save" method="post">
        <input type="text" name="author" placeholder="작성자">
        <input type="text" name="title" placeholder="제목">
        <textarea name="content" cols="30" rows="10" placeholder="내용을 입력하세요"></textarea>
        <input type="submit" value="작성">
    </form>
</body>
</html>