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
	private JLabel numero1;
	
	private static final String FUENTE = "Verdana";
	public static final String Subir2 = "SubirBm";
	public static final String VOLVER2 = "VolverI";
	public static final String Buscar2 = "BuscarBm";

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
		numero1.setBounds(350, 250, 150, 20);

		bsearch1 = new JButton(Buscar2);
		bsearch1.setFont(new Font(FUENTE, Font.BOLD, 13));
		bsearch1.setBounds(20, 20, 140, 20);

		buscar1 = new JTextField();
		buscar1.setFont(new Font(FUENTE, Font.BOLD, 10));
		buscar1.setBounds(200, 18, 400, 20);

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
		add(numero1);
		


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

	public JLabel getNumero1() {
		return numero1;
	}

	public void setNumero1(JLabel numero1) {
		this.numero1 = numero1;
	}

	

	

	
}
