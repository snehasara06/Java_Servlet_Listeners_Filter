<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
        <h3>GET NAME</h3>
            <form action="/welcome" method="get">
                <label>Name:</label><br>
                <input type="text" name="name">
                <input type="submit" value="Get Name">
            </form>

        <h3>WELCOME PAGE</h3>
            <form action="/welcome" method="post">
                <label>First name:</label>
                <input type="text" name="firstname">
                <br>
                <br>
                <label>Last name:</label>
                <input type="text" name="lastname">
                <br>
                <br>
                <button type="submit" value="Go">Go</button>
            </form>
        </body>

        </html>