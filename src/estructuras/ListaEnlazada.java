package estructuras;

public class ListaEnlazada {
	 protected Nodo inicio;
	 protected long tam;
	 
	public ListaEnlazada() {
		inicio= null;
		tam=0;
	}
	
	
	public void insertarFinal(String elemento){
		Nodo aux= new Nodo(elemento);
		Nodo actual= inicio;
		if(vacio()){
			inicio= aux;
		}
		else{
			while(actual.getEnlace()!=null){
				actual= actual.getEnlace();
		}
			actual.setEnlace(aux);
		}
		tam++;
	}
	
	public void insertarInicio(String elemento){
	
		Nodo actual=inicio;
		if(vacio()){
			inicio= new Nodo(elemento);
		}
		else{
			inicio= new Nodo(elemento, actual);
		}
	}
	
	public boolean vacio(){
		return (inicio==null);		
	}
	 
	 
	 

}
