class Zudio {

    public static void main(String[] args) {

        String[] mensWear = {"Shirt","Tshirt","Jeans","Jacket","Sweater","Shorts","Blazer","Hoodie","TrackPant","Kurta","FormalPant","CasualShirt","DenimJacket","Coat","Suit"};
        String[] womensWear = {"Kurti","Saree","Dress","Top","Skirt","Leggings","Palazzo","Dupatta","Gown","Jeans","Tshirt","Jacket","Sweater","Blouse","NightWear"};
        String[] kidsWear = {"KidsShirt","KidsTshirt","KidsJeans","KidsShorts","KidsFrock","KidsDress","KidsTop","KidsSkirt","KidsNightWear","KidsJacket","KidsSweater","KidsTrack","KidsCap","KidsSocks","KidsSet"};
        String[] footwear = {"Shoes","Sandals","Slippers","Heels","Boots","Sneakers","FlipFlops","Loafers","SportsShoes","FormalShoes","CasualShoes","KidsShoes","PartyWear","RunningShoes","Canvas"};
        String[] accessories = {"Belt","Wallet","Handbag","Backpack","Cap","Scarf","Sunglasses","Watch","Jewellery","HairBand","Clutch","Purse","Socks","Gloves","Tie"};

        System.out.println("Mens Wear");

        System.out.println(mensWear[0]);
        System.out.println(mensWear[1]);
        System.out.println(mensWear[2]);
        System.out.println(mensWear[3]);
        System.out.println(mensWear[4]);
        System.out.println(mensWear[5]);
        System.out.println(mensWear[6]);
        System.out.println(mensWear[7]);
        System.out.println(mensWear[8]);
        System.out.println(mensWear[9]);
        System.out.println(mensWear[10]);
        System.out.println(mensWear[11]);
        System.out.println(mensWear[12]);
        System.out.println(mensWear[13]);
        System.out.println(mensWear[14]);

        System.out.println("Womens Wear");
        for(int i = 0; i < womensWear.length; i++) {
            System.out.println(womensWear[i]);
        }

        System.out.println("Kids Wear");
        for(String x : kidsWear) {
            System.out.println(x);
        }

        System.out.println("Footwear");
        for(int i = 0; i < footwear.length; i++) {
            System.out.println(footwear[i]);
        }

        System.out.println("Accessories");
        for(String y : accessories) {
            System.out.println(y);
        }
    }
}