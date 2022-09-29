package co.edu.unbosque.model;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFileChooser;

/**
 * Clase LecturaArchivo, utilizada para leer un archivo txt.
 * 
 * @author Jorge Yate
 * @author Camilo Piza
 * @author Nicolas Camacho
 */
public class LecturaArchivo {
	/**
	 * Metodo para seleccionar un archivo txt y subirlo
	 */
	public String Leer() {
		String texto="";
		JFileChooser jf=new JFileChooser();
		jf.showOpenDialog(null);
		try {
			BufferedReader bf = new BufferedReader(new FileReader(jf.getSelectedFile()));
			String temp="";
			String bfRead;
			while((bfRead = bf.readLine()) != null) {
				temp= temp+bfRead+"\n";
			}
			
			texto=temp;
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("no se encontro archivo");
		}
		return texto;
	}

}
