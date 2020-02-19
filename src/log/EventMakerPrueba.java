package log;

public class EventMakerPrueba implements Observer{
	
	private VirtualClock vc;
	private String mensaje;
	private int modificador;
	
	public EventMakerPrueba(VirtualClock vc,String mensaje,int modificador) {
		this.vc = vc;
		this.mensaje = mensaje;
		this.modificador = modificador;
	}
	
	@Override
	public void update() {
		int tiempo = vc.getTime();
		Event miEvento = new EventPrueba(tiempo + modificador, mensaje);
		miEvento.attach(this);
		vc.addEvent(miEvento);
		
	}

}
