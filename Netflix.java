class Netflix {

    String userName;
    int profileId;
    boolean isSubscribed;
    String plan;

    public Netflix(String userName) {
        this.userName = userName;
    }

    public Netflix(String userName, int profileId, boolean isSubscribed) {
        this.userName=userName;
        this.profileId=profileId;
        this.isSubscribed=isSubscribed;
    }

    public Netflix(String userName, int profileId, boolean isSubscribed, String plan) {
        this.userName=userName;
		this.profileId=profileId;
		this.isSubscribed=isSubscribed;
        this.plan=plan;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(profileId);
        System.out.println(isSubscribed);
        System.out.println(plan);
    }
}