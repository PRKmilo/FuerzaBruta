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

	public View(Controller c) {
		img = new ImagenPrincipal();
		setSize(500, 500);
		setContentPane(img);
		setResizable(false);
		setVisible(true);
		setTitle("Algoritmos de fuerza bruta");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		inicio = new Inicio(c);
		inicio.setBounds(0, 0, 500, 500);
		getContentPane().add(inicio);
	}



	public Inicio getInicio() {
		return inicio;
	}

	public void setInicio(Inicio inicio) {
		this.inicio = inicio;
	}


}
