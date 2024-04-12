//Mobile Nav Toggle
window.openMobileNav = function() {
    var mobileNav = document.getElementById("mobile-nav");
    mobileNav.classList.add("active");
};
window.closeMobileNav = function() {
    var mobileNav = document.getElementById("mobile-nav");
    mobileNav.classList.remove("active");
};

//Search Toggle
window.toggleSearch = function(){
    var searchWrapper = document.getElementById("search-wrapper");
    searchWrapper.classList.toggle("active");
};


//Profile DropDown
window.toggleProfileDropdown = function(){
    var profileDropdown = document.getElementById("profile-dropdown");
    profileDropdown.classList.toggle("active");
}

//Cart Page section change
function loadContent(page, clickedButton) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            document.getElementById("content-container").innerHTML = this.responseText;
            
            var buttons = document.querySelectorAll(".process-element");
            buttons.forEach(function(button) {
                button.classList.remove("active");
                button.classList.remove("pass");
            });
            
            if (clickedButton.classList.contains("process-element")) {
                clickedButton.classList.add("active");
                var prevButton = clickedButton.previousElementSibling;
                while (prevButton) {
                    prevButton.classList.add("pass");
                    prevButton = prevButton.previousElementSibling;
                }
            }
            
            if(clickedButton.classList.contains("checkout-btn")){
                var checkoutBtn = document.getElementById("checkout-button");
                checkoutBtn.classList.add("active");
                var prevButton = checkoutBtn.previousElementSibling;
                while (prevButton) {
                    prevButton.classList.add("pass");
                    prevButton = prevButton.previousElementSibling;
                }
            }
            
            if(clickedButton.classList.contains("place-order-btn")){
                var orderBtn = document.getElementById("order-button");
                orderBtn.classList.add("active");
                var prevButton = orderBtn.previousElementSibling;
                while (prevButton) {
                    prevButton.classList.add("pass");
                    prevButton = prevButton.previousElementSibling;
                }
            }
                                  
            // Update title based on clicked button
            var title = "";
            if(clickedButton.id === "cart-button") {
                title = "Cart";
            } else if(clickedButton.id === "checkout-button") {
                title = "Checkout";
            } else if(clickedButton.id === "order-button") {
                title = "Complete!";
            }
            document.getElementById("title").innerText = title;
        }
    };
    xhttp.open("GET", page, true);
    xhttp.send();
}

//Quantity 
function minus(){
    var quantityInput = document.getElementById('quantity');
    if (quantityInput) {
        var currentValue = parseInt(quantityInput.value);
        if (!isNaN(currentValue) && currentValue > 0) {
            quantityInput.value = currentValue - 1;
            updateSubtotal();
        }
    }
}

function add(){
    var quantityInput = document.getElementById('quantity');
    if (quantityInput) {
        var currentValue = parseInt(quantityInput.value);
        if (!isNaN(currentValue)) {
            quantityInput.value = currentValue + 1;
            updateSubtotal();
        }
    }
}

function updateSubtotal() {
    var quantity = parseInt(document.getElementById('quantity').value);
    var price = parseFloat(document.querySelector('.price').innerText.replace('$', ''));
    var subtotal = quantity * price;
    document.querySelector('.sub-total').innerText = '$' + subtotal.toFixed(2);
}


//Payment Method Select
function showPaymentInfo(paymentMethod) {
    var cardInfo = document.getElementById("card-info");
    var paypalInfo = document.getElementById("paypal-info");
    
    if (paymentMethod === "credit-card") {
        cardInfo.style.display = "block";
        paypalInfo.style.display = "none";
    } else if (paymentMethod === "paypal") {
        cardInfo.style.display = "none";
        paypalInfo.style.display = "block";
    }
}