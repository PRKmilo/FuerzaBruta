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

public class AlgoritmoBm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField buscar1;
	private JTextArea mostrar1;
	private JScrollPane archivo1;
	private JButton bsearchbm;
	private JButton bsearchmbm;
	private JButton bvolver1;
	private JButton bsubir1;
	private JLabel numero1;
	private JLabel ingresarbm;
	
	private static final String FUENTE = "Verdana";
	public static final String SUBIR2 = "Subir BM";
	public static final String VOLVER2 = "VolverI";
	public static final String BUSCAR2 = "Buscar BM";
	public static final String BUSCARMA2 = "Buscar Mayuscula BM";

	/**
	 * Se instancian nustros componentes para nuestra
	 * ventana de algoritmo booyer moore.
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

	public JButton getBsearchbm() {
		return bsearchbm;
	}

	public void setBsearchbm(JButton bsearchbm) {
		this.bsearchbm = bsearchbm;
	}

	public JButton getBsearchmbm() {
		return bsearchmbm;
	}

	public void setBsearchmbm(JButton bsearchmbm) {
		this.bsearchmbm = bsearchmbm;
	}

	public JLabel getIngresarbm() {
		return ingresarbm;
	}

	public void setIngresarbm(JLabel ingresarbm) {
		this.ingresarbm = ingresarbm;
	}

	public JTextField getBuscar1() {
		return buscar1;
	}

	public void setBuscar1(JTextField buscar1) {
		this.buscar1 = buscar1;
	}

	public JTextArea getMostrar1() {
		return mostrar1;
	}

	public void setMostrar1(JTextArea mostrar1) {
		this.mostrar1 = mostrar1;
	}

	public JScrollPane getArchivo1() {
		return archivo1;
	}

	public void setArchivo1(JScrollPane archivo1) {
		this.archivo1 = archivo1;
	}

	public JButton getBvolver1() {
		return bvolver1;
	}

	public void setBvolver1(JButton bvolver1) {
		this.bvolver1 = bvolver1;
	}

	public JButton getBsubir1() {
		return bsubir1;
	}

	public void setBsubir1(JButton bsubir1) {
		this.bsubir1 = bsubir1;
	}

	public JLabel getNumero1() {
		return numero1;
	}

	public void setNumero1(JLabel numero1) {
		this.numero1 = numero1;
	}

	

	

	
}
