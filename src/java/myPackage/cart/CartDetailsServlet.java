package myPackage.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import myPackage.DbUtil;

@WebServlet(name = "CartDetailsServlet", urlPatterns = {"/CartDetailsServlet"})
public class CartDetailsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String total = request.getParameter("total_price");
        
        float totalFloat = Float.parseFloat(total);
        
        if(Float.isNaN(totalFloat)){
            totalFloat = (float) 0.11;
        }
        
        String cartItemsJson = request.getParameter("cart_items");
        String shippingMethod = request.getParameter("shipping_method");
        int userId = getUserIdFromSession();
        
        
        try(Connection conn = DbUtil.getConnection()){
            String query = "INSERT INTO orders (order_code, user_id, cart_items, total, shipping_method) VALUES (?, ?, ?, ?, ?)";
            try(PreparedStatement statement = conn.prepareStatement(query)){
                String orderCode = generateUniqueOrderCode(conn);
                statement.setString(1, orderCode);
                statement.setInt(2, userId);
                statement.setString(3, cartItemsJson);
                statement.setFloat(4, totalFloat);
                statement.setString(5, shippingMethod);
                statement.executeUpdate();
                
                response.setContentType("text/plain");
                PrintWriter out = response.getWriter();
                out.print("Success: Order placed successfully!");
            }
        }catch(SQLException e){
            e.printStackTrace();
            e.getMessage();
        }
    }
    
    private String generateUniqueOrderCode(Connection conn) throws SQLException {
        String orderCode;
        do {
          int random3Digit = (int) (Math.random() * 900) + 100;
          int random8Digit = (int) (Math.random() * 100000000);

          orderCode = "#" + random3Digit + "_" + random8Digit;

          
        } while (orderCodeAlreadyExists(conn, orderCode)); 

         return orderCode;
    }
    
    private boolean orderCodeAlreadyExists(Connection conn, String orderCode)throws SQLException {
          String checkQuery = "SELECT * FROM orders WHERE order_code = ?";
          try (PreparedStatement checkStatement = conn.prepareStatement(checkQuery)) {
            checkStatement.setString(1, orderCode);
            try(ResultSet result = checkStatement.executeQuery()){
                if(result.next()){
                    int count = result.getInt(1);
                    if(count > 0){
                        return true;
                    }
                }
            }
          }
          
          return false;
    }
    
    private int getUserIdFromSession() {
        return 2;
    }
}


