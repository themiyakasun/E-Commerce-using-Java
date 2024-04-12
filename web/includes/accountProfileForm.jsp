


<h1>MY ACCOUNT</h1><center>
    <h2>Account Details</h2>
<%-- Check if there's an error message --%>
<% if (request.getAttribute("error") != null) { %>
    <script>
        // Extract the error message
        var errorMessage = "<%= request.getAttribute("error") %>";
        // Display the error message in a pop-up dialog
        alert(errorMessage);
        // Redirect to the myaccount page after the user clicks OK
        window.location.href = "myaccount";
    </script>
<% } %>


 <%-- Check if there's an error message --%>
    <% if (request.getAttribute("error") != null) { %>
        <script>
            // Extract the error message
            var errorMessage = "<%= request.getAttribute("error") %>";
            // Display the error message in a pop-up dialog
            alert(errorMessage);
        </script>
    <% } %>
    

    <form action="myaccount" method="post">
        <table>
            <tr>
                <input type="hidden" name="requestType" value="update"/>
                <input type="hidden" name="id" value="${user.id}"/>
                <td><label for="first_name">First Name:</label></td>
                <td><input type="text" id="first_name" value="${user.first_name}" name="first_name"  required></td>
            </tr>
            <tr>
                <td><label for="last_name">Last Name:</label></td>
                <td><input type="text" id="last_name" value="${user.last_name}"name="last_name"  required></td>
            </tr>
            <tr>
                <td><label for="display_name">Display Name:</label></td>
                <td><input type="text" id="display_name" value="${user.display_name}" name="display_name" placeholder="Enter your display name" ></td>
            </tr>
            <tr>
                <td><label for="email">Email:</label></td>
                <td><input type="email" id="email" value="${user.email}" name="email"required></td>
            </tr>

            <br><br>
            <tr>
                <td>Change Password </td></tr>
               
             <tr>
                <input type="hidden" name="real_password" value="${user.password}"/>
                <td><label for="password">Old Password: </label></td>
                <td><input type="password" id="old_password" name="old_password" placeholder="Enter your old password" required></td>
            </tr>
            
            <tr>
                <td><label for="password">New Password:</label></td>
                <td><input type="password" id="new_password" name="new_password" placeholder="Enter your new password" required></td>
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
           
