class Door {
    static String material = "Wood";//static
    static float thickness = 1.5f;         
    static boolean isLock = true;

    public static void main(String[] args)
	{
        int number = 101;//local
        double price = 8500.75;
        String color = "Brown";
		
		System.out.println("MATERIALS="+material);
		System.out.println("THICKNESS="+1.5f);
		System.out.println("IS_LOCK="+true);
		System.out.println("DOOR NUMBER="+number);
		System.out.println("PRICE="+price);
        System.out.println("COLOR="+color);

    }
}