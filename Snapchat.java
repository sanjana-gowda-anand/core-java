class Snapchat {

    String userName;
    int snapScore;
    boolean hasStreak;
    int friendsCount;
    double rating;

    public Snapchat(String p1, int p2, boolean p3, int p4, double p5) {
        userName = p1;
        snapScore = p2;
        hasStreak = p3;
        friendsCount = p4;
        rating = p5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(snapScore);
        System.out.println(hasStreak);
        System.out.println(friendsCount);
        System.out.println(rating);
    }
}