package co.edu.unbosque.model;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFileChooser;

public class LecturaArchivo {
	
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
