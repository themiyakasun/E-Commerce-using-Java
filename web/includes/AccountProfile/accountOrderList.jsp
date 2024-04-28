<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

    <head
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/accountOrders.css"> 
        <title>User Management Application</title>

    </head>

    <body>
        <span class="openbtn" onclick="toggleNav()">&#9776;</span>
        <div id="mySidenav" class="sidenav">

            <div class="profile">
                <img src="includes/AccountProfile/logo1.png"  class="sidenavimg" >
            </div>

            <a href="#" class="active">Dashboard</a>
            <a href="myaccount?action=details">Account</a>
            <a href="myaccount?action=address">Address</a>
            <a href="#">Orders</a>
            <a href="#">Wishlist</a>
            <a href="#">Logout</a> </div>
        <table>
            <thead>
                <tr>
                    <th>Order ID</th>
                    <th>Order Code</th>
                    <th>Total</th>
                    <th>Shipping Method</th>
                    <th>Ordered Date</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="order" items="${orders}">
                    <tr>
                        <td><c:out value="${order.order_id}" /></td>
                        <td><c:out value="${order.order_code}" /></td>
                        <td><c:out value="${order.total}" /></td>
                        <td><c:out value="${order.shipping_method}" /></td>
                        <td><c:out value="${order.order_date}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>


        <script>
            function toggleNav() {
                var sidenav = document.getElementById("mySidenav");
                var openbtn = document.querySelector(".openbtn");

                if (sidenav.style.width === "250px" || sidenav.style.width === "") {
                    sidenav.style.width = "0";
                    document.body.removeEventListener("click", closeNavOutside); // Remove event listener
                } else {
                    sidenav.style.width = "250px";
                    document.body.addEventListener("click", closeNavOutside); // Add event listener
                }
            }

            // Function to close the navigation menu when clicking outside of it
            function closeNavOutside(event) {
                var sidenav = document.getElementById("mySidenav");
                var openbtn = document.querySelector(".openbtn");

                if (!event.target.matches('.openbtn') && !event.target.closest('.sidenav')) {
                    sidenav.style.width = "0";
                    document.body.removeEventListener("click", closeNavOutside);
                }
            }



        </script>

    </body>



</html>