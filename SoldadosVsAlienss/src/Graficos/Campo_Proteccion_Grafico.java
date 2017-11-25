package Graficos;

import java.awt.Image;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Campo_Proteccion_Grafico extends ObstaculoGrafico {
	
	public Campo_Proteccion_Grafico() {
		super( );
		this.pos = new Point();
		image[0] = new ImageIcon(getClass().getResource("/Sprites/PowerUps/campo.gif"));
		
	}
 
	



}
	
	
	
 
