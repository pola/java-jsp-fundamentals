<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.time.LocalDate" %>

[...]
    <body>
        <h1>Today's date</h1>
        <p>
            Today's date is:
            <%
            LocalDate today = LocalDate.now();
            out.write(today.toString());
            %>
        </p>
    </body>
</html>