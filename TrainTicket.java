class TrainTicket {

    static String checkSeat(String name, int seatAvailable) 
	{
        String output = "Seat booking confirmed";
        System.out.println("Checking seat availability");

        if(seatAvailable > 0)
			{
            System.out.println("Seat is available for passenger : " + name);
            System.out.println("Number of seats available : " + seatAvailable);
            return output;
        } else {
            System.out.println("Sorry no seats available for passenger : " + name);
            System.out.println("Waiting list ");
			return "Seat booking not confirmed";

        }

    }
}