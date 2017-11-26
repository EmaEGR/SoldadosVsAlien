package Graficos;

import java.awt.Point;

import javax.swing.ImageIcon;

public class PiedraGrafico extends ObstaculoGrafico{
	
	
	public PiedraGrafico() {
		super();
		this.pos = new Point();
		image[0] = new ImageIcon(getClass().getResource("/Sprites/Objeto_Precioso/piedra.png"));
		
	}

}
