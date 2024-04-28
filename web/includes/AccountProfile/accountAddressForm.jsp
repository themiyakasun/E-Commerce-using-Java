<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Edit Addresses</title>
        <!-- Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/accountAddress.css"> 
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





        <div class="container mt-5">
            <h1 class="header">ADDRESS</h1>
            <div class="row justify-content-end custom-card-container">
                <div class="col-md-4">
                    <div class="card custom-card">
                        <div class="card-header">
                            <h3 class="card-title">Billing Address</h3>
                        </div>
                        <div class="card-body">
                            <form action="myaccount" method="post" class="custom-form">
                                <input type="hidden" name="requestType" value="up_billing_addr"/>
                                <input type="hidden" name="user_id" value="${user.user_id}"/>
                                <!-- Address Fields -->
                                <div class="form-group">
                                    <label for="shippingName">Name:</label>
                                    <input type="text" class="form-control" id="billing_name" name="billing_name" value="${user.billing_name}">

                                </div>
                                <div class="form-group">
                                    <label for="shippingPhone">Phone Number:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_phone" value="${user.billing_phone}" >
                                </div>
                                <div class="form-group">
                                    <label for="shippingAddress">Address:</label>
                                    <textarea class="form-control" id="billing_address" name="billing_address" rows="3" >${user.billing_address}</textarea>
                                </div>
                                <!-- Add more fields as needed -->
                                <button type="submit" class="custom-submit-btn">Save Address</button>

                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card custom-card">
                        <div class="card-header">
                            <h3 class="card-title">Shipping Address</h3>
                        </div>
                        <div class="card-body">
                            <form action="myaccount" method="post" class="custom-form">
                                <input type="hidden" name="requestType" value="up_shipping_addr"/>
                                <input type="hidden" name="user_id" value="${user.user_id}"/>
                                <!-- Address Fields -->
                                <div class="form-group">
                                    <label for="billingName">Name:</label>
                                    <input type="text" class="form-control" id="shipping_name" name="shipping_name" value="${user.shipping_name}" >

                                </div>
                                <div class="form-group">
                                    <label for="billingPhone">Phone Number:</label>
                                    <input type="text" class="form-control" id="shipping_phone" name="shipping_phone" value="${user.shipping_phone}" >
                                </div>
                                <div class="form-group">
                                    <label for="billingAddress">Address:</label>
                                    <textarea class="form-control" id="shipping_address" name="shipping_address" rows="3" >${user.shipping_address}</textarea>
                                </div>
                                <button type="submit" class="custom-submit-btn">Save Address</button>
                            </form>

                            <script>
                                function toggleNav() {
                                    var sidenav = document.getElementById("mySidenav");
                                    if (sidenav.style.width === "250px") {
                                        sidenav.style.width = "0";
                                        document.body.removeEventListener("click", closeNavOutside);
                                    } else {
                                        sidenav.style.width = "250px";
                                        document.body.addEventListener("click", closeNavOutside);
                                    }
                                }

                                function closeNavOutside(event) {
                                    var sidenav = document.getElementById("mySidenav");
                                    var openbtn = document.querySelector(".openbtn");
                                    if (!sidenav.contains(event.target) && event.target !== openbtn) {
                                        sidenav.style.width = "0";
                                        document.body.removeEventListener("click", closeNavOutside);
                                    }
                                }
                            </script>
                            </body>
                            </html>
