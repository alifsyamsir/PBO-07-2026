package Praktikum_4.no2;

class Product {
    String brand;
    int seriesNumber;
    double price;

    Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Series Number: " + seriesNumber);
        System.out.println("Price: " + price);
    }
}