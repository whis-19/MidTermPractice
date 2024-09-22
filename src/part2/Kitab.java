package part2;

public class Kitab extends Observable {
    private String title;
    private double price;
    private double weight;

    public Kitab(String title, double price, double weight) {
        this.title = title;
        this.price = price;
        this.weight = weight;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
    public void setPrice(double price) {
        this.price = price;
        notifyObservers();  
    }
    public void setTitle(String title) {
        this.title = title;
        notifyObservers();
    }
    public void setWeight(double weight) {
        this.weight = weight;
        notifyObservers();
    }
}
