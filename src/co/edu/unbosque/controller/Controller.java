package co.edu.unbosque.controller;

import javax.swing.JFileChooser;

import co.edu.unbosque.model.LecturaArchivo;

public class Controller {
	private LecturaArchivo leer;
	public Controller() {
		leer=new LecturaArchivo();
		
		System.out.println(leer.Leer("C:\\Users\\jpiza\\eclipse-workspace\\PatronesTxt\\src\\co\\edu\\unbosque\\model\\Archivo2.txt"));
	}

}
