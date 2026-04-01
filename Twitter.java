class Twitter {

    String userName;
    int userId;
    boolean isVerified;
    int followers;
    int tweetsCount;  

    public Twitter(String p1, int p2, boolean p3, int p4, int p5) {
        userName = p1;
        userId = p2;
        isVerified = p3;
        followers = p4;
        tweetsCount = p5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isVerified);
        System.out.println(followers);
        System.out.println(tweetsCount);
    }
}