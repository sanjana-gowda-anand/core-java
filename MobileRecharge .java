class MobileRecharge {

    static String checkRecharge(String name, int amount) {

        String output = "Recharge successful";
        System.out.println("Checking the recharge amount");

        if(amount >= 100) {
            System.out.println("Recharge completed for user: " + name);
            System.out.println("Recharge amount: " + amount);
            return output;
        } 
        else {
            System.out.println("Recharge failed for user: " + name);
            System.out.println("Amount is too low: " + amount);
        }

        return "Recharge not completed";
    }
}