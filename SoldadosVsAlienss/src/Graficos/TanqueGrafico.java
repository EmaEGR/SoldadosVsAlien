package Graficos;

import javax.swing.ImageIcon;

public class TanqueGrafico extends ObstaculoGrafico{
	public TanqueGrafico(int fila, int columna) {
		super(fila, columna);
	 
		image[0] = new ImageIcon(getClass().getResource("/Sprites/Objetos_Compra/tanque_estatico.png"));
		image[1] = new ImageIcon(getClass().getResource("/Sprites/Objetos_Compra/tanque_estatico.png"));
		image[2] = new ImageIcon(getClass().getResource("/Sprites/Objetos_Compra/tanque_destruido.gif"));
	    


}
}
