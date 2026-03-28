class Wire{
    static short manufacturingYear = 2022;
    static int price = 500;
    static float length= 10.5f;
    static double thickness = 2.5;
    static char qualityGrade = 'A';

    public static void main(String[] args) 
	{
        short manufacturingYear = 2024;
        int price = 750;
        float length = 15.0f;
        double thickness = 3.0;
        char qualityGrade = 'B';

        System.out.println(Wire.manufacturingYear);
        System.out.println(Wire.price);
        System.out.println(Wire.length);
        System.out.println(Wire.thickness);
        System.out.println(Wire.qualityGrade);
        System.out.println("----------------------");
        System.out.println(manufacturingYear);
        System.out.println(price);
        System.out.println(length);
        System.out.println(thickness);
        System.out.println(qualityGrade);
    }
}