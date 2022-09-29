package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.unbosque.controller.Controller;

public class Inicio extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton bm;
	private JButton kmp;
	private JLabel titulo;
	private JLabel integrantes;
	public static final String FUENTE = "Verdana";
	public static final String ALKMP = "KMP";
	public static final String ALBM = "Boyer-Moore";

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

	public JButton getBm() {
		return bm;
	}

	public void setBm(JButton bm) {
		this.bm = bm;
	}

	public JButton getKmp() {
		return kmp;
	}

	public void setKmp(JButton kmp) {
		this.kmp = kmp;
	}


}
