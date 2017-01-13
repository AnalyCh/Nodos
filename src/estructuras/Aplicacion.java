package estructuras;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaEnlazada lista= new ListaEnlazada();
		
		//JOptionPane.showOptionDialog(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
		int c;
		c=JOptionPane.showConfirmDialog(null,"Desea ingresar datos","datos", JOptionPane.YES_NO_OPTION);

		Object o = JOptionPane.showInputDialog(null,"Seleccione un parametro",
				   "PARÁMETROS", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Inicio","Final" },"Seleccione");
		
		String opc= (String) o;
	
		do{
			
		if(opc.equals("Inicio")){
			String e= JOptionPane.showInputDialog("Ingrese el nombre: ");
			lista.insertarInicio(e);
		}
		else if(opc.equals("Final")){
			String e= JOptionPane.showInputDialog("Ingrese el nombre: ");
			lista.insertarFinal(e);
		}
		c=JOptionPane.showConfirmDialog(null,"Desea ingresar datos","datos", JOptionPane.YES_NO_OPTION);
		}while(c== JOptionPane.YES_OPTION);
		
		JOptionPane.showMessageDialog(null, " "+lista);
		c= JOptionPane.showConfirmDialog(null, "Desea buscar un nombre", "nombres", JOptionPane.YES_NO_OPTION);
		if(c==JOptionPane.YES_OPTION){
			String k= JOptionPane.showInputDialog("Ingrese el nombre a buscar: ");
			lista.buscar(k);
			int n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición: "));
			lista.buscando(n);
		}
	}

}