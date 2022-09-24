package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Inicio inicio;
	private ImagenPrincipal img;
	private Algoritmo alg;

	public View(Controller c) {
		img = new ImagenPrincipal();
		setSize(500, 400);
		setContentPane(img);
		setResizable(false);
		setVisible(true);
		setTitle("Algoritmos de fuerza bruta");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		inicio = new Inicio(c);
		inicio.setSize(500, 400);
		getContentPane().add(inicio);

		alg = new Algoritmo(c);
		alg.setSize(700, 500);
		getContentPane().add(alg);

		alg.getBsearch().addActionListener(c);
		alg.getBvolver().addActionListener(c);

		inicio.updateUI();
		alg.updateUI();
	}



	public Algoritmo getAlg() {
		return alg;
	}

	public void setAlg(Algoritmo alg) {
		this.alg = alg;
	}

	public Inicio getInicio() {
		return inicio;
	}

	public void setInicio(Inicio inicio) {
		this.inicio = inicio;
	}


}
