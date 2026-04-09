class Mobile {

    public static void main(String[] args) {

        String[] brands = {"Samsung","Apple","OnePlus","Xiaomi","Realme","Oppo","Vivo","Motorola","Nokia","Google","Honor","Huawei","Asus","Sony","Infinix"};
        String[] processors = {"Snapdragon 8","Snapdragon 7","Snapdragon 6","Dimensity 9000","Dimensity 8000","Dimensity 700","A15 Bionic","A16 Bionic","A17 Bionic","Exynos 2100","Exynos 2200","Helio G95","Helio G99","Tensor G2","Tensor G3"};
        String[] ram = {"2GB","4GB","6GB","8GB","12GB","16GB","18GB","24GB","LPDDR4","LPDDR5","LPDDR5X","3GB","5GB","10GB","20GB"};
        String[] storage = {"32GB","64GB","128GB","256GB","512GB","1TB","UFS2.1","UFS3.0","UFS3.1","UFS4.0","Expandable","NonExpandable","Cloud","Hybrid","Internal"};
        String[] features = {"5G","4G","DualSIM","TripleCamera","QuadCamera","AMOLED","OLED","LCD","FastCharging","WirelessCharging","Fingerprint","FaceUnlock","Waterproof","Gaming","AI Camera"};

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

        System.out.println("Processors");
        for(int i = 0; i < processors.length; i++) {
            System.out.println(processors[i]);
        }

        System.out.println("RAM");
        for(String x : ram) {
            System.out.println(x);
        }

        System.out.println("Storage");
        for(int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }

        System.out.println("Features");
        for(String y : features) {
            System.out.println(y);
        }
    }
}