package Praktikum_4.no2;

class Laptop extends Product {
    int ramSize;
    String processorType;

    Laptop(String brand, int seriesNumber, double price,int ramSize, String processorType) {
        super(brand, seriesNumber, price);

        this.ramSize= ramSize;
        this.processorType =processorType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Processor Type: " + processorType);
    }
}