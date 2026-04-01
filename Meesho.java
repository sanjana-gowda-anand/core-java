class Meesho {
    String productName;
    int orderId;
    double price;
    String category;
    String deliveryAddress;

    public Meesho(String productName,int orderId, double price,String category,String deliveryAddress) 
	{
        this.productName=productName;
        this.orderId=orderId;
        this.price=price;
        this.category=category;
        this.deliveryAddress=deliveryAddress;
    }

    public void show()
	{
        System.out.println(productName);
        System.out.println(orderId);
        System.out.println(price);
        System.out.println(category);
        System.out.println(deliveryAddress);
    }
}