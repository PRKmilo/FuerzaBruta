package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

import co.edu.unbosque.view.View;
import co.edu.unbosque.model.LecturaArchivo;
import co.edu.unbosque.model.Model;

public class Controller implements ActionListener {
	private LecturaArchivo leer;
	private Model model;
	private View gui;
	private String buscar = "";

	public Controller() {
		gui = new View(this);
		gui.setVisible(true);

		leer = new LecturaArchivo();
		model = new Model();

		

		
	}
	


	public void buscarpalabra1(JTextArea area1, String patron) {

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

		}
	}

	public void buscarpalabra(JTextArea area1, String patron) {

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

		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(gui.getInicio().alkmp)) {
			gui.getAlg().setVisible(true);
			gui.getInicio().setVisible(false);
			gui.setSize(700, 500);

		}

		if (e.getActionCommand().equals(gui.getInicio().albm)) {
			gui.getAlg2().setVisible(true);
			gui.getInicio().setVisible(false);
			gui.setSize(700, 500);

		}

		if (e.getActionCommand()==gui.getAlg().VOLVER) {

			gui.getAlg().setVisible(false);
			gui.getInicio().setVisible(true);

			gui.setSize(500, 400);
		}
		
		
		
		if (e.getActionCommand()==gui.getAlg().Subir) {
			gui.getAlg().getMostrar().append(leer.Leer());

		}
		if (e.getActionCommand()==gui.getAlg().Buscar) {

			buscarpalabra1(gui.getAlg().getMostrar(), gui.getAlg().getBuscar().getText());

		}
		
		
		
		
		if (e.getActionCommand()==gui.getAlg2().VOLVER2) {

			gui.getAlg2().setVisible(false);
			gui.getInicio().setVisible(true);

			gui.setSize(500, 400);
		}
		
		
		
		if (e.getActionCommand()==gui.getAlg2().Subir2) {
			gui.getAlg2().getMostrar1().append(leer.Leer());

		}
		if (e.getActionCommand()==gui.getAlg2().Buscar2) {

			buscarpalabra(gui.getAlg2().getMostrar1(), gui.getAlg2().getBuscar1().getText());

		}
		
	}

}
