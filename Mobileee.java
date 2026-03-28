class Mobileee {

static String[] mobileNames={"Samsung", "Apple", "Vivo", "Oppo", "Realme","OnePlus", "Nokia", "Redmi", "Motorola", "Google"};
static int[] mobileStorage={64, 128, 128, 256, 64,256, 32, 128, 64, 256};
static String[] mobileColors={"Black", "White", "Blue", "Red", "Grey","Silver", "Green", "Purple", "Gold", "Pink"};
static int[] mobilePrice ={15000, 80000, 20000, 22000, 18000,35000, 12000, 16000, 14000, 60000};
static boolean[] mobile5G={true, true, true, true, true,true, false, true, false, true};

    static void getMobileNames() 
	{
        for(String name : mobileNames) {
            System.out.println(name);
        }
    }

    static void getStorage() {
        for(int storage : mobileStorage) {
            System.out.println(storage);
        }
    }

    static void getColors() {
        for(String colors : mobileColors) {
            System.out.println(colors);
        }
    }

    static void getPrice() {
        for(int price: mobilePrice) {
            System.out.println(price);
        }
    }

    static void get5G() {
        for(boolean is5G : mobile5G) {
            System.out.println(is5G);
        }
    }
}