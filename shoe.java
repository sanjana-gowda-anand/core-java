class Shoe {
    public static void main(String[] args) {
	
	 System.out.println("Shoe");
	 System.out.println("---FEATURES---");
	 System.out.println("Comfort");
	 System.out.println("Performence");
	 System.out.println("Material");


        byte warranty = 1;
        short size = 9;
        int price = 2500;
        long serialNumber = 445566778899L;

        float weight = 0.8f;
        double soleThickness = 2.5;

        char genderType = 'M'; // M for Men
        boolean washable = true;

        System.out.println("Shoe Details:");
        System.out.println("Warranty: " + warranty);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight: " + weight);
        System.out.println("Sole Thickness: " + soleThickness);
        System.out.println("Gender Type: " + genderType);
        System.out.println("Washable: " + washable);
    }
}