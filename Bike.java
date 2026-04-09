class Bike {

    public static void main(String[] args) {

        String[] brands = {"Honda","Yamaha","Suzuki","KTM","RoyalEnfield","Bajaj","TVS","Hero","BMW","Ducati","Kawasaki","Triumph","HarleyDavidson","Aprilia","Benelli"};
        String[] models = {"Activa","R15","Gixxer","Duke","Classic350","Pulsar","Apache","Splendor","G310","Panigale","Ninja","StreetTriple","Iron883","RS660","TRK502"};
        String[] engineCC = {"110cc","150cc","155cc","200cc","250cc","300cc","350cc","400cc","500cc","600cc","650cc","750cc","900cc","1000cc","1200cc"};
        String[] colors = {"Black","Red","Blue","White","Grey","Green","Yellow","Orange","Silver","MatteBlack","Gold","Purple","Brown","Cyan","DualTone"};
        String[] features = {"ABS","DiscBrake","AlloyWheels","LEDLight","DigitalMeter","Bluetooth","Navigation","FuelInjection","SelfStart","KickStart","TubelessTyre","SideStandSensor","TractionControl","CruiseControl","QuickShifter"};

        System.out.println("Brands");

        System.out.println(brands[0]);
        System.out.println(brands[1]);
        System.out.println(brands[2]);
        System.out.println(brands[3]);
        System.out.println(brands[4]);
        System.out.println(brands[5]);
        System.out.println(brands[6]);
        System.out.println(brands[7]);
        System.out.println(brands[8]);
        System.out.println(brands[9]);
        System.out.println(brands[10]);
        System.out.println(brands[11]);
        System.out.println(brands[12]);
        System.out.println(brands[13]);
        System.out.println(brands[14]);

        System.out.println("Models");
        for(int i = 0; i < models.length; i++) {
            System.out.println(models[i]);
        }

        System.out.println("Engine CC");
        for(String x : engineCC) {
            System.out.println(x);
        }

        System.out.println("Colors");
        for(int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("Features");
        for(String y : features) {
            System.out.println(y);
        }
    }
}