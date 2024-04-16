package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/lib/web/WEB-INF/tlds/buttonTags.tld");
    _jspx_dependants.add("/includes/navbar.jsp");
    _jspx_dependants.add("/includes/search.jsp");
    _jspx_dependants.add("/includes/newsletter.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Shop Page</title>\n");
      out.write("        \n");
      out.write("        <!--CSS-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css\">\n");
      out.write("        \n");
      out.write("        <!-- Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" >\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@100..900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Space+Grotesk:wght@300..700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            \n");
      out.write("        ");
      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"nav-wrapper\">\r\n");
      out.write("            <div class=\"logo-wrapper\">\r\n");
      out.write("                <button class=\"mobile-nav-toggle\" id=\"mobile-nav-toggle\" onclick=\"openMobileNav()\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\">\r\n");
      out.write("                        <path d=\"M7 8H17M7 12H17M7 16H17\" stroke=\"#141718\" stroke-width=\"1.5\" stroke-linecap=\"round\"/>\r\n");
      out.write("                        <path d=\"M7 8H17M7 12H17M7 16H17\" stroke=\"black\" stroke-opacity=\"0.2\" stroke-width=\"1.5\" stroke-linecap=\"round\"/>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                </button>\r\n");
      out.write("                <img src=\"assets/logo.png\" alt=\"logo\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <ul class=\"nav-list\" role=\"list\">\r\n");
      out.write("                <li><a href=\"\">Home</a></li>\r\n");
      out.write("                <li><a href=\"\">Shop</a></li>\r\n");
      out.write("                <li><a href=\"\">Contact us</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"nav-icons\">\r\n");
      out.write("                <button class=\"search-button\" onclick=\"toggleSearch()\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\">\r\n");
      out.write("                        <path d=\"M18.5 18.5L22 22M21 11.5C21 6.25329 16.7467 2 11.5 2C6.25329 2 2 6.25329 2 11.5C2 16.7467 6.25329 21 11.5 21C16.7467 21 21 16.7467 21 11.5Z\" stroke=\"#141718\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                        <path d=\"M18.5 18.5L22 22M21 11.5C21 6.25329 16.7467 2 11.5 2C6.25329 2 2 6.25329 2 11.5C2 16.7467 6.25329 21 11.5 21C16.7467 21 21 16.7467 21 11.5Z\" stroke=\"black\" stroke-opacity=\"0.2\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                </button>\r\n");
      out.write("                <button class=\"profile-button\" onclick=\"toggleProfileDropdown()\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\">\r\n");
      out.write("                        <path d=\"M18.5588 19.5488C17.5654 16.8918 15.0036 15 12 15C8.99638 15 6.4346 16.8918 5.44117 19.5488M18.5588 19.5488C20.6672 17.7154 22 15.0134 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 15.0134 3.33285 17.7154 5.44117 19.5488M18.5588 19.5488C16.8031 21.0756 14.5095 22 12 22C9.49052 22 7.19694 21.0756 5.44117 19.5488M15 9C15 10.6569 13.6569 12 12 12C10.3431 12 9 10.6569 9 9C9 7.34315 10.3431 6 12 6C13.6569 6 15 7.34315 15 9Z\" stroke=\"#141718\" stroke-width=\"1.5\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                        <path d=\"M18.5588 19.5488C17.5654 16.8918 15.0036 15 12 15C8.99638 15 6.4346 16.8918 5.44117 19.5488M18.5588 19.5488C20.6672 17.7154 22 15.0134 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 15.0134 3.33285 17.7154 5.44117 19.5488M18.5588 19.5488C16.8031 21.0756 14.5095 22 12 22C9.49052 22 7.19694 21.0756 5.44117 19.5488M15 9C15 10.6569 13.6569 12 12 12C10.3431 12 9 10.6569 9 9C9 7.34315 10.3431 6 12 6C13.6569 6 15 7.34315 15 9Z\" stroke=\"black\" stroke-opacity=\"0.2\" stroke-width=\"1.5\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"profile-dropdown\" id=\"profile-dropdown\">\r\n");
      out.write("                        <ul class=\"list\" role=\"list\">\r\n");
      out.write("                            <li><a href=\"sign-up\">Sign up</a></li>\r\n");
      out.write("                            <li><a href=\"sign-in\">Sign in</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </button>\r\n");
      out.write("                <button class=\"cart-button\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\">\r\n");
      out.write("                        <path d=\"M9 6L9 7C9 8.65685 10.3431 10 12 10C13.6569 10 15 8.65685 15 7V6\" stroke=\"#141718\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                        <path d=\"M9 6L9 7C9 8.65685 10.3431 10 12 10C13.6569 10 15 8.65685 15 7V6\" stroke=\"black\" stroke-opacity=\"0.2\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                        <path d=\"M15.6113 3H8.38836C6.433 3 4.76424 4.41365 4.44278 6.3424L2.77612 16.3424C2.36976 18.7805 4.24994 21 6.72169 21H17.278C19.7498 21 21.6299 18.7805 21.2236 16.3424L19.5569 6.3424C19.2355 4.41365 17.5667 3 15.6113 3Z\" stroke=\"#141718\" stroke-width=\"1.5\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                        <path d=\"M15.6113 3H8.38836C6.433 3 4.76424 4.41365 4.44278 6.3424L2.77612 16.3424C2.36976 18.7805 4.24994 21 6.72169 21H17.278C19.7498 21 21.6299 18.7805 21.2236 16.3424L19.5569 6.3424C19.2355 4.41365 17.5667 3 15.6113 3Z\" stroke=\"black\" stroke-opacity=\"0.2\" stroke-width=\"1.5\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                    <span>2</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"mobile-nav\" id=\"mobile-nav\">\r\n");
      out.write("        <div class=\"mobile-nav-top\">\r\n");
      out.write("            <div class=\"top-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"assets/logo.png\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("                <button onclick=\"closeMobileNav()\">\r\n");
      out.write("                <img src=\"assets/icons/close.png\"/>\r\n");
      out.write("            </button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"search\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\">\r\n");
      out.write("                        <path d=\"M18.5 18.5L22 22M21 11.5C21 6.25329 16.7467 2 11.5 2C6.25329 2 2 6.25329 2 11.5C2 16.7467 6.25329 21 11.5 21C16.7467 21 21 16.7467 21 11.5Z\" stroke=\"#141718\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                        <path d=\"M18.5 18.5L22 22M21 11.5C21 6.25329 16.7467 2 11.5 2C6.25329 2 2 6.25329 2 11.5C2 16.7467 6.25329 21 11.5 21C16.7467 21 21 16.7467 21 11.5Z\" stroke=\"black\" stroke-opacity=\"0.2\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"text\" placeholder=\"Search\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"mobile-nav-list\" role=\"list\">\r\n");
      out.write("                <li><a href=\"\">Home</a></li>\r\n");
      out.write("                <li><a href=\"\">Shop</a></li>\r\n");
      out.write("                <li><a href=\"\">Contact us</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mobile-nav-bottom\">\r\n");
      out.write("            <a href=\"\" class=\"action-wrapper\">\r\n");
      out.write("                <span>\r\n");
      out.write("                    Cart\r\n");
      out.write("                </span>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"action-icon\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\">\r\n");
      out.write("                        <path d=\"M9 6L9 7C9 8.65685 10.3431 10 12 10C13.6569 10 15 8.65685 15 7V6\" stroke=\"#141718\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                        <path d=\"M9 6L9 7C9 8.65685 10.3431 10 12 10C13.6569 10 15 8.65685 15 7V6\" stroke=\"black\" stroke-opacity=\"0.2\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                        <path d=\"M15.6113 3H8.38836C6.433 3 4.76424 4.41365 4.44278 6.3424L2.77612 16.3424C2.36976 18.7805 4.24994 21 6.72169 21H17.278C19.7498 21 21.6299 18.7805 21.2236 16.3424L19.5569 6.3424C19.2355 4.41365 17.5667 3 15.6113 3Z\" stroke=\"#141718\" stroke-width=\"1.5\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                        <path d=\"M15.6113 3H8.38836C6.433 3 4.76424 4.41365 4.44278 6.3424L2.77612 16.3424C2.36976 18.7805 4.24994 21 6.72169 21H17.278C19.7498 21 21.6299 18.7805 21.2236 16.3424L19.5569 6.3424C19.2355 4.41365 17.5667 3 15.6113 3Z\" stroke=\"black\" stroke-opacity=\"0.2\" stroke-width=\"1.5\" stroke-linejoin=\"round\"/>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                    <span>2</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"\" class=\"action-wrapper\">\r\n");
      out.write("                <span>\r\n");
      out.write("                    Wishlist\r\n");
      out.write("                </span>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"action-icon\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"25\" viewBox=\"0 0 24 25\" fill=\"none\">\r\n");
      out.write("                        <path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M12.6924 7.58369C12.3055 7.955 11.6945 7.955 11.3076 7.58369L10.6152 6.91923C9.80477 6.1415 8.70994 5.66663 7.5 5.66663C5.01472 5.66663 3 7.68134 3 10.1666C3 12.5493 4.28979 14.5167 6.15176 16.1332C8.01532 17.7511 10.2434 18.8241 11.5746 19.3717C11.853 19.4862 12.147 19.4862 12.4254 19.3717C13.7566 18.8241 15.9847 17.7511 17.8482 16.1332C19.7102 14.5167 21 12.5492 21 10.1666C21 7.68134 18.9853 5.66663 16.5 5.66663C15.2901 5.66663 14.1952 6.1415 13.3848 6.91923L12.6924 7.58369ZM12 5.4762C10.8321 4.35543 9.24649 3.66663 7.5 3.66663C3.91015 3.66663 1 6.57678 1 10.1666C1 16.5349 7.97034 20.0516 10.8138 21.2213C11.5796 21.5363 12.4204 21.5363 13.1862 21.2213C16.0297 20.0516 23 16.5349 23 10.1666C23 6.57678 20.0899 3.66663 16.5 3.66663C14.7535 3.66663 13.1679 4.35543 12 5.4762Z\" fill=\"#141718\"/>\r\n");
      out.write("                        <path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M12.6924 7.58369C12.3055 7.955 11.6945 7.955 11.3076 7.58369L10.6152 6.91923C9.80477 6.1415 8.70994 5.66663 7.5 5.66663C5.01472 5.66663 3 7.68134 3 10.1666C3 12.5493 4.28979 14.5167 6.15176 16.1332C8.01532 17.7511 10.2434 18.8241 11.5746 19.3717C11.853 19.4862 12.147 19.4862 12.4254 19.3717C13.7566 18.8241 15.9847 17.7511 17.8482 16.1332C19.7102 14.5167 21 12.5492 21 10.1666C21 7.68134 18.9853 5.66663 16.5 5.66663C15.2901 5.66663 14.1952 6.1415 13.3848 6.91923L12.6924 7.58369ZM12 5.4762C10.8321 4.35543 9.24649 3.66663 7.5 3.66663C3.91015 3.66663 1 6.57678 1 10.1666C1 16.5349 7.97034 20.0516 10.8138 21.2213C11.5796 21.5363 12.4204 21.5363 13.1862 21.2213C16.0297 20.0516 23 16.5349 23 10.1666C23 6.57678 20.0899 3.66663 16.5 3.66663C14.7535 3.66663 13.1679 4.35543 12 5.4762Z\" fill=\"black\" fill-opacity=\"0.2\"/>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                    <span>2</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"sign-in\" style=\"width: 100%;\">\r\n");
      out.write("                ");
      if (_jspx_meth_b_Button_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"search-wrapper\" id=\"search-wrapper\">\r\n");
      out.write("        <img src=\"assets/icons/search.png\" />\r\n");
      out.write("        <input type=\"text\" />\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <img id=\"hero-shop\" src=\"assets/Elements/cover.png\">\n");
      out.write("            <div class=\"hero-text\">\n");
      out.write("                <p>Home > Shop</p>\n");
      out.write("                <h1>Shop Page</h1>\n");
      out.write("                <p>Let’s design the place you always imagined.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                <div class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"1\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/pro1.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Loveseat Sofa</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$199.00</span>\n");
      out.write("                                    <span class=\"price\"><s>$400.00</s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"2\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product2.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Luxury Sofa</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$299.00</span>\n");
      out.write("                                    <span class=\"price\"><s>$500.00</s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"3\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product3.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Table Lamp</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$19.00</span>\n");
      out.write("                                    <span class=\"price\"><s></s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"4\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product4.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Cozy Sofa</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$299.00</span>\n");
      out.write("                                    <span class=\"price\"><s></s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                                    \n");
      out.write("                <div class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"5\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product5.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>White Drawer Unit</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$89.99</span>\n");
      out.write("                                    <span class=\"price\"><s></s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"6\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product6.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Black Tray Table</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$19.99</span>\n");
      out.write("                                    <span class=\"price\"><s></s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"7\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product7.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Table Lamp</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$19.00</span>\n");
      out.write("                                    <span class=\"price\"><s></s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"8\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product8.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Black Brow Side Table</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$16.99</span>\n");
      out.write("                                    <span class=\"price\"><s></s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                                    \n");
      out.write("                <div class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"9\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product9.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Light Beige Pillow</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$3.99</span>\n");
      out.write("                                    <span class=\"price\"><s></s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"10\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product10.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Table Lamp</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$39.99</span>\n");
      out.write("                                    <span class=\"price\"><s></s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"11\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product11.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Bamboo Basket</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$9.99</span>\n");
      out.write("                                    <span class=\"price\"><s></s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a href=\"#\" class=\"pro-card-wrapper\">\n");
      out.write("                            <div class=\"pro-card\" data-product-id=\"12\">\n");
      out.write("                                <div class=\"pro-card-img\">\n");
      out.write("                                    <div class=\"pro-add-to-cart\">\n");
      out.write("                                        ");
      if (_jspx_meth_b_Button_12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"new\">new</div>\n");
      out.write("                                    <div class=\"discount\">-50%</div>\n");
      out.write("                                    <button class=\"add-to-wishlist\"><img src=\"assets/icons/wishlist.png\" /></button>\n");
      out.write("                                    <img src=\"assets/Elements/product12.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pro-card-details\">\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <img src=\"assets/icons/star.png\" />\n");
      out.write("                                </div>\n");
      out.write("                                <h2>Off White Pillow</h2>\n");
      out.write("                                <div class=\"prices\">\n");
      out.write("                                    <span class=\"discount-price\">$7.99</span>\n");
      out.write("                                    <span class=\"price\"><s></s></span>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--Show more btn-->\n");
      out.write("                <button class=\"sm-btn\">Show More</button>                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("                                    \n");
      out.write("        ");
      out.write("<!--News Letter-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <img id=\"hero-shop\" src=\"assets/Elements/newsletter.png\">\n");
      out.write("            <div class=\"hero-text\">\n");
      out.write("                <h2>Join Our Newsletter</h2>\n");
      out.write("                <p>Sign up for deals, new products and promotions</p>\n");
      out.write("                <div class=\"email\">\n");
      out.write("                    <input type=\"email\" placeholder=\"Email adress\">\n");
      out.write("                    <i class=\"fa fa-envelope\"></i>\n");
      out.write("                    <button class=\"submit-btn\" type=\"submit\">Sign Up</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("        \n");
      out.write("    </body>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_b_Button_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_0.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_0.setText("Sign In");
    _jspx_th_b_Button_0.setRounded(false);
    _jspx_th_b_Button_0.setOutlined(false);
    _jspx_th_b_Button_0.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_1.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_1.setText("Add To Cart");
    _jspx_th_b_Button_1.setRounded(false);
    _jspx_th_b_Button_1.setOutlined(false);
    _jspx_th_b_Button_1.setName("add-to-cart");
    _jspx_th_b_Button_1.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_2.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_2.setText("Add To Cart");
    _jspx_th_b_Button_2.setRounded(false);
    _jspx_th_b_Button_2.setOutlined(false);
    _jspx_th_b_Button_2.setName("add-to-cart");
    _jspx_th_b_Button_2.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_3.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_3.setText("Add To Cart");
    _jspx_th_b_Button_3.setRounded(false);
    _jspx_th_b_Button_3.setOutlined(false);
    _jspx_th_b_Button_3.setName("add-to-cart");
    _jspx_th_b_Button_3.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_4.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_4.setText("Add To Cart");
    _jspx_th_b_Button_4.setRounded(false);
    _jspx_th_b_Button_4.setOutlined(false);
    _jspx_th_b_Button_4.setName("add-to-cart");
    _jspx_th_b_Button_4.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_5.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_5.setText("Add To Cart");
    _jspx_th_b_Button_5.setRounded(false);
    _jspx_th_b_Button_5.setOutlined(false);
    _jspx_th_b_Button_5.setName("add-to-cart");
    _jspx_th_b_Button_5.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_6.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_6.setText("Add To Cart");
    _jspx_th_b_Button_6.setRounded(false);
    _jspx_th_b_Button_6.setOutlined(false);
    _jspx_th_b_Button_6.setName("add-to-cart");
    _jspx_th_b_Button_6.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_7.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_7.setText("Add To Cart");
    _jspx_th_b_Button_7.setRounded(false);
    _jspx_th_b_Button_7.setOutlined(false);
    _jspx_th_b_Button_7.setName("add-to-cart");
    _jspx_th_b_Button_7.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_8.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_8.setText("Add To Cart");
    _jspx_th_b_Button_8.setRounded(false);
    _jspx_th_b_Button_8.setOutlined(false);
    _jspx_th_b_Button_8.setName("add-to-cart");
    _jspx_th_b_Button_8.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_9.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_9.setText("Add To Cart");
    _jspx_th_b_Button_9.setRounded(false);
    _jspx_th_b_Button_9.setOutlined(false);
    _jspx_th_b_Button_9.setName("add-to-cart");
    _jspx_th_b_Button_9.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_10.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_10.setText("Add To Cart");
    _jspx_th_b_Button_10.setRounded(false);
    _jspx_th_b_Button_10.setOutlined(false);
    _jspx_th_b_Button_10.setName("add-to-cart");
    _jspx_th_b_Button_10.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_11.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_11.setText("Add To Cart");
    _jspx_th_b_Button_11.setRounded(false);
    _jspx_th_b_Button_11.setOutlined(false);
    _jspx_th_b_Button_11.setName("add-to-cart");
    _jspx_th_b_Button_11.doTag();
    return false;
  }

  private boolean _jspx_meth_b_Button_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  b:Button
    myPackage.ui.Button _jspx_th_b_Button_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(myPackage.ui.Button.class) : new myPackage.ui.Button();
    _jspx_th_b_Button_12.setJspContext(_jspx_page_context);
    _jspx_th_b_Button_12.setText("Add To Cart");
    _jspx_th_b_Button_12.setRounded(false);
    _jspx_th_b_Button_12.setOutlined(false);
    _jspx_th_b_Button_12.setName("add-to-cart");
    _jspx_th_b_Button_12.doTag();
    return false;
  }
}
