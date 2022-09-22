package co.edu.unbosque.controller;

import javax.swing.JFileChooser;

import co.edu.unbosque.model.LecturaArchivo;
import co.edu.unbosque.model.Model;

public class Controller {
	private LecturaArchivo leer;
	private Model model;
	
	public Controller() {
		leer=new LecturaArchivo();
	    model=new Model();
	    funcionar();
		
		
	}

	private void funcionar() {
       
		model.kmp("pa texto pa probar pa", "pa");
		
	}
	
	

}
