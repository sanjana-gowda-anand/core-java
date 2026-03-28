class BookStore 
{

    static void store()
	{
        System.out.println("Welcome to Book Store");
    }

    static void reader(String name) 
	{
        System.out.println("Customer buying book:"+name);
    }

    static int bookPrice()
	{
        return 420;
    }

    static int total(int price)
	{
        return price + 30;
    }
}