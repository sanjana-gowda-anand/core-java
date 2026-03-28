class BookStore_Runner {

    public static void main(String[] args) {

        BookStore.store();

        BookStore.reader("Megha");

        int price = BookStore.bookPrice();
        System.out.println("Book Price:"+price);

        int bill = BookStore.total(price);
        System.out.println("Total Bill:"+bill);
    }
}