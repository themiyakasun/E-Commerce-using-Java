<%@page import="myPackage.DbUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="b" uri="/WEB-INF/tlds/buttonTags" %>

<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop Page</title>
        
        <!--CSS-->
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/shop.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css">
        
        <!-- Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" >
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@100..900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Space+Grotesk:wght@300..700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
            
        <%@include file="includes/navbar.jsp" %>
        <%@include file="includes/search.jsp" %>
        
        <div class="container">
            <img id="hero-shop" src="assets/Elements/cover.png">
            <div class="hero-text">
                <p>Home > Shop</p>
                <h1>Shop Page</h1>
                <p>Let’s design the place you always imagined.</p>
            </div>
        </div>
        
        <section>
                <div class="container">
                <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="1">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/pro1.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Loveseat Sofa</h2>
                                <div class="prices">
                                    <span class="discount-price">$199.00</span>
                                    <span class="price"><s>$400.00</s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                                    
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="2">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product2.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Luxury Sofa</h2>
                                <div class="prices">
                                    <span class="discount-price">$299.00</span>
                                    <span class="price"><s>$500.00</s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                                    
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="3">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product3.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Table Lamp</h2>
                                <div class="prices">
                                    <span class="discount-price">$19.00</span>
                                    <span class="price"><s></s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                                    
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="4">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product4.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Cozy Sofa</h2>
                                <div class="prices">
                                    <span class="discount-price">$299.00</span>
                                    <span class="price"><s></s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
                                    
                <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="5">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product5.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>White Drawer Unit</h2>
                                <div class="prices">
                                    <span class="discount-price">$89.99</span>
                                    <span class="price"><s></s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                                    
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="6">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product6.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Black Tray Table</h2>
                                <div class="prices">
                                    <span class="discount-price">$19.99</span>
                                    <span class="price"><s></s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                                    
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="7">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product7.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Table Lamp</h2>
                                <div class="prices">
                                    <span class="discount-price">$19.00</span>
                                    <span class="price"><s></s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                                    
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="8">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product8.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Black Brow Side Table</h2>
                                <div class="prices">
                                    <span class="discount-price">$16.99</span>
                                    <span class="price"><s></s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
                                    
                <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="9">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product9.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Light Beige Pillow</h2>
                                <div class="prices">
                                    <span class="discount-price">$3.99</span>
                                    <span class="price"><s></s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                                    
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="10">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product10.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Table Lamp</h2>
                                <div class="prices">
                                    <span class="discount-price">$39.99</span>
                                    <span class="price"><s></s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                                    
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="11">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product11.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Bamboo Basket</h2>
                                <div class="prices">
                                    <span class="discount-price">$9.99</span>
                                    <span class="price"><s></s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                                    
                    <div class="col-md-3">
                        <a href="#" class="pro-card-wrapper">
                            <div class="pro-card" data-product-id="12">
                                <div class="pro-card-img">
                                    <div class="pro-add-to-cart">
                                        <b:Button text="Add To Cart" rounded="false" outlined="false" name="add-to-cart"/>
                                    </div>
                                    <div class="new">new</div>
                                    <div class="discount">-50%</div>
                                    <button class="add-to-wishlist"><img src="assets/icons/wishlist.png" /></button>
                                    <img src="assets/Elements/product12.png" />
                                </div>
                                <div class="pro-card-details">
                                <div class="rating">
                                    <img src="assets/icons/star.png" />
                                </div>
                                <h2>Off White Pillow</h2>
                                <div class="prices">
                                    <span class="discount-price">$7.99</span>
                                    <span class="price"><s></s></span>
                                </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
                <!--Show more btn-->
                <button class="sm-btn">Show More</button>                
                
            </div>
            </div>
        </section>
                                    
        <%@include file="includes/newsletter.jsp" %>
                
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script src="js/index.js"></script>
        
    </body>
