package Graficos;

import javax.swing.ImageIcon;

public class ObjetoAguaGrafico extends ObstaculoGrafico{

	public ObjetoAguaGrafico(int fila, int columna) {
		super(fila, columna);
		image[0] = new ImageIcon(getClass().getResource("/Sprites/Disparo/0.png"));
	    image[1] = new ImageIcon(getClass().getResource("/Sprites/Disparo/0.png"));
	    image[2] = new ImageIcon(getClass().getResource("/Sprites/Disparo/0.png"));
	    image[3] = new ImageIcon(getClass().getResource("/Sprites/Disparo/0.png"));
	}

}
