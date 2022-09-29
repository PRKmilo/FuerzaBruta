package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

import co.edu.unbosque.model.LecturaArchivo;
import co.edu.unbosque.model.Model;
import co.edu.unbosque.view.Ventana;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	private LecturaArchivo leer;
	private Model model;
	private View gui;
	private Ventana v;
	private String buscar = "";

	public Controller() {
		gui = new View(this);
		gui.setVisible(true);
		v = new Ventana();
		leer = new LecturaArchivo();
		model = new Model();

	}

	public void buscarpalabraKMP(JTextArea area1, String patron) {

		ArrayList<Integer> p2 = model.kmp(area1.getText(), patron);
		if (patron.length() >= 1) {
			DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(
					Color.GREEN);
			Highlighter h = area1.getHighlighter();
			h.removeAllHighlights();
			String text = area1.getText();
			String caracteres = patron;
			Pattern p = Pattern.compile("(?i)" + caracteres);
			Matcher m = p.matcher(text);
			for (int i = 0; i < p2.size(); i++) {
				try {
					h.addHighlight(p2.get(i), p2.get(i) + patron.length(), highlightPainter);
				
				} catch (BadLocationException e) {

					e.printStackTrace();
				}
			}
	
		gui.getAlg().getNumrep().setText("Total KMP: "+ p2.size());
		}
	}

	public void buscarpalabraBM(JTextArea area1, String patron) {

		ArrayList<Integer> p2 = model.boyerMoore(area1.getText(), patron);
		if (patron.length() >= 1) {
			DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(
					Color.GREEN);
			Highlighter h = area1.getHighlighter();
			h.removeAllHighlights();
			String text = area1.getText();
			String caracteres = patron;
			Pattern p = Pattern.compile("(?i)" + caracteres);
			Matcher m = p.matcher(text);
			for (int i = 0; i < p2.size(); i++) {
				try {
					h.addHighlight(p2.get(i), p2.get(i) + patron.length(), highlightPainter);
				
				} catch (BadLocationException e) {

					e.printStackTrace();
				}
			}
			gui.getAlg2().getNumero1().setText("Total BM: "+ p2.size());
		
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(gui.getInicio().ALKMP)) {
			gui.getAlg().setVisible(true);
			gui.getInicio().setVisible(false);
			gui.setSize(700, 500);

		}

		if (e.getActionCommand().equals(gui.getInicio().ALBM)) {
			gui.getAlg2().setVisible(true);
			gui.getInicio().setVisible(false);
			gui.setSize(700, 500);

		}

		if (e.getActionCommand() == gui.getAlg().VOLVER) {

			gui.getAlg().setVisible(false);
			gui.getInicio().setVisible(true);

			gui.setSize(500, 400);
			
			gui.getAlg().getMostrar().selectAll();
			gui.getAlg().getMostrar().replaceSelection("");
			gui.getAlg().getBuscar().setText("");
			gui.getAlg().getNumrep().setText("");
		}

		if (e.getActionCommand() == gui.getAlg().SUBIR) {
          
			if (!gui.getAlg().getMostrar().getText().isEmpty()) {

				v.mostrarmensaje("Ya subiste el archivo");
			} else {
				gui.getAlg().getMostrar().append(leer.Leer());

			}
		}
		if (e.getActionCommand() == gui.getAlg().BUSCAR1) {
			if (gui.getAlg().getMostrar().getText().isEmpty() 
					|| gui.getAlg().getBuscar().getText().isEmpty()) {
				v.mostrarmensaje("Debes subir el archivo o poner un patron");
			} else {
				buscarpalabraKMP(gui.getAlg().getMostrar(), gui.getAlg().getBuscar().getText());
				
			}

		}

		if (e.getActionCommand() == gui.getAlg2().VOLVER2) {

			gui.getAlg2().setVisible(false);
			gui.getInicio().setVisible(true);

			gui.setSize(500, 400);
			gui.getAlg2().getMostrar1().selectAll();
			gui.getAlg2().getMostrar1().replaceSelection("");
			gui.getAlg2().getBuscar1().setText("");
			gui.getAlg2().getNumero1().setText("");
		}

		if (e.getActionCommand() == gui.getAlg2().SUBIR2) {

			if (!gui.getAlg2().getMostrar1().getText().isEmpty()) {

				v.mostrarmensaje("Ya subiste el archivo");
			} else {
				gui.getAlg2().getMostrar1().append(leer.Leer());

			}
		}
		if (e.getActionCommand() == gui.getAlg2().BUSCAR2) {
			if (gui.getAlg2().getMostrar1().getText().isEmpty() 
					|| gui.getAlg2().getBuscar1().getText().isEmpty()) {
				v.mostrarmensaje("Debes subir el archivo o poner un patron");
			} else {
				buscarpalabraBM(gui.getAlg2().getMostrar1(), gui.getAlg2().getBuscar1().getText());
				
			}

		}


	}

}
