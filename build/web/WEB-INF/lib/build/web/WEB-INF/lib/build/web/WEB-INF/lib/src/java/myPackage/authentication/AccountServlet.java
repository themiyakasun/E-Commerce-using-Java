package myPackage.authentication;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/myaccount")
public class AccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final int demoUserId=1;
    private AccountDao accountDao;

    public AccountServlet() {
        this.accountDao = new AccountDao();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    String requestType = request.getParameter("requestType");
    try {
        switch (requestType) {
            case "update":
                updateUser(request, response);
                break;
            case "up_billing_addr":
                updateBillingAddr(request, response);
                break;
            case "up_shipping_addr":
                updateShippingAddr(request, response);
                break;       
        }
    } catch (SQLException ex) {
        Logger.getLogger(AccountServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
        System.out.println("In Do Post");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        try {
            if(action!=null){
                if(action.equals("details")){
                    getDetails(request, response);
                }
                else if(action.equals("address")){
                    getAddress(request, response);           
                }                 
            }          
        } catch (SQLException ex) {
            Logger.getLogger(AccountServlet.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    private void getDetails(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
         Account user = accountDao.selectUser(demoUserId);
        request.setAttribute("user", user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("includes/AccountProfile/accountProfileForm.jsp");
        dispatcher.forward(request, response);
    }
    
    private void getAddress(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
         Account user = accountDao.selectUser(demoUserId);
        request.setAttribute("user", user);
        System.out.println(user.getBilling_name());
        System.out.println(user.getShipping_name());
        RequestDispatcher dispatcher = request.getRequestDispatcher("includes/AccountProfile/accountAddressForm.jsp");
        dispatcher.forward(request, response);
    }
    

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, ServletException, IOException {
        int user_id = Integer.parseInt(request.getParameter("user_id"));
        Account existingAccount = accountDao.selectUser(user_id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        request.setAttribute("account", existingAccount);
        dispatcher.forward(request, response);
    }

//    private void insertUser(HttpServletRequest request, HttpServletResponse response)
//    throws SQLException, IOException {
//        String first_name = request.getParameter("firsr_name");
//        String last_name =  request.getParameter("last_name");
//        String display_name= request.getParameter("display_name");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        String billing_phone = request.getParameter("billing_phone");
//        String billing_address = request.getParameter("billing_address");
//        String shipping_phone=  request.getParameter("shipping_phone");
//        String shipping_address = request.getParameter("shipping_address");
//        Account newAccount = new Account(first_name,last_name,display_name, email,password,billing_phone,billing_address,shipping_phone,shipping_address);
//        accountDao.insertUser(newAccount);
//        response.sendRedirect("list");
//    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int user_id = Integer.parseInt(request.getParameter("user_id"));
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String display_name = request.getParameter("display_name");
        String email = request.getParameter("email");
        String new_password = request.getParameter("new_password");
        String confirmPassword = request.getParameter("confirm_password");
        String real_password = request.getParameter("real_password");
        String old_password = request.getParameter("old_password");

        if (!real_password.equals(old_password)) {
           request.setAttribute("error", "Old password is incorrect!");
           RequestDispatcher dispatcher = request.getRequestDispatcher("includes/AccountProfile/accountProfileForm.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException ex) {
                Logger.getLogger(AccountServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            return; 
        }
        if (!new_password.equals(confirmPassword)) {
            request.setAttribute("error", "Passwords do not match!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("includes/AccountProfile/accountProfileForm.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException ex) {
                Logger.getLogger(AccountServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        }
        System.out.println("hi this is servlet");
        Account account = new Account(user_id,first_name, last_name, display_name, email,new_password);
        System.out.println("this is servlet and after making object");   
        accountDao.updateUser(account);
        response.sendRedirect("myaccount?action=details"); 
    }
    
    private void updateBillingAddr(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int user_id = Integer.parseInt(request.getParameter("user_id"));
        System.out.println(user_id); 
        String billing_name = request.getParameter("billing_name");
        String billing_phone = request.getParameter("billing_phone");
        String billing_address = request.getParameter("billing_address");
        Account account = new Account(user_id,billing_name,billing_phone, billing_address,true);
        System.out.println("this is servlet and after making object");
        accountDao.updateBillingAdress(account);
        response.sendRedirect("myaccount?action=address");
    }
    
    private void updateShippingAddr(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int user_id = Integer.parseInt(request.getParameter("user_id"));
        System.out.println(user_id); 
        String shipping_name = request.getParameter("shipping_name");
        String shipping_phone = request.getParameter("shipping_phone");
        String shipping_address = request.getParameter("shipping_address");
        Account account = new Account(user_id,shipping_name,shipping_phone, shipping_address,false);
        System.out.println("this is servlet and after making object");
        accountDao.updateShippingAddress(account);
        response.sendRedirect("myaccount?action=address");
    }
}