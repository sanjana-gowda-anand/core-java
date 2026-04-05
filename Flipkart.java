class Flipkart {

    String productName;
    int productId;
    double price;
    int quantity;

    public Flipkart() 
    {
        this("Shoes", 2001, 1499.0);
        System.out.println("Details 1st");
    }

    public Flipkart(String productName)
    {
        System.out.println("Product name:" + productName);
        System.out.println("Details 2nd");
    }

    public Flipkart(String productName, int productId)
    {
        System.out.println("Product name:" + productName);
        System.out.println("Product Id:" + productId);
        System.out.println("Details 3rd");
    }

    public Flipkart(String productName, int productId, double price) 
    {
        System.out.println("Product name:" + productName);
        System.out.println("Product Id:" + productId);
        System.out.println("Price:" + price);
        System.out.println("Details 4th");
    }

    public Flipkart(String productName, int productId, double price, int quantity) 
    {
        System.out.println("Product name:" + productName);
        System.out.println("Product Id:" + productId);
        System.out.println("Price:" + price);
        System.out.println("Quantity:" + quantity);
        System.out.println("Details 5th");
    }
}