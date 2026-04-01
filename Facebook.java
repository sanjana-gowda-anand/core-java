class Facebook {

    String userName;
    int userId;
    boolean isActive;
    int friendsCount;
    double accountRating;

    public Facebook(String p1,int p2,boolean p3,int p4,double p5) {
        userName=p1;
        userId=p2;
        isActive=p3;
        friendsCount=p4;
        accountRating=p5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isActive);
        System.out.println(friendsCount);
        System.out.println(accountRating);
    }
}