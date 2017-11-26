package Graficos;

import javax.swing.ImageIcon;

public class Alien6Grafico extends ObstaculoGrafico{

	public Alien6Grafico(int x, int y) {
			super(x, y);
			image[0] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/alienMadre.gif"));
		    image[1] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/Alien Atacando/alienMadreAtacando.gif"));
		    image[2] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/alienMadre.gif"));
		    image[3] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/alienMadre.gif"));
		 
	}
	

}
