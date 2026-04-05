class Laptop {

    String brandName;
    String processor;
    int ram;
    double price;
	boolean isTouchScreen;

    public Laptop() 
    {
        this("Dell", "i5", 8);
        System.out.println("Details 1st");
    }

    public Laptop(String brandName)
    {
        System.out.println("Brand name:" + brandName);
        System.out.println("Details 2nd");
    }

    public Laptop(String brandName, String processor)
    {
        System.out.println("Brand name:" + brandName);
        System.out.println("Processor:" + processor);
        System.out.println("Details 3rd");
    }

    public Laptop(String brandName, String processor, int ram) 
    {
        System.out.println("Brand name:" + brandName);
        System.out.println("Processor:" + processor);
        System.out.println("RAM:" + ram + "GB");
        System.out.println("Details 4th");
    }

    public Laptop(String brandName, String processor, int ram, double price) 
    {
        System.out.println("Brand name:" + brandName);
        System.out.println("Processor:" + processor);
        System.out.println("RAM:" + ram + "GB");
        System.out.println("Price:" + price);
        System.out.println("Details 5th");
    }
	public Laptop(String brandName, String processor, int ram, double price,boolean isTouchScreen) 
    {
        System.out.println("Brand name:" + brandName);
        System.out.println("Processor:" + processor);
        System.out.println("RAM:" + ram + "GB");
        System.out.println("Price:" + price);
		System.out.println("Touch Screen:" +isTouchScreen );
        System.out.println("Details 6th");
    }
}