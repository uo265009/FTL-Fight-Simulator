package log;

public class EventPrueba extends Event{
	
	String mensaje;
	
	public EventPrueba(int timeTrigger,String mensaje) {
		super(timeTrigger);
		this.mensaje = mensaje;
	}

	@Override
	public void action() {
		System.out.println("Tiempo: " + getTimeTrigger() + " Mensaje: "+mensaje);
		notifyObservers();
	}

}
