class Dmart {

    public static void main(String[] args) {

        String[] groceries = {"Flour","Honey","Ghee","Salt","Sugar","Tea","Coffee","Milk","Curd","Butter","Cheese","Rice","Spices","Wheat","Oil"};
        String[] clothes = {"Shirt","Pant","Tshirt","Jeans","Kurti","Saree","Jacket","Shorts","Sweater","Top","Leggings","Dress","Dupatta"};
        String[] kitchen = {"Plate","Spoon","Fork","Knife","Pan","Cooker","Bottle","Glass","Bowl","Tray","Jar","Box","Tiffin","Container","Lid"};
        String[] electronics = {"TV","Mobile","Laptop","Fan","Iron","Mixer","Grinder","AC","Fridge","Washer","Speaker","Mouse","Keyboard","Charger","Light"};
        String[] snacks = {"Chips","Biscuits","Cake","Bread","Rusk","Noodles","Pasta","Soup","Oats","Popcorn","Candy","Chocolate","Namkeen","Cookies","Snacks"};

        System.out.println("Groceries");

        System.out.println(groceries[0]);
        System.out.println(groceries[1]);
        System.out.println(groceries[2]);
        System.out.println(groceries[3]);
        System.out.println(groceries[4]);
        System.out.println(groceries[5]);
        System.out.println(groceries[6]);
        System.out.println(groceries[7]);
        System.out.println(groceries[8]);
        System.out.println(groceries[9]);
        System.out.println(groceries[10]);
        System.out.println(groceries[11]);
        System.out.println(groceries[12]);
        System.out.println(groceries[13]);
        System.out.println(groceries[14]);

        System.out.println("Clothes");
        for(int i = 0; i < clothes.length; i++) {
            System.out.println(clothes[i]);
        }

        System.out.println("Kitchen");
        for(String kit : kitchen) {
            System.out.println(kit);
        }

        System.out.println("Electronics");
        for(int i = 0; i < electronics.length; i++) {
            System.out.println(electronics[i]);
        }

        System.out.println("Snacks");
        for(String sna : snacks) {
            System.out.println(sna);
        }
    }
}