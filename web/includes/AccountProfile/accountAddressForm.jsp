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
                                <input type="hidden" name="user_id" value="${currentUserId}"/>
                                <!-- Address Fields -->
                                <div class="form-group">
                                    <label for="billingName">Name:</label>
                                    <input type="text" class="form-control" id="billing_name" name="billing_name" value="${billing_address.user_name}">

                                </div>
                                <div class="form-group">
                                    <label for="billingPhone">Phone Number:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_phone" value="${billing_address.phone_no}" >
                                </div>
                                <div class="form-group">
                                    <label for="billingStreet">Street Address:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_street" value="${billing_address.streetAddress}" >
                                </div>
                                <div class="form-group">
                                    <label for="billingCity">City:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_city" value="${billing_address.city}" >
                                </div>
                                <div class="form-group">
                                    <label for="billingState">State:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_state" value="${billing_address.state}" >
                                </div>
                                <div class="form-group">
                                    <label for="billingPostalCode">Postal Code:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_postal_code" value="${billing_address.postalCode}" >
                                </divbilling_address
                                <div class="form-group">
                                    <label for="billingCountry">Country:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_country" value="${billing_address.country}" >
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
                                    <label for="shippingName">Name:</label>
                                    <input type="text" class="form-control" id="shipping_name" name="shipping_name" value="${user.shipping_name}" >

                                </div>
                                <div class="form-group">
                                    <label for="shippingPhone">Phone Number:</label>
                                    <input type="text" class="form-control" id="shipping_phone" name="shipping_phone" value="${user.shipping_phone}" >
                                </div>
                                <div class="form-group">
                                    <label for="shippingStreet">Street Address:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_phone" value="${user.billing_phone}" >
                                </div>
                                <div class="form-group">
                                    <label for="shippingStreet">City:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_phone" value="${user.billing_phone}" >
                                </div>
                                <div class="form-group">
                                    <label for="shippingStreet">State:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_phone" value="${user.billing_phone}" >
                                </div>
                                <div class="form-group">
                                    <label for="shippingStreet">Postal Code:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_phone" value="${user.billing_phone}" >
                                </div>
                                <div class="form-group">
                                    <label for="shippingStreet">Country:</label>
                                    <input type="text" class="form-control" id="billing_phone" name="billing_phone" value="${user.billing_phone}" >
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
