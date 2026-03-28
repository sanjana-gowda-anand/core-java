class Table {
    static byte numberOfLegs = 4;
    static short manufacturingYear = 2022;
    static int price = 5000;
    static float height = 3.5f;
    static boolean isWooden = true;

    public static void main(String[] args)
	{
        byte numberOfLegs = 3;
        short manufacturingYear = 2023;
        int price = 6500;
        float height = 4.0f;
        boolean isWooden = false;

        System.out.println( Table.numberOfLegs);
        System.out.println(Table.manufacturingYear);
        System.out.println( Table.price);
        System.out.println( Table.height);
        System.out.println(Table.isWooden);
        System.out.println("----------------------");
        System.out.println(numberOfLegs);
        System.out.println( manufacturingYear);
        System.out.println( price);
        System.out.println( height);
        System.out.println( isWooden);
    }
}