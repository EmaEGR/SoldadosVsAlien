package Graficos;

import java.awt.Point;

import javax.swing.ImageIcon;

public class BombaGrafico extends ObstaculoGrafico{
	
	public BombaGrafico() {
		super();
		this.pos = new Point();
		image[0] = new ImageIcon(getClass().getResource("/Sprites/Objeto_Precioso/bomba.gif"));
		
		
	}

}
