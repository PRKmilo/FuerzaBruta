package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.LecturaArchivo;
import co.edu.unbosque.model.Model;

public class Controller {
	private LecturaArchivo leer;
	private Model model;
	
	public Controller() {
		leer=new LecturaArchivo();
	    model=new Model();
	    funcionar();
	    System.out.println(model.patron("test"));
	    String patron="is";
	    String textt="this isa testis";
	    
	    model.boyerMoore(textt, patron);
		
		
	}

	private void funcionar() {
		String cuento="Una mañana, Mamá Osa sirvió la más deliciosa avena para el desayuno, pero como estaba demasiado caliente para comer, los tres osos decidieron ir de paseo por el bosque mientras se enfriaba. Al cabo de unos minutos, una niña llamada Ricitos de Oro llegó a la casa de los osos y tocó la puerta. Al no encontrar respuesta, abrió la puerta y entró en la casa sin permiso.\r\n"
				+ "\r\n"
				+ "En la cocina había una mesa con tres tazas de avena: una grande, una mediana y una pequeña. Ricitos de Oro tenía un gran apetito y la avena se veía deliciosa. Primero, probó la avena de la taza grande, pero la avena estaba muy fría y no le gustó. Luego, probó la avena de la taza mediana, pero la avena estaba muy caliente y tampoco le gustó. Por último, probó la avena de la taza pequeña y esta vez la avena no estaba ni fría ni caliente, ¡estaba perfecta! La avena estaba tan deliciosa que se la comió toda sin dejar ni un poquito.";
       
		model.kmp(cuento, "O");
		

	}
	
	

}
