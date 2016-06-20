<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="wasdev.sample.model.HelloBean"%>
<html>
<head>
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
    integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
    crossorigin="anonymous" />
</head>
<body>

    <h1>
        <%
            HelloBean helloBean = new HelloBean();
            out.println(helloBean.getMessage());
        %>
    </h1>

</body>
</html>