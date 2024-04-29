package myPackage.authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import myPackage.DbUtil;

public class AccountDao {
    
    private static final String SELECT_USER_BY_ID = "select first_name,last_name, display_name,email,password,billing_phone,billing_address,shipping_phone,shipping_address, billing_name, shipping_name from user where user_id =?";
    private static final String UPDATE_USERS_SQL = "update user set first_name=?, last_name=?, display_name=?, email=?, password=?  WHERE user_id=?";
    private static final String UPDATE_BILLING_ADDRESS = "update user set billing_name=?,billing_phone=?,billing_address=?  WHERE user_id=?";
    private static final String UPDATE_SHIPPING_ADDRESS = "update user set shipping_name=?,shipping_phone=?,shipping_address=?  WHERE user_id=?";
    private static final String SELECT_ALL_ORDERS = "SELECT * FROM orders WHERE user_id=?";

    public AccountDao() {}


//slect user by id
    public Account selectUser(int user_id) {
        Account account = null;
        try (Connection connection = DbUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, user_id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String display_name = rs.getString("display_name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String billing_phone = rs.getString("billing_phone");
                String billing_address = rs.getString("billing_address");
                String shipping_phone = rs.getString("shipping_phone");
                String shipping_address = rs.getString("shipping_address");
                String billing_name = rs.getString("billing_name");
                String shipping_name = rs.getString("shipping_name");

                System.out.println("first_name: " + first_name);
                System.out.println("billing_name: " + billing_name);
                System.out.println("shipping_name: " + shipping_name);
                account = new Account(user_id, first_name, last_name, display_name, email, password, billing_phone, billing_address, shipping_phone, shipping_address, billing_name, shipping_name);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return account;
    }

    public boolean updateUser(Account account) throws SQLException {
        boolean rowUpdated;
        System.out.println("hi this is Dao");

        try (Connection connection = DbUtil.getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, account.getFirst_name());
            statement.setString(2, account.getLast_name());
            statement.setString(3, account.getDisplay_name());
            statement.setString(4, account.getEmail());
            statement.setString(5, account.getPassword());
            statement.setInt(6, account.getUser_id());

            System.out.println("hi this is dao after seting values");
            rowUpdated = statement.executeUpdate() > 0;
            System.out.println("hi this is after raw update");

        }
        return rowUpdated;
    }
    public boolean updateBillingAdress(Account account) throws SQLException {
        boolean rowUpdated;
        System.out.println("hi this is Dao");

        try (Connection connection = DbUtil.getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_BILLING_ADDRESS);) {
            statement.setString(1, account.getBilling_name());
            statement.setString(2, account.getBilling_phone());
            statement.setString(3, account.getBilling_address());
            statement.setInt(4, account.getUser_id());

            System.out.println("hi this is dao after seting values");
            rowUpdated = statement.executeUpdate() > 0;
            System.out.println("hi this is after raw update");
        }
        return rowUpdated;
    }

    public boolean updateShippingAddress(Account account) throws SQLException {
        boolean rowUpdated;
        System.out.println("hi this is Dao");

        try (Connection connection = DbUtil.getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_SHIPPING_ADDRESS);) {
            statement.setString(1, account.getShipping_name());
            statement.setString(2, account.getShipping_phone());
            statement.setString(3, account.getShipping_address());
            statement.setInt(4, account.getUser_id());

            System.out.println("hi this is dao after seting values");
            rowUpdated = statement.executeUpdate() > 0;
            System.out.println("hi this is after raw update");
        }
        return rowUpdated;
    }

    public List<Order> selectAllOrders(int user_id) {
        List<Order> myorders = new ArrayList<>();
        try (Connection connection = DbUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ORDERS)) {
            preparedStatement.setInt(1, user_id); // Set the user_id parameter
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int order_id = rs.getInt("order_id");
                String order_code = rs.getString("order_code");
                float total = rs.getFloat("total"); // Assuming total is a float type in the database
                String shipping_method = rs.getString("shipping_method");
                String order_date = rs.getString("order_date");

                // Create a new Order object and add it to the list
                Order order = new Order(order_id, order_code, total, shipping_method, order_date);
                myorders.add(order);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return myorders;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    boolean checkPassword(int id, String old_password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
