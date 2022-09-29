package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.unbosque.controller.Controller;

/**
 * Clase Inicio, contiene los elementos del JPanel para el menu.
 * 
 * @author Jorge Yate
 * @author Camilo Piza
 * @author Nicolas Camacho
 */
public class Inicio extends JPanel {

	/**
	 * Constante serialVersionUID de tipo long generada automaticamente por java.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Objeto bm de tipo JButton
	 */
	private JButton bm;
	/**
	 * Objeto kmp de tipo JButton
	 */
	private JButton kmp;
	/**
	 * Objeto titulo de tipo JLabel
	 */
	private JLabel titulo;
	/**
	 * Objeto integrantes de tipo JLabel
	 */
	private JLabel integrantes;

	/**
	 * Constante FUENTE de tipo String, la cual contiene la fuente utilizada en los
	 * elementos del JPanel.
	 */
	public static final String FUENTE = "Verdana";
	/**
	 * Constante ALKMP de tipo String.
	 */
	public static final String ALKMP = "KMP";
	/**
	 * Constante ALBM de tipo String.
	 */
	public static final String ALBM = "Boyer-Moore";

	/**
	 * Metodo constructor de la clase
	 * 
	 * @param c
	 */
	public Inicio(Controller c) {
		setVisible(true);
		setOpaque(false);
		setLayout(null);

		titulo = new JLabel("<html>ALGORITMOS DE FUERZA BRUTA</html>");
		titulo.setFont(new Font(FUENTE, Font.BOLD, 35));
		titulo.setForeground(Color.white);
		titulo.setBounds(20, 10, 500, 100);
		add(titulo);

		integrantes = new JLabel(
				"<html><h1>Integrantes</h1>Jorge Yate <br>Camilo Piza <br>Nicolas Camacho</html>");
		integrantes.setFont(new Font(FUENTE, Font.BOLD, 17));
		integrantes.setForeground(Color.white);
		integrantes.setBounds(20, 200, 500, 150);
		add(integrantes);

		bm = new JButton(ALKMP);
		bm.setOpaque(false);
		bm.setBounds(180, 150, 140, 20);
		bm.setFont(new Font(FUENTE, Font.BOLD, 14));
		add(bm);

		kmp = new JButton(ALBM);
		kmp.setBounds(180, 180, 140, 20);
		kmp.setFont(new Font(FUENTE, Font.BOLD, 14));
		add(kmp);
	}

	/**
	 * Getters & Setters
	 */

	public JButton getBm() {
		return bm;
	}

	/**
	 * Getters & Setters
	 */

	public void setBm(JButton bm) {
		this.bm = bm;
	}

	/**
	 * Getters & Setters
	 */
	public JButton getKmp() {
		return kmp;
	}

	/**
	 * Getters & Setters
	 */
	public void setKmp(JButton kmp) {
		this.kmp = kmp;
	}


}
