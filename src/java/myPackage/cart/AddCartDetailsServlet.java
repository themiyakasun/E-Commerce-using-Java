package myPackage.cart;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Float.NaN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import myPackage.DbUtil;

public class AddCartDetailsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String total = request.getParameter("total");
        
        float totalFloat = Float.parseFloat(total);
        
        if(Float.isNaN(totalFloat)){
            totalFloat = (float) 0.11;
        }
        
        
        try(Connection conn = DbUtil.getConnection()){
            String query = "INSERT INTO orders (total) VALUES (?)";
            try(PreparedStatement statement = conn.prepareStatement(query)){
                statement.setFloat(1, totalFloat);
                statement.executeUpdate();
            }
        }catch(SQLException e){
            e.getMessage();
        }
    }

}
