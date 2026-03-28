class AllInOneMainMethod{


public static void main (String[]args)
{
		System.out.println("*****ATM*********");
        String output=ATMWithdraw.checkBalance("Sanju",1000);
		System.out.println(output);
		System.out.println("*****TRAIN*********");
		String available=TrainTicket.checkSeat("Sanju",5);
		System.out.println(available);
		System.out.println("*******RECHARGE********");
		String done=MobileCurrency.checkRecharge("Sanju",150);  
        System.out.println(done);		
		System.out.println("******SHOPPING********");
		String finish=OnlineShopping.checkPayment("Sanju",700);
		System.out.println(finish);
		System.out.println("******HOTEL*********");
	    String book=HotelBooking.checkRoom("Sanju",1500);
		System.out.println(book);

}
}