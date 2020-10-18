package collections;

public class GPU implements Comparable<GPU> {
    private String name;
    private double price;
    private int memmory;
    private double boosted;

    public GPU(String name, int price, int memmory , double boosted) {
        this.name = name;
        this.price = price;
        this.memmory = memmory;
        this.boosted = boosted;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemmory() {
        return memmory;
    }

    public void setMemmory(int memmory) {
        this.memmory = memmory;
    }

    public double isBoosted() {
        return boosted;
    }

    public void setBoosted(double boosted) {
        this.boosted = boosted;
    }

    @Override
    public int compareTo(GPU o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((GPU) obj).name;
    }

    @Override
    public String toString() {
        return "GPU : " + this.name + " " + this.memmory + " GB" +" Boosted:"+this.isBoosted()+ " Price :" + this.price;
    }


}
