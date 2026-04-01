class Signup
 {
    String username;
    String email;
    String password;
    long mobileNumber;
    
    public Signup(String username,String email,String password,long mobileNumber) 
	{
        this.username=username;
        this.email=email;
        this.password=password;
        this.mobileNumber=mobileNumber;
        
    }

    public void show() 
	{
        System.out.println(username);
        System.out.println(email);
        System.out.println(password);
        System.out.println(mobileNumber);
        
    }
}