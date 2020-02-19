package main;

import log.Event;
import log.EventMakerPrueba;
import log.EventPrueba;
import log.VirtualClock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run2();
	}
	
	public void run1() {
		VirtualClock vc = new VirtualClock();
		Event evento1 = new EventPrueba(1000,"Evento 1");
		Event evento2 = new EventPrueba(500,"Evento 2");
		Event evento3 = new EventPrueba(1500,"Evento 3");
		vc.addEvent(evento1);
		vc.addEvent(evento2);
		vc.addEvent(evento3);
		vc.runClock();
	}
	
	public void run2() {
		VirtualClock vc = new VirtualClock();
		EventMakerPrueba eventMaker1= new EventMakerPrueba(vc, "em 1 (500)",500);
		EventMakerPrueba eventMaker2= new EventMakerPrueba(vc, "em 2 (300)",300);
		Event evento1 = new EventPrueba(1000,"Evento 1");
		Event evento2 = new EventPrueba(500,"Evento 2");
		evento1.attach(eventMaker1);
		evento2.attach(eventMaker2);
		vc.addEvent(evento1);
		vc.addEvent(evento2);
		vc.runClock();
	}

}
