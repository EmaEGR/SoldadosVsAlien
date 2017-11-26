package Graficos;

import javax.swing.ImageIcon;

public class ObjetoPiedraGrafico extends ObstaculoGrafico{

	public ObjetoPiedraGrafico(int fila, int columna) {
		
		super(fila, columna);
		//cambiar imagen 
		image[0] = new ImageIcon(getClass().getResource("/Sprites/objetos/piedra.png"));
	    image[1] = new ImageIcon(getClass().getResource("/Sprites/objetos/piedra.png"));
	    image[2] = new ImageIcon(getClass().getResource("/Sprites/Objetos_Compra/explosion.gif"));
	    image[3] = new ImageIcon(getClass().getResource("/Sprites/objetos/piedra.png"));
	    
	}

}
