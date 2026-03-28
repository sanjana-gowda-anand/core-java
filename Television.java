class Television {
    static String brand = "Samsung";//static
    static int screenSize = 43;
    static boolean isSmartTV = true;

    public static void main(String[] args)
	{
        int volume= 15;//local
        double price = 35000.0;
		short channels=60;
		
		System.out.println("BRAND ="+brand);
		System.out.println("SCREEN SIZE="+screenSize);
		System.out.println("IS_SMART TV="+isSmartTV);
		System.out.println("VOLUME LEVEL="+volume);
		System.out.println("PRICE ="+price);
        System.out.println("NUMBER OF CHANNELS ="+channels);

    }
}