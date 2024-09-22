package part2;

public class KitabController {
	private Kitab model;
	private KitabView view;
	
	public KitabController(Kitab model, KitabView view) {
		this.model = model;
		this.view = view;
		model.addObserver(view);
	}
	
	public void listen() {
		double newPrice = 0;
		do {
			view.printKitabInfo();
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
