/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage.authentication;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
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
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
               case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertUser(request, response);
                    break;
                case "/delete":
                    deleteUser(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateUser(request, response);
                    break;
                default:
                    getUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void getUser(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
         Account user = accountDao.selectUser(demoUserId);
        request.setAttribute("user", user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("includes/accountProfileForm.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Account existingAccount = accountDao.selectUser(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        request.setAttribute("account", existingAccount);
        dispatcher.forward(request, response);

    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        String first_name = request.getParameter("firsr_name");
        String last_name =  request.getParameter("last_name");
        String display_name= request.getParameter("display_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String billing_phone = request.getParameter("billing_phone");
        String billing_address = request.getParameter("billing_address");
        String shipping_phone=  request.getParameter("shipping_phone");
        String shipping_address = request.getParameter("shipping_address");
        Account newAccount = new Account(first_name,last_name,display_name, email,password,billing_phone,billing_address,shipping_phone,shipping_address);
        accountDao.insertUser(newAccount);
        response.sendRedirect("list");
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String first_name = request.getParameter("firsr_name");
        String last_name =  request.getParameter("last_name");
        String display_name= request.getParameter("display_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String billing_phone = request.getParameter("billing_phone");
        String billing_address = request.getParameter("billing_address");
        String shipping_phone=  request.getParameter("shipping_phone");
        String shipping_address = request.getParameter("shipping_address");
        Account newAccount = new Account(first_name,last_name,display_name, email,password,billing_phone,billing_address,shipping_phone,shipping_address);

        accountDao.updateUser(newAccount);
        response.sendRedirect("list");
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        accountDao.deleteUser(id);
        response.sendRedirect("list");

    }
}