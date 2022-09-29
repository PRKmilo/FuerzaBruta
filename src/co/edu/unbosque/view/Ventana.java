package co.edu.unbosque.view;

import javax.swing.JOptionPane;

/**
 * Clase ventana, contiene los JOptionPane.
 * 
 * @author Jorge Yate
 * @author Camilo Piza
 * @author Nicolas Camacho
 *
 */
public class Ventana {
	/**
	 * metodo que nos ayuda a leer lo que el usuario ingresa.
	 * 
	 * @param mensaje
	 * @return leerDato de tipo int
	 */
		public int leerDato(String mensaje) {
			int respuesta=0;
			String instruccion=JOptionPane.showInputDialog(mensaje);
			respuesta=Integer.parseInt(instruccion);
			return respuesta;
		}
		/**
		 * metodo que nos ayuda a mostrar un dato al usuario.
		 * @param mensaje
		 */
		public void mostrarmensaje(String mensaje) {
			JOptionPane.showMessageDialog(null, mensaje);
		}
		
		/**
		 * metodo que nos ayuda a leer lo que el usuario ingresa.
		 * 
		 * @param instruccion
		 * @return leeDato2 de tipo int
		 */
		public String leerDato2(String instruccion) {
			String respuesta = "";
			respuesta = JOptionPane.showInputDialog(instruccion);
			return respuesta;
		}
}
