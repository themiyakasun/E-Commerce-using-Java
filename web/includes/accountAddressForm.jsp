<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Addresses</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Custom CSS for adjusting card size and gap */
        .custom-card .card-body {
            padding: 15px; /* Decrease padding inside cards */
        }

        .custom-form .form-control {
            padding: 0.25rem 0.5rem; /* Decrease padding for form controls */
            font-size: 0.875rem; /* Decrease font size for form controls */
        }

        .heading-gap {
            margin-bottom: 50px; /* Add gap between heading and cards */
        }

        .custom-heading {
            font-size: 38px; /* Decrease font size for heading */
        }

        .custom-card-container {
            margin-left: -15px; /* Align cards a little to the left */
        }

        .card-title {
            font-size: 18px; /* Decrease font size for card titles */
        }
    </style>
</head>
<body>

<div class="container mt-5">
    <h1 class="text-center mb-4 custom-heading heading-gap">Address</h1>
    <div class="row justify-content-end custom-card-container">
        <div class="col-md-4">
            <div class="card custom-card">
                <div class="card-header">
                    <h3 class="card-title">Billing Address</h3>
                </div>
                <div class="card-body">
                    <form action="myaccount" method="post" class="custom-form">
                        <input type="hidden" name="requestType" value="up_billing_addr"/>
                         <input type="hidden" name="id" value="${user.id}"/>
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
                        <button type="submit" class="btn btn-primary">Save Billing Address</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card custom-card">
                <div class="card-header">
                    <h3 class="card-title">Billing Address</h3>
                </div>
                <div class="card-body">
                    <form action="myaccount" method="post" class="custom-form">
                     <input type="hidden" name="requestType" value="up_shipping_addr"/>
                      <input type="hidden" name="id" value="${user.id}"/>
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
                          <button type="submit" class="btn btn-primary">Save Shipping Address</button>
                    </form>
