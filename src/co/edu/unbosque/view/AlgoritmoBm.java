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
 * Clase AlgoritmoBm, contiene los elementos del JPanel para el algoritmo de BM
 * 
 * @author Jorge Yate
 * @author Camilo Piza
 * @author Nicolas Camacho
 */
public class AlgoritmoBm extends JPanel {

	/**
	 * Constante serialVersionUID de tipo long generada automaticamente por java.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Objeto buscar1 de tipo JTextField
	 */
	private JTextField buscar1;
	/**
	 * Objeto mostrar1 de tipo JTextArea
	 */
	private JTextArea mostrar1;
	/**
	 * Objeto archivo1 de tipo JScrollPane
	 */
	private JScrollPane archivo1;
	/**
	 * Objeto bsearchbm de tipo JButton
	 */
	private JButton bsearchbm;
	/**
	 * Objeto bsearchmbm de tipo JButton
	 */
	private JButton bsearchmbm;
	/**
	 * Objeto bvolver1 de tipo JButton
	 */
	private JButton bvolver1;
	/**
	 * Objeto bsubir1 de tipo JButton
	 */
	private JButton bsubir1;
	/**
	 * Objeto numero1 de tipo JLabel
	 */
	private JLabel numero1;
	/**
	 * Objeto ingresarbm de tipo JLabel
	 */
	private JLabel ingresarbm;
	

	/**
	 * Constante FUENTE de tipo String, la cual contiene la fuente utilizada en los
	 * elementos del JPanel.
	 */
	private static final String FUENTE = "Verdana";
	/**
	 * Constante SUBIR2 de tipo String.
	 */
	public static final String SUBIR2 = "Subir BM";
	/**
	 * Constante VOLVER2 de tipo String.
	 */
	public static final String VOLVER2 = "VolverI";
	/**
	 * Constante BUSCAR2 de tipo String.
	 */
	public static final String BUSCAR2 = "Buscar BM";
	/**
	 * Constante BUSCARMA2 de tipo String.
	 */
	public static final String BUSCARMA2 = "Buscar Mayuscula BM";

	/**
	 * Metodo constructor de la clase
	 * 
	 * @param c
	 */
	public AlgoritmoBm(Controller c) {
		setVisible(false);
		setOpaque(false);
		setLayout(null);

		numero1 = new JLabel();
		numero1.setFont(new Font(FUENTE, Font.BOLD, 15));
		numero1.setForeground(Color.WHITE);
		numero1.setBounds(370, 250, 150, 20);

		ingresarbm = new JLabel("INGRESE EL PATRON");
		ingresarbm.setFont(new Font(FUENTE, Font.BOLD, 13));
		ingresarbm.setForeground(Color.WHITE);
		ingresarbm.setBounds(20, 20, 170, 20);

		bsearchbm = new JButton(BUSCAR2);
		bsearchbm.setFont(new Font(FUENTE, Font.BOLD, 13));
		bsearchbm.setBounds(370, 95, 140, 20);

		bsearchmbm = new JButton(BUSCARMA2);
		bsearchmbm.setFont(new Font(FUENTE, Font.BOLD, 13));
		bsearchmbm.setBounds(370, 65, 200, 20);

		buscar1 = new JTextField();
		buscar1.setFont(new Font(FUENTE, Font.BOLD, 10));
		buscar1.setBounds(200, 18, 400, 20);

		mostrar1 = new JTextArea();
		archivo1 = new JScrollPane(mostrar1);
		archivo1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		archivo1.setBounds(20, 65, 320, 380);
		
		bvolver1 = new JButton(VOLVER2);
		bvolver1.setFont(new Font(FUENTE, Font.BOLD, 12));
		bvolver1.setBounds(370, 425, 100, 20);
		
		bsubir1 = new JButton(SUBIR2);
		bsubir1.setFont(new Font(FUENTE, Font.BOLD, 12));
		bsubir1.setBounds(480, 425, 130, 20);

		add(buscar1);
		add(bvolver1);
		add(archivo1);
		add(bsearchbm);
		add(bsearchmbm);
		add(bsubir1);
		add(numero1);
		add(ingresarbm);
	}

	/**
	 * Getters & Setters
	 */

	public JButton getBsearchbm() {
		return bsearchbm;
	}

	/**
	 * Getters & Setters
	 */

	public void setBsearchbm(JButton bsearchbm) {
		this.bsearchbm = bsearchbm;
	}

	/**
	 * Getters & Setters
	 */

	public JButton getBsearchmbm() {
		return bsearchmbm;
	}

	/**
	 * Getters & Setters
	 */

	public void setBsearchmbm(JButton bsearchmbm) {
		this.bsearchmbm = bsearchmbm;
	}

	/**
	 * Getters & Setters
	 */

	public JLabel getIngresarbm() {
		return ingresarbm;
	}

	/**
	 * Getters & Setters
	 */

	public void setIngresarbm(JLabel ingresarbm) {
		this.ingresarbm = ingresarbm;
	}

	/**
	 * Getters & Setters
	 */

	public JTextField getBuscar1() {
		return buscar1;
	}

	/**
	 * Getters & Setters
	 */

	public void setBuscar1(JTextField buscar1) {
		this.buscar1 = buscar1;
	}

	/**
	 * Getters & Setters
	 */

	public JTextArea getMostrar1() {
		return mostrar1;
	}

	/**
	 * Getters & Setters
	 */

	public void setMostrar1(JTextArea mostrar1) {
		this.mostrar1 = mostrar1;
	}

	/**
	 * Getters & Setters
	 */

	public JScrollPane getArchivo1() {
		return archivo1;
	}

	/**
	 * Getters & Setters
	 */

	public void setArchivo1(JScrollPane archivo1) {
		this.archivo1 = archivo1;
	}

	/**
	 * Getters & Setters
	 */

	public JButton getBvolver1() {
		return bvolver1;
	}

	/**
	 * Getters & Setters
	 */

	public void setBvolver1(JButton bvolver1) {
		this.bvolver1 = bvolver1;
	}

	/**
	 * Getters & Setters
	 */

	public JButton getBsubir1() {
		return bsubir1;
	}

	/**
	 * Getters & Setters
	 */

	public void setBsubir1(JButton bsubir1) {
		this.bsubir1 = bsubir1;
	}

	/**
	 * Getters & Setters
	 */

	public JLabel getNumero1() {
		return numero1;
	}

	/**
	 * Getters & Setters
	 */

	public void setNumero1(JLabel numero1) {
		this.numero1 = numero1;
	}

	

	

	
}
