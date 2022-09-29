package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

/**
 * Clase Algoritmo, contiene los elementos del JPanel para el algoritmo de KMP
 * 
 * @author Jorge Yate
 * @author Camilo Piza
 * @author Nicolas Camacho
 */
public class Algoritmo extends JPanel {

	/**
	 * Constante serialVersionUID de tipo long generada automaticamente por java.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Objeto buscar de tipo JTextField.
	 */
	private JTextField buscar;
	/**
	 * Objeto mostrar de tipo JTextArea.
	 */
	private JTextArea mostrar;
	/**
	 * Objeto archivo de tipo JScrollPane.
	 */
	private JScrollPane archivo;
	/**
	 * Objeto bsearchkmp de tipo JButton
	 */
	private JButton bsearchkmp;
	/**
	 * Objeto bsearchmkmp de tipo JButton
	 */
	private JButton bsearchmkmp;
	/**
	 * Objeto bvolver de tipo JButton
	 */
	private JButton bvolver;
	/**
	 * Objeto bsubir de tipo JButton.
	 */
	private JButton bsubir;
	/**
	 * Objeto numrep de tipo JLabel.
	 */
	private JLabel numrep;
	/**
	 * Objeto ingresarkmp de tipo JLabel.
	 */
	private JLabel ingresarkmp;

	/**
	 * Constante FUENTE de tipo String, la cual contiene la fuente utilizada en los
	 * elementos del JPanel.
	 */
	private static final String FUENTE = "Verdana";
	/**
	 * Constante SUBIR de tipo String.
	 */
	public static final String SUBIR = "Subir KMP";
	/**
	 * Constante VOLVER de tipo String
	 */
	public static final String VOLVER = "Volver";
	/**
	 * Constante BUSCAR1 de tipo String.
	 */
	public static final String BUSCAR1 = "Buscar KMP";

	/**
	 * Constante BUSCARMA de tipo String.
	 */
	public static final String BUSCARMA = "Buscar Mayuscula KMP";

	/**
	 * Metodo Constructor de la clase
	 * 
	 * @param c
	 */
	public Algoritmo(Controller c) {
		setVisible(false);
		setOpaque(false);
		setLayout(null);

		numrep = new JLabel();
		numrep.setFont(new Font(FUENTE, Font.BOLD, 15));
		numrep.setForeground(Color.WHITE);
		numrep.setBounds(370, 250, 150, 20);

		ingresarkmp = new JLabel("INGRESE EL PATRON");
		ingresarkmp.setFont(new Font(FUENTE, Font.BOLD, 13));
		ingresarkmp.setForeground(Color.WHITE);
		ingresarkmp.setBounds(20, 20, 170, 20);

		bsearchkmp = new JButton(BUSCAR1);
		bsearchkmp.setFont(new Font(FUENTE, Font.BOLD, 13));
		bsearchkmp.setBounds(370, 95, 140, 20);

		bsearchmkmp = new JButton(BUSCARMA);
		bsearchmkmp.setFont(new Font(FUENTE, Font.BOLD, 13));
		bsearchmkmp.setBounds(370, 65, 200, 20);

		buscar = new JTextField();
		buscar.setFont(new Font(FUENTE, Font.BOLD, 10));
		buscar.setBounds(200, 18, 400, 20);

		mostrar = new JTextArea();
		archivo = new JScrollPane(mostrar);
		archivo.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		archivo.setBounds(20, 65, 320, 380);
		
		bvolver = new JButton(VOLVER);
		bvolver.setFont(new Font(FUENTE, Font.BOLD, 12));
		bvolver.setBounds(370, 425, 100, 20);
		
		bsubir = new JButton(SUBIR);
		bsubir.setFont(new Font(FUENTE, Font.BOLD, 12));
		bsubir.setBounds(480, 425, 130, 20);

		add(buscar);
		add(bvolver);
		add(archivo);
		add(bsearchkmp);
		add(bsearchmkmp);
		add(bsubir);
		add(numrep);
		add(ingresarkmp);
	}

	/**
	 * Getters & Setters
	 */

	public JButton getBvolver() {
		return bvolver;
	}

	/**
	 * Getters & Setters
	 */

	public void setBvolver(JButton bvolver) {
		this.bvolver = bvolver;
	}

	/**
	 * Getters & Setters
	 */

	public JLabel getIngresarkmp() {
		return ingresarkmp;
	}

	/**
	 * Getters & Setters
	 */

	public void setIngresarkmp(JLabel ingresarkmp) {
		this.ingresarkmp = ingresarkmp;
	}

	/**
	 * Getters & Setters
	 */

	public JButton getBsubir() {
		return bsubir;
	}

	/**
	 * Getters & Setters
	 */

	public void setBsubir(JButton bsubir) {
		this.bsubir = bsubir;
	}

	/**
	 * Getters & Setters
	 */

	public JTextArea getMostrar() {
		return mostrar;
	}

	/**
	 * Getters & Setters
	 */
	public void setMostrar(JTextArea mostrar) {
		this.mostrar = mostrar;
	}

	/**
	 * Getters & Setters
	 */
	public JTextField getBuscar() {
		return buscar;
	}

	/**
	 * Getters & Setters
	 */
	public void setBuscar(JTextField buscar) {
		this.buscar = buscar;
	}

	/**
	 * Getters & Setters
	 */
	public JLabel getNumrep() {
		return numrep;
	}

	/**
	 * Getters & Setters
	 */
	public void setNumrep(JLabel numrep) {
		this.numrep = numrep;
	}

	/**
	 * Getters & Setters
	 */
	public JButton getBsearchkmp() {
		return bsearchkmp;
	}

	/**
	 * Getters & Setters
	 */
	public void setBsearchkmp(JButton bsearchkmp) {
		this.bsearchkmp = bsearchkmp;
	}

	/**
	 * Getters & Setters
	 */
	public JButton getBsearchmkmp() {
		return bsearchmkmp;
	}

	/**
	 * Getters & Setters
	 */
	public void setBsearchmkmp(JButton bsearchmkmp) {
		this.bsearchmkmp = bsearchmkmp;
	}

}
