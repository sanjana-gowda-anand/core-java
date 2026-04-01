class Mobile 
{
    String brand;
    String model;
    int price;
    int storage;
    
    public Mobile(String brand,String model,int price,int storage) 
	{
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.storage=storage;
        
    }

    public void show() 
	{
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
        System.out.println(storage);
       
    }
}