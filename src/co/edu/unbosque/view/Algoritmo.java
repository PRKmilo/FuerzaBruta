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

public class Algoritmo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField buscar;
	private JTextArea mostrar;
	private JScrollPane archivo;
	private JButton bsearchkmp;
	private JButton bsearchmkmp;
	private JButton bvolver;
	private JButton bsubir;
	private JLabel numrep;
	private JLabel ingresarkmp;
	
	private static final String FUENTE = "Verdana";
	public static final String SUBIR = "Subir KMP";
	public static final String VOLVER = "Volver";
	public static final String BUSCAR1 = "Buscar KMP";
	public static final String BUSCARMA = "Buscar Mayuscula KMP";

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
	public JButton getBvolver() {
		return bvolver;
	}

	public void setBvolver(JButton bvolver) {
		this.bvolver = bvolver;
	}

	public JLabel getIngresarkmp() {
		return ingresarkmp;
	}

	public void setIngresarkmp(JLabel ingresarkmp) {
		this.ingresarkmp = ingresarkmp;
	}

	public JButton getBsubir() {
		return bsubir;
	}

	public void setBsubir(JButton bsubir) {
		this.bsubir = bsubir;
	}

	public JTextArea getMostrar() {
		return mostrar;
	}

	public void setMostrar(JTextArea mostrar) {
		this.mostrar = mostrar;
	}

	public JTextField getBuscar() {
		return buscar;
	}

	public void setBuscar(JTextField buscar) {
		this.buscar = buscar;
	}

	public JLabel getNumrep() {
		return numrep;
	}

	public void setNumrep(JLabel numrep) {
		this.numrep = numrep;
	}

	public JButton getBsearchkmp() {
		return bsearchkmp;
	}

	public void setBsearchkmp(JButton bsearchkmp) {
		this.bsearchkmp = bsearchkmp;
	}

	public JButton getBsearchmkmp() {
		return bsearchmkmp;
	}

	public void setBsearchmkmp(JButton bsearchmkmp) {
		this.bsearchmkmp = bsearchmkmp;
	}

}
