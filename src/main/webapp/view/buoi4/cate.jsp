<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/view-add">Add</a>
<table>
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Name</th>
        <th>Code</th>
    </tr>
    <tbody>
        <c:forEach items="${lists}" var="u" varStatus="i">
           <tr>
               <td>${i.index + 1}</td>
               <td>${u.id}</td>
               <td>${u.categoryName}</td>
               <td>${u.categoryCode}</td>
           </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>