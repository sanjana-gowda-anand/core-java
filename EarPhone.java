class EarPhone {
    static byte numberOfEarbuds = 2;
    static short manufacturingYear = 2023;
    static int price = 1499;
    static float wireLength = 1.2f;
    static char soundQuality = 'A';

    public static void main(String[] args) 
	{
        byte numberOfEarbuds = 1;
        short manufacturingYear = 2024;
        int price = 1999;
        float wireLength = 1.5f;
        char soundQualityGrade = 'B';

        System.out.println( EarPhone.numberOfEarbuds);
        System.out.println(EarPhone.manufacturingYear);
        System.out.println( EarPhone.price);
        System.out.println( EarPhone.wireLength);
        System.out.println( EarPhone.soundQuality);
        System.out.println("----------------------");
        System.out.println(numberOfEarbuds);
        System.out.println( manufacturingYear);
        System.out.println( price);
        System.out.println(wireLength);
        System.out.println( soundQuality);
    }
}