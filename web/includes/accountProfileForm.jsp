<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <title>User Registration Form</title>
</head>
<style>
        table {
            border-collapse: separate;
            border-spacing: 0 10px;
        }
        td {
            padding: 5px;
        }
    </style>
<body><h1>MY ACCOUNT</h1><center>
    <h2>Account Details</h2>
    <form action="update" method="post">
        <table>
            <tr>
                <td><label for="first_name">First Name:</label></td>
                <td><input type="text" id="first_name" value="${user.first_name}" name="first_name"  required></td>
            </tr>
            <tr>
                <td><label for="last_name">Last Name:</label></td>
                <td><input type="text" id="last_name" value="${user.last_name}"name="last_name"  required></td>
            </tr>
            <tr>
                <td><label for="display_name">Display Name:</label></td>
                <td><input type="text" id="display_name" name="display_name" placeholder="Enter your display name" required></td>
            </tr>
            <tr>
                <td><label for="email">Email:</label></td>
                <td><input type="email" id="email" value="${user.email}" name="email"required></td>
            </tr>

            <br><br>
            <tr>
                <td>Change Password </td></tr>
            <tr>
                <td><label for="password">New Password:</label></td>
                <td><input type="password" id="password" name="password" placeholder="Enter your new password" required></td>
            </tr>
            <tr>
                <td><label for="confirm_password">Confirm Password:</label></td>
                <td><input type="password" id="confirm_password" name="confirm_password" placeholder="Confirm your password" required></td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Submit">
    </form>
    </form></center>
</body>
</html>
