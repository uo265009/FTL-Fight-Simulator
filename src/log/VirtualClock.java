package log;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class VirtualClock {

	
	private double actualTime;//measured in seconds
	private List<Event> colaEventos;
	
	public VirtualClock() {
		colaEventos = new LinkedList<Event>();
	}

}
