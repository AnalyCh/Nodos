package estructuras;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaEnlazada lista= new ListaEnlazada();
		
		//JOptionPane.showOptionDialog(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)

		Object o = JOptionPane.showInputDialog(null,"Seleccione un parametro",
				   "PARÁMETROS", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Inicio","Final" },"Seleccione");
		String c;
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
		c= JOptionPane.showInputDialog("Desea continuar"+ JOptionPane.YES_NO_OPTION);
		}while(c.equals(JOptionPane.YES_OPTION));
	}

}
