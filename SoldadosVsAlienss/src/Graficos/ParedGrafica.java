package Graficos;

import javax.swing.ImageIcon;

public class ParedGrafica extends ObstaculoGrafico {
	public ParedGrafica(int fila, int columna) {
		super(fila, columna);
		 
		image[0] = new ImageIcon(getClass().getResource("/Sprites/Objetos_Compra/pared.png"));
		image[2] = new ImageIcon(getClass().getResource("/Sprites/Objetos_Compra/pared_destruida.gif"));
	   
}


}
