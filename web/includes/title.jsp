<section class="title-section">
    <div class="container">
        <div class="title-wrapper">
            <h1>Cart</h1>
            
            <div class="process-wrapper">
                <button class="process-element" id="cart-button" onclick="loadContent('includes/cartSection.jsp', this)">
                    <div class="process">
                        <span class="circle">1</span>
                        <span class="text">Shopping cart</span>
                    </div>
                </button>
                <button class="process-element" id="checkout-button" onclick="loadContent('includes/checkoutSection.jsp', this)">
                    <div class="process">
                        <span class="circle">2</span>
                        <span class="text">Checkout details</span>
                    </div>
                </button>
                <button class="process-element" id="order-button" onclick="loadContent('includes/orderSection.jsp', this)">
                    <div class="process">
                        <span class="circle">3</span>
                        <span class="text">Order complete</span>
                    </div>
                </button>
            </div>
        </div>
    </div>
</section>
