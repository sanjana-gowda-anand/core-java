class Zomato 
{
    String restaurantName;
    int orderId;
    String foodItem;
    double price;

    public Zomato(String restaurantName,int orderId,String foodItem,double price)
	{
        this.restaurantName=restaurantName;
        this.orderId=orderId;
        this.foodItem=foodItem;
        this.price=price;
    }

    public void show() 
	{
        System.out.println(restaurantName);
        System.out.println(orderId);
        System.out.println(foodItem);
        System.out.println(price);
    }
}