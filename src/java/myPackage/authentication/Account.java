//hi
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage.authentication;

/**
 *
 * @author fernandomnr
 */
public class Account {

    protected int id;
    protected String first_name;
    protected String last_name;
    protected String display_name;
    protected String email;
    protected String password;
    protected String billing_phone;
    protected String billing_address;
    protected String shipping_phone;
    protected String shipping_address;

    public Account(int id, String first_name, String last_name, String display_name, String email, String password, String billing_phone, String billing_address, String shipping_phone, String shipping_address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.display_name = display_name;
        this.email = email;
        this.password = password;
        this.billing_phone = billing_phone;
        this.billing_address = billing_address;
        this.shipping_phone = shipping_phone;
        this.shipping_address = shipping_address;
    }

    public Account(String first_name, String last_name, String display_name, String email, String password, String billing_phone, String billing_address, String shipping_phone, String shipping_address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.display_name = display_name;
        this.email = email;
        this.password = password;
        this.billing_phone = billing_phone;
        this.billing_address = billing_address;
        this.shipping_phone = shipping_phone;
        this.shipping_address = shipping_address;
    }

    public Account(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public Account(String first_name, String last_name, String display_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.display_name = display_name;
        this.email = email;
        
    }

    public Account(int id, String first_name, String last_name,String email) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        
    }

    public Account(int id, String first_name, String last_name, String display_name, String email) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.display_name = display_name;
        this.email = email;
    }
    


    public Account(int id, String first_name, String last_name, String display_name, String email, String password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.display_name = display_name;
        this.email = email;
        this.password = password;
    }

    

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBilling_phone(String billing_phone) {
        this.billing_phone = billing_phone;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    public void setShipping_phone(String shipping_phone) {
        this.shipping_phone = shipping_phone;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getBilling_phone() {
        return billing_phone;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public String getShipping_phone() {
        return shipping_phone;
    }

    public String getShipping_address() {
        return shipping_address;
    }


}