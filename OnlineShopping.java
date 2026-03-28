class OnlineShopping {

    static String checkPayment(String name, int amount) 
	{
        String output = "Payment successful";
        System.out.println("Checking payment amount");

        if(amount >= 500)
			{
            System.out.println("Order confirmed for customer: " + name);
            return output;
        } else {
            System.out.println("Payment failed for customer: " + name);
		    return "Order not placed";

        }

    }
}