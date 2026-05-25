package Praktikum_4.no2;

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    Smartphone(String brand, int seriesNumber,double price,double screenSize, int storageCapacity) {

        super(brand, seriesNumber, price);

        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }
}