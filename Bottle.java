class Bottle {
    public static void main(String[] args) {
	
	 System.out.println("Bottle");
	 System.out.println("---FEATURES---");
	 System.out.println("Material");
	 System.out.println("Safety");
	 System.out.println("Cap");


        byte warranty = 1;
        short capacity = 1000;
        int price = 300;
        long serialNumber = 556677889922L;

        float weight = 0.5f;
        double height = 25.5;

        char materialType = 'S'; // S for Steel
        boolean insulated = true;

        System.out.println("Bottle Details:");
        System.out.println("Warranty: " + warranty);
        System.out.println("Capacity: " + capacity);
        System.out.println("Price: " + price);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Material Type: " + materialType);
        System.out.println("Insulated: " + insulated);
    }
}