<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>detail.jsp</title>
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <td>${board.id}</td>
        </tr>
        <tr>
            <th>writer</th>
            <td>${board.author}</td>
        </tr>
        <tr>
            <th>title</th>
            <td>${board.title}</td>
        </tr>
        <tr>
            <th>contents</th>
            <td>${board.content}</td>
        </tr>
    </table>
    <button onclick="listfn()">목록</button>
    <button onclick="updatefn()">수정</button>
    <button onclick="deletefn()">삭제</button>
</body>
<script>
	function listfn() {
		location.href = "/board/";
	}
	function updatefn() {
		location.href = "/board/update?id=" + ${board.id};
	}
	function deletefn() {
		location.href = "/board/delete?id=" + ${board.id};
	}
</script>

</html>