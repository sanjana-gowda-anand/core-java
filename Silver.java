class Silver{
    static byte purityLevel = 92;        
    static short manufacturingYear = 2022;
    static int pricePerKg = 75000;
    static float weightInGrams = 500.5f;
    static double marketRate = 78.45;

    public static void main(String[] args) 
	{
        byte purityLevel = 95;
        short manufacturingYear = 2024;
        int pricePerKg = 82000;
        float weightInGrams = 750.0f;
        double marketRate = 80.75;

        System.out.println(Silver.purityLevel);
        System.out.println(Silver.manufacturingYear);
        System.out.println(Silver.pricePerKg);
        System.out.println(Silver.weightInGrams);
        System.out.println(Silver.marketRate);
        System.out.println("----------------------");
        System.out.println(purityLevel);
        System.out.println(manufacturingYear);
        System.out.println(pricePerKg);
        System.out.println(weightInGrams);
        System.out.println(marketRate);
    }
}