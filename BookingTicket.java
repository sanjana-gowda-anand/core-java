class BookingTicket 
{
    String passengerName;
    int ticketId;
    String destination;
    double price;
    char seatNumber;

    public BookingTicket(String passengerName,int ticketId,String destination,double price, char seatNumber) 
	{
        this.passengerName=passengerName;
        this.ticketId=ticketId;
        this.destination=destination;
        this.price=price;
        this.seatNumber=seatNumber;
    }

    public void show() 
	{
        System.out.println(passengerName);
        System.out.println(ticketId);
        System.out.println(destination);
        System.out.println(price);
        System.out.println(seatNumber);
    }
}