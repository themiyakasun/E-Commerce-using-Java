package myPackage.cart;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<CartItem> cartItems = getCartItemsFromDb();
        request.setAttribute("cartItems", cartItems);
        request.getRequestDispatcher("/cart.jsp").forward(request, response);
    }
    
    private ArrayList<CartItem> getCartItemsFromDb() {
        ArrayList<CartItem> cartItems = new ArrayList<>();
        cartItems.add(new CartItem("Tray Table", 2, 19.00));
        return cartItems;
    }

}
