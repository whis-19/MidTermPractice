package part1;

public class Presenter {
	private Kitab model;
	private KitabView view;
	
	public Presenter(Kitab model, KitabView view) {
		this.model = model;
		this.view = view;
	}
	
	public void listen() {
		double newPrice = 0;
		do {
			view.printKitabInfo(model.getTitle(), model.getPrice(), model.getWeight());
			newPrice = view.editKitabInfo();
			if (newPrice>=0) {
				model.setPrice(newPrice);
			}
			else {
				System.out.println("ENDED");
			}
			
		} while (newPrice >= 0);
		
		
		
		
	}

}
