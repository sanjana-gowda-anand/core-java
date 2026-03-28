class TextBook {
    static byte numberOfChapters = 12;
    static short publishedYear = 2020;
    static int price = 499;
    static double rating = 4.5;
    static char grade = 'A';

    public static void main(String[] args) 
	{
        byte numberOfChapters = 15;
        short publishedYear = 2024;
        int price = 699;
        double rating = 4.8;
        char grade = 'B';

        System.out.println(TextBook.numberOfChapters);
        System.out.println(TextBook.publishedYear);
        System.out.println(TextBook.price);
        System.out.println(TextBook.rating);
        System.out.println(TextBook.grade);
        System.out.println("----------------------");
        System.out.println(numberOfChapters);
        System.out.println(publishedYear);
        System.out.println(price);
        System.out.println(rating);
        System.out.println(grade);
    }
}