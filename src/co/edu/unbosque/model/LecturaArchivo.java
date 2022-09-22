package co.edu.unbosque.model;

import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaArchivo {
	
	public String Leer(String direccion) {
		String texto="";
		try {
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String temp="";
			String bfRead;
			while((bfRead = bf.readLine()) != null) {
				temp= temp+bfRead;
			}
			
			texto=temp;
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("no se encontro archivo");
		}
		return texto;
	}

}
