<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="b" uri="/WEB-INF/tlds/buttonTags" %>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Commerce</title>
        
        <!--CSS-->
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        
        <!-- Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" >
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@100..900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Space+Grotesk:wght@300..700&display=swap" rel="stylesheet">
    </head>
    <body>
            
        <%@include file="includes/navbar.jsp" %>
        <%@include file="includes/search.jsp" %>
        
        <%@include file="includes/title.jsp" %>
        
        <div id="content-container"></div>
        
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script>
        document.addEventListener("DOMContentLoaded", function() {
    // Trigger loadContent with cart.jsp when the page loads
    loadContent('includes/cartSection.jsp', document.getElementById("cart-button"));
});

function loadContent(page, clickedButton) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById("content-container").innerHTML = this.responseText;
            
            // Remove the "active" class from all buttons
            var buttons = document.getElementsByClassName("process-element");
            for (var i = 0; i < buttons.length; i++) {
                buttons[i].classList.remove("active");
                buttons[i].classList.remove("pass");
            }
            
            // Add the "active" class to the clicked button
            clickedButton.classList.add("active");
            
            // Add the "pass" class to previous buttons if needed
            var prevButton = clickedButton.previousElementSibling;
            while (prevButton) {
                prevButton.classList.add("pass");
                prevButton = prevButton.previousElementSibling;
            }
        }
    };
    xhttp.open("GET", page, true);
    xhttp.send();
}
        </script>
        <script src="js/index.js"></script>
        
    </body>