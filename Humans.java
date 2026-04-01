class Humans 
{
    String name;
    int age;
    String gender;
    String occupation;
    String city;

    public Humans(String name,int age,String gender,String occupation,String city) 
	{
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.occupation=occupation;
        this.city=city;
    }

    public void show() 
	{
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(occupation);
        System.out.println(city);
    }
}