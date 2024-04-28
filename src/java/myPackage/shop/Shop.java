package myPackage.shop;

public class Shop {
    int proId;
    String proName;
    double discountPrice;
    double proPrice;
    String proImg;
    
    public Shop (int proId, String proName, double discountPrice, double proPrice, String proImg) {
        this.proId = proId;
        this.proName = proName;
        this.discountPrice = discountPrice;
        this.proPrice = proPrice;
        this.proImg = proImg;
    }
    
    public int getProId(){
        return proId;
    }
    
    public void setProId(int proId){
        this.proId = proId;
    }
    
    public String getProName(){
        return proName;
    }
    
    public void setProName(String proName){
        this.proName = proName;
    }
    
    public double getDiscountPrice(){
        return discountPrice;
    }
    
    public void setDiscountPrice(double discountPrice){
        this.discountPrice = discountPrice;
    }
    
    public double getProPrice(){
        return proPrice;
    }
    
    public void setProPrice(double proPrice){
        this.proPrice = proPrice;
    }
    
    public String getProImg(){
        return proImg;
    }
    
    public void setProImg(String proImg){
        this.proImg = proImg;
    }
}
