class Profile 
{
    String name;
    String email;
    long mobileNumber;
    String gender;

    public Profile(String name,String email,long mobileNumber,String gender) 
	{
        this.name=name;
        this.email=email;
        this.mobileNumber=mobileNumber;
        this.gender=gender;
    }

    public void show()
	{
        System.out.println(name);
        System.out.println(email);
        System.out.println(mobileNumber);
        System.out.println(gender);
    }
}