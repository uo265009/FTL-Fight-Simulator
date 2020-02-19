package log;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents everything that goes through time in the game, such as starting charging your laser, and then fire it(seconds later)
 * This also follows the role of Subject in the software design pattern Observer * 
 * @author uo265009
 *
 */
public abstract class Event implements Comparable<Event>{
	
	private int timeTrigger;
	private List<Observer> observers;
	
	
	public Event(int timeTrigger) {
		this.timeTrigger = timeTrigger;
		observers = new ArrayList<Observer>();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	/**
	 * Correspond to the method notify in the software design pattern Observer
	 */
	public void notifyObservers() {
		for(Observer theObserver: observers) {
			theObserver.update();
		}
	}
	
	
	
	public int getTimeTrigger() {
		return timeTrigger;
	}

	@Override
	public int compareTo(Event arg0) {		
		return timeTrigger - arg0.getTimeTrigger();
	}
	public abstract void action();

}
