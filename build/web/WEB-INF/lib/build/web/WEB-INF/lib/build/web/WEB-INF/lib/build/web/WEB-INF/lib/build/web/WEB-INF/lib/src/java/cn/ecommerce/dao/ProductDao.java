package cn.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import cn.ecommerce.model.*;

public class ProductDao {
    private final Connection con;
    private String query;
    private PreparedStatement pst;
    private ResultSet rs;
    public ProductDao(Connection con) {
        this.con = con;
    }
    
    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<Product>();
        
        try {
            query = "select * from products";
            pst = this.con.prepareStatement(query);
            rs = pst.executeQuery();
            while(rs.next()) {
                Product row = new Product();
                row.setId(rs.getInt("id"));
                row.setName(rs.getString("name"));
                row.setDicountPrice(rs.getString("discount_price"));
                row.setPrice(rs.getString("price"));
                row.setImage(rs.getString("image"));
                
                products.add(row);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    
}
