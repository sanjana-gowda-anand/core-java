class Amazon {

    String itemName;
    int productId;
    double price;
    int quantity;
	boolean isDelivered;


    public Amazon() 
    {
        this("Headphone", 5001,99.99);
        System.out.println("Details 1st");
    }

    public Amazon(String itemName)
    {
        System.out.println("Item name:" + itemName);
        System.out.println("Details 2nd");
    }

    public Amazon(String itemName, int productId)
    {
        System.out.println("Item name:" + itemName);
        System.out.println("Product Id:" + productId);
        System.out.println("Details 3rd");
    }

    public Amazon(String itemName, int productId, double price) 
    {
        System.out.println("Item name:"+itemName);
        System.out.println("Product Id:" + productId);
        System.out.println("Price:" + price);
        System.out.println("Details 4th");
    }

    public Amazon(String itemName, int productId, double price, int quantity) 
    {
        System.out.println("Item name:" + itemName);
        System.out.println("Product Id:" + productId);
        System.out.println("Price:" + price);
        System.out.println("Quantity:" + quantity);
        System.out.println("Details 5th");
    }
	public Amazon(String itemName, int productId, double price, int quantity,boolean isDelivered ) 
    {
        System.out.println("Item name:" + itemName);
        System.out.println("Product Id:" + productId);
        System.out.println("Price:" + price);
        System.out.println("Quantity:" + quantity);
		System.out.println("Delivered:" + isDelivered);
        System.out.println("Details 6th");
    }
	
}