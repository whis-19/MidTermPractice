package part2;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	
	private List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer ob) {
		observers.add(ob);
	}
	public void notifyObservers() {
		for (Observer ob: observers) {
			ob.update();
		}
	}

}
