class YouTubeRunner {
    public static void main(String[] args) {

        YouTube y1=new YouTube("TechChannel");
        y1.show();

        YouTube y2=new YouTube("FoodVlog",50000,true);
        y2.show();

        YouTube y3=new YouTube("GamingZone",100000,true,250);
        y3.show();
    }
}