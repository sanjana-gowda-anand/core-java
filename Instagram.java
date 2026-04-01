class Instagram {

    String userName;
    int userId;
    boolean isPrivate;
    int followers;
    double rating;

    public Instagram(String p1, int p2, boolean p3, int p4, double p5) {
        userName = p1;
        userId = p2;
        isPrivate = p3;
        followers = p4;
        rating = p5;
    }
    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isPrivate);
        System.out.println(followers);
        System.out.println(rating);
    }
}