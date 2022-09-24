package co.edu.unbosque.controller;

import co.edu.unbosque.view.View;

public class Controller {
	// private LecturaArchivo leer;
	private View gui;
	public Controller() {
		// leer=new LecturaArchivo();
		gui = new View(this);
		gui.setVisible(true);
		
		// System.out.println(leer.Leer("C:\\Users\\jpiza\\eclipse-workspace\\PatronesTxt\\src\\co\\edu\\unbosque\\model\\Archivo2.txt"));
	}

}
