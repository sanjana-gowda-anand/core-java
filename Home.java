class Home{
    static byte numberOfFloors = 2;
    static short year = 2015;
    static int price = 2500000;
    static long houseNumber = 1234567890L;
    static boolean isOwned = true;

    public static void main(String[] args) 
	{
        byte numberOfFloors = 1;
        short year = 2024;
        int price = 3500000;
        long houseNumber = 9876543210L;
        boolean isOwned = false;

        System.out.println(Home.numberOfFloors);
        System.out.println(Home.year);
        System.out.println(Home.price);
        System.out.println(Home.houseNumber);
        System.out.println(Home.isOwned);
        System.out.println("----------------------");
        System.out.println(numberOfFloors);
        System.out.println(year);
        System.out.println(price);
        System.out.println(houseNumber);
        System.out.println(isOwned);
    }
}