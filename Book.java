class Book {
    public static void main(String[] args) {
	
	 System.out.println("Book");
	 System.out.println("---FEATURES---");
	 System.out.println("Front matter");
	 System.out.println("Body matter");
	 System.out.println("End matter");
	 System.out.println("Tittle page");


        byte edition = 3;
        short pages = 450;
        int price = 599;
        long isbn = 9781234567890L;

        float rating = 4.5f;
        double weight = 0.75;

        char category = 'E';
        boolean available = true;

        System.out.println("Book Details:");
        System.out.println("Edition: " + edition);
        System.out.println("Pages: " + pages);
        System.out.println("Price: " + price);
        System.out.println("ISBN: " + isbn);
        System.out.println("Rating: " + rating);
        System.out.println("Weight: " + weight);
        System.out.println("Category: " + category);
        System.out.println("Available: " + available);
    }
}