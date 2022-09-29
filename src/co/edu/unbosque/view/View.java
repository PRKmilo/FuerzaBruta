package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

/**
 * Clase View, se juntan los JPanel dentro de un JFrame
 * 
 * @author Jorge Yate
 * @author Camilo Piza
 * @author Nicolas Camacho
 */
public class View extends JFrame {

	/**
	 * Constante serialVersionUID de tipo long generada automaticamente por java.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Objeto inicio de tipo Inicio
	 */
	private Inicio inicio;
	/**
	 * Objeto alg de tipo ImagenPrincipal
	 */
	private ImagenPrincipal img;
	/**
	 * Objeto alg de tipo Algoritmo
	 */
	private Algoritmo alg;
	/**
	 * Objeto alg2 de tipo AlgoritmoBm
	 */
	private AlgoritmoBm alg2;
	
	/**
	 * Metodo constructor de la clase
	 * 
	 * @param c
	 */
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
		alg2 = new AlgoritmoBm(c);
		alg.setSize(700, 500);
		getContentPane().add(alg);
		alg2.setSize(700, 500);
		getContentPane().add(alg2);
		
		alg.getBsearchkmp().addActionListener(c);
		alg.getBsearchmkmp().addActionListener(c);
		alg.getBvolver().addActionListener(c);
		alg.getBsubir().addActionListener(c);
		
		alg2.getBsearchbm().addActionListener(c);
		alg2.getBsearchmbm().addActionListener(c);
		alg2.getBvolver1().addActionListener(c);
		alg2.getBsubir1().addActionListener(c);


		inicio.getBm().addActionListener(c);
		inicio.getKmp().addActionListener(c);

		inicio.updateUI();
		alg2.updateUI();
		alg.updateUI();
	}

	/**
	 * Getters & Setters
	 */
	public Algoritmo getAlg() {
		return alg;
	}

	/**
	 * Getters & Setters
	 */
	public void setAlg(Algoritmo alg) {
		this.alg = alg;
	}

	/**
	 * Getters & Setters
	 */
	public Inicio getInicio() {
		return inicio;
	}

	/**
	 * Getters & Setters
	 */
	public void setInicio(Inicio inicio) {
		this.inicio = inicio;
	}

	/**
	 * Getters & Setters
	 */
	public AlgoritmoBm getAlg2() {
		return alg2;
	}

	/**
	 * Getters & Setters
	 */
	public void setAlg2(AlgoritmoBm alg2) {
		this.alg2 = alg2;
	}

}
