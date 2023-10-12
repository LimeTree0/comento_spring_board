<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>list</title>
</head>
<body>
    <table>
		<thead>
			<tr>
            	<th>id</th>
            	<th>title</th>
            	<th>Author</th>
        	</tr>
        </thead>
        
        <tbody>
        	<c:forEach items="${boardList}" var="board">
            	<tr>
                	<td>${board.id}</td>
                <td>
                    <a href="/board/detail/?id=${board.id}">${board.title}</a>
                </td>
                <td>${board.author}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>