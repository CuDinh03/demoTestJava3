<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maccuacu
  Date: 27/2/25
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/KhachHangServlet" method="post">
  <h1>them khach hang</h1>
  <br>
  Username: <input name="username" type="text">
  <br>
  Password: <input name="password" type="text">
  <br>
  Ho ten: <input name="hoten" type="text">
  <br>
  Gioi Tinh : <input name="gioitinh" value="true" type="radio">
  <br>
  Email: <input name="email" type="text">

  <br>
  <button type="submit">insert</button>
</form>

<br>
<table>
  <tr>
    <th>username</th>
    <th>password</th>
    <th>hoten</th>
    <th>gioitinh</th>
    <th>email</th>
    <th>action</th>
  </tr>
  <c:forEach var="kh" items="${listKh}">
    <tr>
      <td>${kh.userName}</td>
      <td>${kh.password}</td>
      <td>${kh.hoTen}</td>
      <td>${kh.gioiTinh ? 'Nam' : 'Nữ'}</td>
      <td>${kh.email}</td>
      <td><a href="/KhachHangServlet/delete?userName=${kh.userName}">delete</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
