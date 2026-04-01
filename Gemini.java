class Gemini 
{
    String userName;
    int userId;
    String questions;
    String language;
    String platform;

    public Gemini(String userName,int userId,String questions,String language,String platform)
	{
        this.userName=userName;
        this.userId=userId;
        this.questions=questions;
        this.language=language;
        this.platform=platform;
    }

    public void show() 
	{
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(questions);
        System.out.println(language);
        System.out.println(platform);
    }
}