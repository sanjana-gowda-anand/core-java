class Headphone {

    String brandName;
    int modelNumber;
    double price;
	char type;
    boolean isWireless;

    public Headphone() 
    {
        this("Sony", 101, 2999.99,true);
        System.out.println("Details 1st");
    }

    public Headphone(String brandName)
    {
        System.out.println("Brand name:" + brandName);
        System.out.println("Details 2nd");
    }

    public Headphone(String brandName, int modelNumber)
    {
        System.out.println("Brand name:" + brandName);
        System.out.println("Model Number:" + modelNumber);
        System.out.println("Details 3rd");
    }

    public Headphone(String brandName, int modelNumber, double price) 
    {
        System.out.println("Brand name:" + brandName);
        System.out.println("Model Number:" + modelNumber);
        System.out.println("Price:" + price);
        System.out.println("Details 4th");
    }

    public Headphone(String brandName, int modelNumber, double price, boolean isWireless) 
    {
        System.out.println("Brand name:" + brandName);
        System.out.println("Model Number:" + modelNumber);
        System.out.println("Price:" + price);
        System.out.println("Wireless:" + isWireless);
        System.out.println("Details 5th");
    }
	 public Headphone(String brandName, int modelNumber, double price, boolean isWireless,char type) 
    {
        System.out.println("Brand name:" + brandName);
        System.out.println("Model Number:" + modelNumber);
        System.out.println("Price:" + price);
        System.out.println("Wireless:" + isWireless);
		System.out.println("Type:" + type);
        System.out.println("Details 6th");
    }
}