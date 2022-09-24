package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	// private LecturaArchivo leer;
	private View gui;
	public Controller() {
		// leer=new LecturaArchivo();
		gui = new View(this);
		gui.setVisible(true);
		
		// System.out.println(leer.Leer("C:\\Users\\jpiza\\eclipse-workspace\\PatronesTxt\\src\\co\\edu\\unbosque\\model\\Archivo2.txt"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
