class HotelBooking {

    static String checkRoom(String name, int money) 
	{
        String output = "Room booked successfully";
        System.out.println("Checking payment for room booking");

        if(money >= 1000) 
		{
            System.out.println("Room booked for guest: " + name);
            return output;
        } else {
            System.out.println("Room booking failed for guest: " + name);
			return "Not enough money for booking";
        }

        
    }
}