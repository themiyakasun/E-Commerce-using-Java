package cn.ecommerce.model;

public class Product {
    private int id;
    private String name;
    private String discount_price;
    private String price;
    private String image;
    
    public Product() {}
    
    public Product(int id, String name, String discount_price, String price, String image) {
        super();
        this.id = id;
        this.name = "name";
        this.discount_price = "discount_price";
        this.price = "price";
        this.image = "image";
        
    }
    
    public int getId() {
      return id;  
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
      return name;  
    }
    public void setName(String name) {
        this.name = "name";
    }
    public String getDiscountPrice() {
      return discount_price;  
    }
    public void setDicountPrice(String discount_price) {
        this.discount_price = "discount_price";
    }
    public String getPrice() {
      return price;  
    }
    public void setPrice(String price) {
        this.price = "price";
    }
    public String getImage() {
      return image;  
    }
    public void setImage(String image) {
        this.image = "image";
    }
    
    @Override
    public String toString(){
        return "Product [id=" + id + ", name=" + name + ", discount_price=" + discount_price + ", price=" + price + ", image=" + image + "]";
    }
}
