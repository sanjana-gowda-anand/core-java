class WhatsApp {
    String userName;
    long phoneNumber;
    boolean isOnline;
    int chatsCount;


    public WhatsApp(String userName, long phoneNumber, boolean isOnline, int chatsCount) {
        this.userName = userName;
        this.phoneNumber =phoneNumber ;
        this.isOnline = isOnline;
        this.chatsCount = chatsCount;
    }
	
	public WhatsApp(String userName , long phoneNumber, boolean isOnline) {
       this.userName=userName ;
        this.phoneNumber=phoneNumber ;
        this.isOnline=isOnline ;
    }
	
	public WhatsApp(String userName) {
        this.userName =userName;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(phoneNumber);
        System.out.println(isOnline);
        System.out.println(chatsCount);
    }
}