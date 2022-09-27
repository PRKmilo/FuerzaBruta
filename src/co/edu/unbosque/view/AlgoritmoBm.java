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
	private JButton bsearch1;
	private JButton bvolver1;
	private JButton bsubir1;
	private JLabel numrep1;
	private String norep = "";
	private static final String FUENTE = "Verdana";
	public static final String Subir2 = "Subir  Archivo";
	public static final String VOLVER2 = "Volver";
	public static final String Buscar2 = "Buscar";

	public AlgoritmoBm(Controller c) {
		setVisible(false);
		setOpaque(false);
		setLayout(null);

		numrep1 = new JLabel("Total:" + norep);
		numrep1.setFont(new Font(FUENTE, Font.BOLD, 15));
		numrep1.setForeground(Color.WHITE);
		numrep1.setBounds(350, 250, 80, 20);

		bsearch1 = new JButton(Buscar2);
		bsearch1.setFont(new Font(FUENTE, Font.BOLD, 13));
		bsearch1.setBounds(20, 20, 100, 20);

		buscar1 = new JTextField();
		buscar1.setFont(new Font(FUENTE, Font.BOLD, 10));
		buscar1.setBounds(140, 18, 500, 20);

		mostrar1 = new JTextArea();
		archivo1 = new JScrollPane(mostrar1);
		archivo1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		archivo1.setBounds(20, 65, 320, 380);
		
		bvolver1 = new JButton(VOLVER2);
		bvolver1.setFont(new Font(FUENTE, Font.BOLD, 12));
		bvolver1.setBounds(420, 410, 100, 20);
		
		bsubir1 = new JButton(Subir2);
		bsubir1.setFont(new Font(FUENTE, Font.BOLD, 12));
		bsubir1.setBounds(420, 380, 180, 20);

		add(buscar1);
		add(bvolver1);
		add(archivo1);
		add(bsearch1);
		add(bsubir1);
		add(numrep1);
		


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

	public JButton getBsearch1() {
		return bsearch1;
	}

	public void setBsearch1(JButton bsearch1) {
		this.bsearch1 = bsearch1;
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

	public JLabel getNumrep1() {
		return numrep1;
	}

	public void setNumrep1(JLabel numrep1) {
		this.numrep1 = numrep1;
	}

	public String getNorep() {
		return norep;
	}

	public void setNorep(String norep) {
		this.norep = norep;
	}

	
}