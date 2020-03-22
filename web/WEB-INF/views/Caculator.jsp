<%--
  Created by IntelliJ IDEA.
  User: TOAN
  Date: 3/22/2020
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="Caculator">
    <input name="number1"> : <input name="number2"> <br><br>
    <input name="caculator" type="submit" value="+"> :
    <input name="caculator" type="submit" value="-"> :
    <input name="caculator" type="submit" value="*"> :
    <input name="caculator" type="submit" value="/"> :
</form>

<h2>Kết quả : ${ketqua}</h2>
</body>
</html>
