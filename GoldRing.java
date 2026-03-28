class GoldRing {
    static byte size = 7;
    static int price = 45000;
    static float weightGrams = 5.5f;
    static double purityPercentage = 91.6;
    static char qualityGrade = 'A';

    public static void main(String[] args)
	{
        byte size = 8;
        int price = 52000;
        float weightGrams = 6.0f;
        double purityPercentage = 99.9;
        char qualityGrade = 'B';

        System.out.println(GoldRing.size);
        System.out.println(GoldRing.price);
        System.out.println(GoldRing.weightGrams);
        System.out.println(GoldRing.purityPercentage);
        System.out.println(GoldRing.qualityGrade);
        System.out.println("----------------------");
        System.out.println(size);
        System.out.println(price);
        System.out.println(weightGrams);
        System.out.println(purityPercentage);
        System.out.println(qualityGrade);
    }
}