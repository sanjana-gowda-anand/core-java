class BookingTicketRunner 
{
    public static void main(String[] args) 
	{

        BookingTicket b1=new BookingTicket("Sanju", 1001,"Hyderabad",750.50,'A');
		        b1.show();
        BookingTicket b2=new BookingTicket("Saniya", 1002,"Mumbai",1200.00,'G');
		        b2.show();
        BookingTicket b3=new BookingTicket("Preethi", 1003,"Pune",980.75,'C');
		        b3.show();
        BookingTicket b4=new BookingTicket("Shashu", 1004,"Bangalore",1500.25,'A');
		        b4.show();
        BookingTicket b5=new BookingTicket("Anusha", 1005,"Chennai",650.00,'G');
		        b5.show();
        BookingTicket b6=new BookingTicket("Raghu", 1006,"Delhi",1100.90,'N');
		        b6.show();
        BookingTicket b7=new BookingTicket("Manavi", 1007,"Goa",850.60,'B');
		        b7.show();


        
    }
}