<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/san-pham/add">
    ID: <input type="text" name="id" value="${sp1.id}">
    MA: <input type="text" name="ma" value="${sp1.ma}">
    <br>
    ten: <input type="text" name="ten" value="${sp1.ten}">
    gia: <input type="text" name="gia" value="${sp1.gia}">

    <div>
        <label class="form-lable">loai</label>

        <select class="form-select form-select-sm" name="loai" aria-label="Small select example">
            <option value="van phong" ${sp1.loai == "van phong" ? "selected" : ""}>VP</option>
            <option value="van phong 1" ${sp1.loai == "van phong 1" ? "selected" : ""}>VP1</option>
            <option value="van phong 2" ${sp1.loai == "van phong 2" ? "selected" : ""}>VP2</option>
            <option value="van phong 3" ${sp1.loai == "van phong 3" ? "selected" : ""}>VP3</option>
            <option value="van phong 4" ${sp1.loai == "van phong 4" ? "selected" : ""}>VP4</option>
        </select>
    </div>
    <button type="submit">ADD</button>
</form>
<table style="width:100%">
    <tr>
        <th>ID</th>
        <th>Ma</th>
        <th>Ten</th>
        <th>Loai</th>
        <th>Gia</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${lists}" var="sp">
        <tr>
            <td>${sp.id}</td>
            <td>${sp.ma}</td>
            <td>${sp.ten}</td>
            <td>${sp.loai}</td>
            <td>${sp.gia}</td>
            <td>
                <a href="/san-pham/remove/${sp.ma}">Delete</a>
                <a href="/san-pham/detail/${sp.ma}">Detail</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>