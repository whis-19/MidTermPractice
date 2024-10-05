package part1;

public class Kitab {
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
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
