<%@taglib prefix="b" uri="/WEB-INF/tlds/buttonTags" %>
<section class="cart-section">
    <div class="container">
        <div class="cart-section-wrapper">
            <table class="cart-table">
                <thead>
                    <tr>
                        <th>Product</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Subtotal</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <div class="cart-product-details">
                                <img src="assets/pro1.png" class="pro-img"/>
                                <div class="pro-details">
                                    <h3>Tray Table</h3>
                                    <span>Color: Black</span>
                                    <button class="remove-btn">
                                        <img src="assets/icons/close.png"/>
                                        Remove
                                    </button>
                                </div>
                            </div>
                        </td>
                        <td>
                            <div class="cart-product-element">
                                <div class="quantity-wrapper">
                                    <button class="minus-btn" id="minus-btn" onclick="minus()"><img src="assets/icons/Minus.png" /></button>
                                    <input type="text" value="2" id="quantity"/>
                                    <button class="add-btn" id="add-btn" onclick="add()"><img src="assets/icons/Add.png" /></button>
                                </div>
                            </div>
                        </td>
                        <td>
                            <div class="cart-product-element">
                                <div class="price">
                                    $19.00
                                </div>
                            </div>
                        </td>
                        <td>
                            <div class="cart-product-element">
                                <div class="sub-total">
                                    $38.00
                                </div>
                            </div>
                        </td>
                    </tr>
                </tbody>
            </table>
            
            <div class="cart-summary">
                <h2>Cart summary</h2>
                
                <div class="shipping-details">
                    <div class="radio-inputs-wrapper">
                        <div class="radio-input">
                            <input type="radio" name="shipping-method" />
                            <label>Free shipping</label>
                        </div>
                        <p>$0.00</p>
                    </div>
                    <div class="radio-inputs-wrapper">
                        <div class="radio-input">
                            <input type="radio"name="shipping-method"/>
                            <label>Express shipping</label>
                        </div>
                        <p>+$15.00</p>
                    </div>
                </div>
                
                <div class="cart-sum-sub-total">
                    <span class="text">
                        Subtotal
                    </span>
                    <span class="price">
                        $1234.00
                    </span>
                </div>
                <div class="cart-sum-total">
                    <span class="text">
                        Total
                    </span>
                    <span class="price">
                        $1234.00
                    </span>
                </div>
                
                <div class="checkout-btn" onclick="loadContent('includes/cartPage/checkoutSection.jsp', this)">
                    <b:Button rounded="false" outlined="false" text="Checkout" name="checkout"/>
                </div>
            </div>
        </div>
    </div>
</section>

