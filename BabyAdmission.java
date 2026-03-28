class BabyAdmission {
    static String checkAge(String name, int age) 
	{
        String output = "Yes this child can get admission in Baby Class";

        if(age >= 3) 
		{
            System.out.println("Yes this child can get admission");
            return output;
        }
        System.out.println("No this child cannot get admission");

    }

    
    
}