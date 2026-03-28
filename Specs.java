class Specs {
    static String brand = "Titan";//static
    static int frameSize = 50;            
    static float lensPower = 1.5f;        

    public static void main(String[] args) {
        int hours = 6;//local
        double price = 3500.0;
        String color = "Black";
		
		System.out.println("BRAND="+brand);
		System.out.println("FRAME SIZE="+frameSize);
		System.out.println("LENS POWER="+lensPower);
		System.out.println("USING HOURS="+hours);
		System.out.println("PRICE="+price);
        System.out.println("FRAME COLOR="+color);

    }
}