<%--
  Created by IntelliJ IDEA.
  User: renatomartins
  Date: 14/04/22
  Time: 07:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div>
            <h1>Let us register you, asap!</h1>
            <form:form modelAttribute="registration">
                <label for="inputName" class="form-label">Full name</label>
                <form:input path="name" type="text" class="form-control" id="inputName" aria-describedby="nameHelp"/>
                <div id="emailHelp" class="form-text">We'll never share your information with anyone else.</div>
                <input type="submit" class="btn btn-primary" value="Add registration" />
            </form:form>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
