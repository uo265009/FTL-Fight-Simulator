package log;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class VirtualClock {

	
	private int actualTime;//measured in miliseconds
	private List<Event> colaEventos;
	private int numeroEventos;
	
	public VirtualClock() {
		colaEventos = new LinkedList<Event>();
		numeroEventos = 0;
	}
	
	public int getTime() {
		return actualTime;
	}
	public void addEvent(Event evento) {
		colaEventos.add(evento);
		Collections.sort(colaEventos);
	}
	/**
	 * It end when the batle ends
	 * now it runs forever
	 */
	public void runClock() {
		while(true) {
			//sacamos el primer evento
			if(!colaEventos.isEmpty()) {		
				Event currentEvent = colaEventos.get(0);
				actualTime = currentEvent.getTimeTrigger();
				currentEvent.action();				
				//lo eliminamos
				colaEventos.remove(currentEvent);
				numeroEventos ++;
				System.out.print(numeroEventos);
			}
		}
	}

}
