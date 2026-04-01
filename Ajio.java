class Ajio{
 String productName;
 int productId;
 int orderId;
 double price;
 
 public Ajio(String productName,int productId,int orderId,double price)
 {
 this.productName=productName;
 this.productId=productId;
 this.orderId=orderId;
 this.price=price;
 }
 
 public void show()
 {
 System.out.println(productName);
 System.out.println(productId);
 System.out.println(orderId);
  System.out.println(price);
}
 
}