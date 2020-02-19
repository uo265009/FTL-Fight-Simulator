package log;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class VirtualClock {

	
	private int actualTime;//measured in miliseconds
	private List<Event> colaEventos;
	
	public VirtualClock() {
		colaEventos = new LinkedList<Event>();
	}
	public void addEvent() {
		Collections.sort(colaEventos);
	}
	/**
	 * It end when the batle ends
	 * now it runs forever
	 */
	public void runClock() {
		while(true) {
			//sacamos el primer evento
			Event currentEvent = colaEventos.get(0);
			currentEvent.action();
		}
	}

}
