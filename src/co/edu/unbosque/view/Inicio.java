package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import co.edu.unbosque.controller.Controller;

public class Inicio extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton bm;
	private JButton kmp;
	private JLabel integr;
	private JLabel titulo;
	private static final String FUENTE = "Verdana";

	public Inicio(Controller c) {
		setVisible(true);
		setOpaque(false);
		setLayout(null);

		titulo = new JLabel("<html>ALGORITMOS DE FUERZA BRUTA</html>", SwingConstants.CENTER);
		titulo.setFont(new Font(FUENTE, Font.BOLD, 35));
		titulo.setBounds(20, 50, 500, 300);
		add(titulo);

		bm = new JButton("Boyer-Moore");
		bm.setOpaque(false);
		bm.setBounds(180, 240, 140, 20);
		bm.setFont(new Font(FUENTE, Font.BOLD, 14));
		add(bm);

		kmp = new JButton("Kmp");
		kmp.setBounds(180, 280, 140, 20);
		kmp.setFont(new Font(FUENTE, Font.BOLD, 14));
		add(kmp);
		

	}
}
