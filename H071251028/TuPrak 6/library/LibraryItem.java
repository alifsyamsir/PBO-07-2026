package library;

public abstract class LibraryItem { //abstact ki jadi nd bisa bikin objek langsung tapi diwarisi ji
    protected String title; //protected bisa diakses sama child class
    protected int itemId;
    protected boolean isBorrowed;

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isBorrowed = false;
    }

    public abstract String getDescription(); //method abstract
    public abstract String borrowItem(int days);
    public abstract double calculateFine(int daysLate);

    public void returnItem() {
        isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public int getItemId() { // 
        return itemId;
    }

    public String getTitle() {
        return title;
    }
}