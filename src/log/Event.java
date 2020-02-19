package log;

public class Event implements Comparable<Event>{

	private int timeTrigger;
	
	public Event() {
		
	}
	
	public int getTimeTrigger() {
		return timeTrigger;
	}

	@Override
	public int compareTo(Event arg0) {		
		return timeTrigger - arg0.getTimeTrigger();
	}
	public void action() {
		
	}

}
