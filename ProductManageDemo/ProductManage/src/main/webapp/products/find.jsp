<%--
  Created by IntelliJ IDEA.
  User: KienVT-TTS
  Date: 5/7/2021
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find product</title>
</head>
<body>
<h1>Find product</h1>
<p>
  <a href="/products">Back to product list</a>
</p>
<form>
  <input type="text" name="name" placeholder="Enter the product">
  <input type="submit" value="Find">
</form>
<c:if test='${requestScope["name"] != null}'>
  <fieldset>
    <legend>Product information</legend>
    <table>
      <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
      </tr>
      <tr>
        <td>Price: </td>
        <td>${requestScope["product"].getPrice()}</td>
      </tr>
      <tr>
        <td>Description: </td>
        <td>${requestScope["product"].getDescription()}</td>
      </tr>
      <tr>
        <td>Producer: </td>
        <td>${requestScope["product"].getProducer()}</td>
      </tr>
    </table>
  </fieldset>
</c:if>
</body>
</html>
