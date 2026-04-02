class YouTube {
    String channelName;
    int subscribers;
    boolean isMonetized;
    int videos;

    public YouTube(String channelName) {
        this.channelName=channelName;
    }

    public YouTube(String channelName, int subscribers, boolean isMonetized) {
	    this.channelName=channelName;
        this.subscribers=subscribers;
        this.isMonetized=isMonetized;
    }

    public YouTube(String channelName, int subscribers, boolean isMonetized, int videos) {
	this.channelName=channelName;
	this.isMonetized=isMonetized;
    this.videos=videos;
    }

    public void show() {
        System.out.println(channelName);
        System.out.println(subscribers);
        System.out.println(isMonetized);
        System.out.println(videos);
    }
}