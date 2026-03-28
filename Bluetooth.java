class Bluetooth {
    static byte version = 5;
    static short manufacturingYear = 2023;
    static int price = 1999;
    static float rangeInMeters = 10.5f;
    static boolean isWireless = true;

    public static void main(String[] args) 
	{
        byte version = 4;
        short manufacturingYear = 2024;
        int price = 2499;
        float rangeInMeters = 15.0f;
        boolean isWireless = false;

        System.out.println(Bluetooth.version);
        System.out.println( Bluetooth.manufacturingYear);
        System.out.println( Bluetooth.price);
        System.out.println( Bluetooth.rangeInMeters);
        System.out.println( Bluetooth.isWireless);
        System.out.println("----------------------");
        System.out.println( version);
        System.out.println( manufacturingYear);
        System.out.println( price);
        System.out.println( rangeInMeters);
        System.out.println(isWireless);
    }
}