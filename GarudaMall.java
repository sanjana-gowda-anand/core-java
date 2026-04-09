class GarudaMall {

    public static void main(String[] args) {

        String[] fashionStores = {"Zudio","Trends","Pantaloons","Levis","H&M","Zara","Max","Lifestyle","Forever21","AllenSolly","VanHeusen","UCB","W","Biba","FabIndia"};
        String[] electronicsStores = {"RelianceDigital","Croma","Samsung","AppleStore","MiStore","OnePlus","Sony","LG","Dell","HP","Boat","Noise","JBL","Asus","Lenovo"};
        String[] foodCourt = {"KFC","McDonalds","Dominos","PizzaHut","Subway","BurgerKing","TacoBell","Starbucks","CCD","BarbequeNation","BiryaniZone","Udupi","WowMomo","Haldirams","ChaiPoint"};
        String[] entertainment = {"INOX","GameZone","Bowling","KidsPlay","VRZone","Arcade","Trampoline","LaserTag","EscapeRoom","SnowWorld","WaterGames","FunCity","MiniGolf","GoKart","MirrorMaze"};
        String[] services = {"ATM","Parking","Restroom","HelpDesk","CustomerCare","Security","Lift","Escalator","WiFi","ChargingPoint","LostFound","FirstAid","BabyCare","Valet","Cleaning"};

        System.out.println("Fashion Stores");

        System.out.println(fashionStores[0]);
        System.out.println(fashionStores[1]);
        System.out.println(fashionStores[2]);
        System.out.println(fashionStores[3]);
        System.out.println(fashionStores[4]);
        System.out.println(fashionStores[5]);
        System.out.println(fashionStores[6]);
        System.out.println(fashionStores[7]);
        System.out.println(fashionStores[8]);
        System.out.println(fashionStores[9]);
        System.out.println(fashionStores[10]);
        System.out.println(fashionStores[11]);
        System.out.println(fashionStores[12]);
        System.out.println(fashionStores[13]);
        System.out.println(fashionStores[14]);

        System.out.println("Electronics Stores");
        for(int i = 0; i < electronicsStores.length; i++) {
            System.out.println(electronicsStores[i]);
        }

        System.out.println("Food Court");
        for(String x : foodCourt) {
            System.out.println(x);
        }

        System.out.println("Entertainment");
        for(int i = 0; i < entertainment.length; i++) {
            System.out.println(entertainment[i]);
        }

        System.out.println("Services");
        for(String y : services) {
            System.out.println(y);
        }
    }
}