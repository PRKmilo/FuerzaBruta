package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	private View gui;
	private String buscar = "";
	public Controller() {
		gui = new View(this);
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(gui.getInicio().alkmp)) {
			gui.getAlg().setVisible(true);
		}
		
		if(e.getActionCommand().equals(gui.getInicio().albm)) {
			gui.getAlg().setVisible(true);
		}
	}

}
