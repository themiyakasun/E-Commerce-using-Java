/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage.authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernandomnr
 */
public class AccountDao {



    private String jdbcURL = "jdbc:mysql://localhost:3306/account?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "";

    private static final String INSERT_USERS_SQL = "INSERT INTO user" + " (first_name,last_name,display_name, email,password,billing_phone,billing_address,shipping_phone,shipping_address) VALUES " +
        " (?,?,?,?,?,?,?,?,?);";

    private static final String SELECT_USER_BY_ID = "select first_name,last_name, email  from user where id =?";
    private static final String SELECT_ALL_USERS = "select * from user";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set first_name = ?,last_name = ?, display_name = ?, email = ?, password = ?,   where id = ?;";

 //Create or Insert user

    public AccountDao() {}

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    public void insertUser(Account account) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, account.getFirst_name());
            preparedStatement.setString(2, account.getLast_name());
            preparedStatement.setString(3, account.getDisplay_name());
            preparedStatement.setString(4, account.getEmail());
            preparedStatement.setString(5, account.getPassword());
            preparedStatement.setString(6, account.getBilling_phone());
            preparedStatement.setString(7, account.getBilling_address());
            preparedStatement.setString(8, account.getShipping_phone());
            preparedStatement.setString(9, account.getShipping_address());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
//slect user by id
    public Account selectUser(int id) {
        Account account = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
//            while (rs.next()) {
//                String first_name = rs.getString("first_name");
//                String last_name = rs.getString("last_name");
//                String display_name = rs.getString("display_name");
//                String email = rs.getString("email");
//                String password = rs.getString("password");
//                String billing_phone = rs.getString("billing_phone");
//                String billing_address = rs.getString("billing_address");
//                String shipping_phone = rs.getString("shipping_phone");
//                String shipping_address = rs.getString("shipping_address");
//                account = new Account(id,first_name,last_name,display_name, email,password,billing_phone,billing_address,shipping_phone,shipping_address);
//            }
            while (rs.next()) {
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String email = rs.getString("email");
                account = new Account(first_name,last_name,email);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return account;
    }
//Select all users
    public List < Account > selectAllUsers() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < Account > account = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String display_name = rs.getString("display_name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String billing_phone = rs.getString("billing_phone");
                String billing_address = rs.getString("billing_address");
                String shipping_phone = rs.getString("shipping_phone");
                String shipping_address = rs.getString("shipping_address");
                account.add(new Account(id,first_name,last_name,display_name, email,password,billing_phone,billing_address,shipping_phone,shipping_address ));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return account;
    }
//delete user
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
//update user
    public boolean updateUser(Account account) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, account.getFirst_name());
            statement.setString(2, account.getLast_name());
            statement.setString(3, account.getDisplay_name());
            statement.setString(4, account.getEmail());
            statement.setString(5, account.getPassword());
            statement.setString(6, account.getBilling_phone());
            statement.setString(7, account.getBilling_address());
            statement.setString(8, account.getShipping_phone());
            statement.setString(9,account .getShipping_address());
            statement.setInt(10, account.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
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
}
