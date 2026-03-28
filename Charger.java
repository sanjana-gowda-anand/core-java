class Charger {
    static String brand = "Samsung";//static
    static int watts = 25;          
    static char type = 'C';        

    public static void main(String[] args) 
	{
        int batteryLevel = 40;//local
        double price = 999.0;
        String color = "White";
		
		System.out.println("BRAND="+brand);
		System.out.println("WATTS="+watts);
		System.out.println("CHARGER TYPE="+type);
		System.out.println("BATERRY LEVEL ="+batteryLevel);
		System.out.println("PRICE="+price);
        System.out.println("COLOR="+color);

    }
}