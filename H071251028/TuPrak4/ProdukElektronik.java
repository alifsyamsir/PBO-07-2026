class Product { //kelas induk untuk produk elektronik   
    String brand; //atribut
    int seriesNumber;
    double price;

    Product(String brand, int seriesNumber, double price) { //constructor untuk inisialisasi atribut
        this.brand = brand; //untuk membedakan antara atribut dan parameter yang memiliki nama yang sama
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    void displayInfo() { //method untuk menampilkan informasi produk
        System.out.println("Brand: " + brand); //menampilkan merek produk
        System.out.println("Serial Number: " + seriesNumber); 
        // Mengubah format menjadi Rp 
        System.out.println("Price: Rp " + price);
    }
}

class Smartphone extends Product { //kelas turunan untuk smartphone
    double screenSize;
    int storageCapacity;

    Smartphone(String brand, int seriesNumber, double price, double screen, int storage) {
        super(brand, seriesNumber, price); //memanggil constructor dari kelas induk untuk menginisialisasi atribut yang diwarisi
        this.screenSize = screen;
        this.storageCapacity = storage;
    }

    void tampilkanSmartphone() {
        displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches"); 
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;

    Laptop(String brand, int seriesNumber, double price, int ram, String proc) {
        super(brand, seriesNumber, price);
        this.ramSize = ram;
        this.processorType = proc;
    }

    void tampilkanLaptop() {
        displayInfo();
        System.out.println("Processor Type: " + processorType);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

class Camera extends Product {
    int resolution;
    String lensType;

    Camera(String brand, int seriesNumber, double price, int res, String lens) {
        super(brand, seriesNumber, price);
        this.resolution = res;
        this.lensType = lens;
    }

    void tampilkanCamera() {
        displayInfo();
        System.out.println("Resolution: " + resolution + "MP");
        System.out.println("Lens Type: " + lensType);
    }
}