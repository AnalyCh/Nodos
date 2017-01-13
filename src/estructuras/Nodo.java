package estructuras;

public class Nodo {
	private String contenido;
	private Nodo enlace;
	
	public Nodo(String c, Nodo e){
		contenido=c;
		enlace=e;
	}
	
	public Nodo(String c){
		contenido=c;
		enlace=null;
	}
	

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}

	@Override
	public String toString() {
		return "Nodo [contenido=" + contenido + ", enlace=" + enlace + "]\n";
	}
	
	

}
