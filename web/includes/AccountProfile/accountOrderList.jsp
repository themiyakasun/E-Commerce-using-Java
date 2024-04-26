<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

    <head
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <title>User Management Application</title>
        <style>


            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
            }
            table {
                border-spacing: 1;
                border-collapse: collapse;
                background: white;
                border-radius: 6px;
                overflow: hidden;
                max-width: 800px;
                width: 70%;
                margin-left:350px; 
                margin-top: 100px;

            }

            * {
                position: relative;
            }

            td, th {
                padding-left: 8px;
            }

            thead tr {
                height: 60px;
                background: black;
                font-size: 16px;
                color:white;
            }

            tbody tr {
                height: 48px;
                border-bottom: 1px solid #E3F1D5;
            }

            td, th {
                text-align: left;
            }

            th.l, td.l {
                text-align: right;
            }

            th.c, td.c {
                text-align: center;
            }

            th.r, td.r {
                text-align: center;
            }

            .sidenav {
                height: 100%;
                width:0px;
                position: fixed;
                z-index: 1;
                top: 0;
                left: 0;
                background-color: #f8f9fa;
                padding-top: 20px;
                overflow-y: auto;
                transition: 0.5s;
            }

            .profile {
                margin-top:5px;
                text-align: center;
                margin-bottom: 20px;

            }




            .sidenav a {
                padding: 10px 10px;
                text-decoration: none;
                font-size: 16px;
                color: #555;
                display: block;
                transition: background-color 0.3s;
                margin-bottom:5px;


            }

            .sidenav a.active {
                background-color: black;
                color: white;
            }

            .sidenav a:hover {
                background-color: #ccc;
                color: #333;
            }



            .sidenavimg{
                margin-left:-100px;
            }

           @media only screen and (min-width: 768px) {



               .sidenav {
                   width: 250px;
               }
           }

           @media only screen and (max-width: 768px) {
               width: 0px;
           }





        </style>
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