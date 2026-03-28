class Watch {
    static short manufacturingYear = 2022;
    static int price = 4500;
    static float size = 1.8f;
    static char qualityGrade = 'A';
    static boolean isWaterResistant = true;

    public static void main(String[] args)
	{
        short manufacturingYear = 2024;
        int price = 6000;
        float size = 2.0f;
        char qualityGrade = 'B';
        boolean isWaterResistant = false;

        System.out.println(Watch.manufacturingYear);
        System.out.println( Watch.price);
        System.out.println( Watch.size);
        System.out.println( Watch.qualityGrade);
        System.out.println(Watch.isWaterResistant);
        System.out.println("----------------------");
        System.out.println(manufacturingYear);
        System.out.println( price);
        System.out.println(size);
        System.out.println( qualityGrade);
        System.out.println( isWaterResistant);
    }
}