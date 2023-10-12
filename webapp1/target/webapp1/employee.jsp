<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>
        <body>

            <h3>EMPLOYEE DATA</h3>
            <form action="/employeeDetails" method="post">
                <label>Name: </label><br>
                <input type="text" name="empName">
                <br>
                <br>
                <label>Id: </label><br>
                <input type="text" name="empId">
                <br>
                <br>
                <label>Department: </label><br>
                <input type="text" name="empDept">
                <br>
                <br>
                <label>Email: </label><br>
                <input type="text" name="empEmail">
                <br>
                <br>
                <label>Products: </label><br>
                <input type="checkbox" name="product" value="Dolphin"> Dolphin<br>
                <input type="checkbox" name="product" value="Bullfinch"> Bullfinch<br>
                <input type="checkbox" name="product" value="Breeze"> Breeze<br>
                <br>
                
                <label>Comments:</label><br>
                <textarea name="comment" rows="4" cols="50"></textarea>
                <br>
                <br>
                <br>
                <input type="submit" value="SUBMIT">
            </form>

            <h3>GET EMPLOYEE NAME</h3>
            <form action="/employeeDetails" method="get">
                <label>Name:</label><br>
                <input type="text" name="name">
                <input type="submit" value="Submit">
            </form>
        </body>

        </html>