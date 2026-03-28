class Phone {
    public static void main(String[] args)
	{
        System.out.println("What is your brand name");
        getBrand();
        System.out.println("What are the features");
        String os = "Android";
        int storage = 128;
        boolean isWaterproof = true;
        displayFeatures(os, storage, isWaterproof);
        double price = getPrice();
        System.out.println(price);
    }

    static void getBrand() 
	{
        System.out.println("I am Samsung Galaxy Y27");
    }

    static void displayFeatures(String os, int storage, boolean isWaterproof) {
        System.out.println(os);
        System.out.println(storage);
        System.out.println(isWaterproof);
    }

    static double getPrice() 
	{
        System.out.println("Calculating price");
        double price = 599.99;
        return price;
    }
}