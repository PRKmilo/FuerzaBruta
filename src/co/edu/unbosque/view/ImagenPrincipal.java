package co.edu.unbosque.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Clase ImagenPrincipal, el cual se utiliza para generar un fondo en un JPanel.
 * 
 * @author Jorge Yate
 * @author Camilo Piza
 * @author Nicolas Camacho
 */
public class ImagenPrincipal extends JPanel {


	/**
	 * Constante serialVersionUID de tipo long generada automaticamente por java.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Metodo el cual muestra una imagen como fondo principal.
	 * 
	 * @param g
	 */
	public void paint(Graphics g) {
		Image fondo = new ImageIcon("src/menFondo.jpg").getImage();
		g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
	}
}
