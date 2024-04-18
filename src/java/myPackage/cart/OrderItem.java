package myPackage.cart;

public class OrderItem {
    private int orderId;
    private double total;
    private String shippingMethod;
    private int proId;
    private int quantity;
    private String productName;
    private String productImg;
    private double productPrice;
    
    public OrderItem(int orderId, double total, String shippingMethod, int proId, int quantity, String productName, String productImg, double productPrice){
        this.orderId = orderId;
        this.total = total;
        this.shippingMethod = shippingMethod;
        this.proId = proId;
        this.quantity = quantity;
        this.productName = productName;
        this.productImg = productImg;
        this.productPrice = productPrice;
    }
    
    public int getOrderId(){
        return orderId;
    }
    
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    
    public double getTotal(){
        return total;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
    
    public String getShippingMethod(){
        return shippingMethod;
    }
    
    public void setShippingMethod(String shippingMethod){
        this.shippingMethod = shippingMethod;
    }
    
    public int getProId(){
        return proId;
    }
    
    public void setProId(int proId){
        this.proId = proId;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public String getProductName(){
        return productName;
    }
    
    public void setProductName(String productName){
        this.productName = productName;
    }
    
    public String getProductImg(){
        return productImg;
    }
    
    public void setProductImg(String productImg){
        this.productImg = productImg;
    }
    
    public double getProductPrice(){
        return productPrice;
    }
    
    public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
    }
}
