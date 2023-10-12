<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <h3>LOGIN PAGE</h3>
            <form action="/serv1" method="post">
                Name:<input type="text" name="username" /><br />
                Password:<input type="password" name="password" /><br />
                <input type="submit" value="login" />
            </form>
            <% if (response.isCommitted()) { %>
                <h1>Response has already been committed.</h1>
                <% } else { %>
                    <h1>Response has not been committed yet.</h1>
                    <% } out.println("This is some content"); %>

                        <% Cookie cookie=new Cookie("username", "sneha" ); 
                        cookie.setMaxAge(60 * 60 * 24 *30);
                        cookie.setPath("/"); 
                        response.addCookie(cookie); %>

                            <h1>Cookie 'username' has been set.</h1>
                            <form action="./isro">
                                <input type="submit" value="ISRO">
                            </form>
        </body>

        </html>