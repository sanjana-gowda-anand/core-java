class Camera {
    public static void main(String[] args) {
	
	 System.out.println("Camera");
	 System.out.println("---FEATURES---");
	 System.out.println("Good quality");
	 System.out.println("Intelligent");
	 System.out.println("Imaging");


        byte warranty = 2;
        short isoRange = 6400;
        int price = 55000;
        long serialNumber = 123456789876L;

        float weight = 750.5f;
        double lensSize = 18.55;

        char cameraType = 'D'; // D for DSLR
        boolean hasFlash = true;

        System.out.println("Camera Details:");
        System.out.println("Warranty: " + warranty);
        System.out.println("ISO Range: " + isoRange);
        System.out.println("Price: " + price);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight: " + weight);
        System.out.println("Lens Size: " + lensSize);
        System.out.println("Camera Type: " + cameraType);
        System.out.println("Has Flash: " + hasFlash);
    }
}