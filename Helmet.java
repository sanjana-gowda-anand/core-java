class Helmet {

    static short manufacturingYear = 2023;
    static int price = 2500;
    static long serialNumber = 4567891234L;
    static float weight = 1.2f;
    static double rating = 4.5;

    public static void main(String[] args)
	{
        short manufacturingYear = 2024;
        int price = 3200;
        long serialNumber = 9876543210L;
        float weight = 1.5f;
        double rating = 5.0;

        System.out.println( Helmet.manufacturingYear);
        System.out.println( Helmet.price);
        System.out.println(Helmet.serialNumber);
        System.out.println( Helmet.weight);
        System.out.println( Helmet.rating);
        System.out.println("----------------------");
        System.out.println( manufacturingYear);
        System.out.println( price);
        System.out.println( serialNumber);
        System.out.println( weight);
        System.out.println( rating);
    }
}