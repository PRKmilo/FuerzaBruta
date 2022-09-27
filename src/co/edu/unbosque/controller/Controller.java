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
			gui.getInicio().setVisible(false);
			gui.setSize(700, 500);
		}
		
		if(e.getActionCommand().equals(gui.getInicio().albm)) {
			gui.getAlg().setVisible(true);
			gui.getInicio().setVisible(false);
			gui.setSize(700, 500);

		}

		if (e.getActionCommand().equals(gui.getAlg().VOLVER)) {
			gui.getAlg().setVisible(false);
			gui.getInicio().setVisible(true);
			gui.setSize(500, 400);
		}

	}

}
