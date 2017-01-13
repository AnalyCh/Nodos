package estructuras;

import javax.swing.JOptionPane;

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
	
	public void  buscar(String k){
		String s;
		Nodo actual= inicio;
		if(vacio()){
			 s= "la lista esta vacia";
			 JOptionPane.showMessageDialog(null, s);
			
		}
		
		while(actual!=null){
			if(actual.getContenido().equals(k)){
				s= actual.getContenido();	
				JOptionPane.showMessageDialog(null, s);
				break;
			}
			else{
			actual= actual.getEnlace();
			}
			
		}
		if(actual==null){
			s= "No existe ese registro";
			JOptionPane.showMessageDialog(null, s);
		}
		
		
		
		
	}

	public boolean vacio(){
		return (inicio==null);		
	}


	@Override
	public String toString() {
		return "ListaEnlazada [inicio=" + inicio +  "]";
	}
	 
	 

}
