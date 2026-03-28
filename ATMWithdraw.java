 class ATMWithdraw {

    static String checkBalance(String name, int balance)
	{
        String output = "Transaction successful";
        System.out.println("Checking the account balance");

        if(balance >= 500) 
		{
            System.out.println("Money can be withdrawn by  account holder: " + name);
            System.out.println("Available balance: " + balance);
            return output;
        } else {
            System.out.println("Insufficient balance in account holder: " + name);
            System.out.println("Current balance is too low: " + balance);
			return "Transaction failed due to low balance";
        }

        
    }
}