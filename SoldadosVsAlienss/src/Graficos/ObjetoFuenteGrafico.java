package Graficos;

import javax.swing.ImageIcon;

public class ObjetoFuenteGrafico extends ObstaculoGrafico{

	public ObjetoFuenteGrafico(int fila, int columna) {
		super(fila, columna);
		image[0] = new ImageIcon(getClass().getResource("/Sprites/objetos/fuego.gif"));
	    image[1] = new ImageIcon(getClass().getResource("/Sprites/objetos/fuego.gif"));
	    image[2] = new ImageIcon(getClass().getResource("/Sprites/objetos/fuego.gif"));
	    image[3] = new ImageIcon(getClass().getResource("/Sprites/objetos/fuego.gif"));
		
	}

}
