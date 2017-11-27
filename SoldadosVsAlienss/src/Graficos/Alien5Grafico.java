package Graficos;

import javax.swing.ImageIcon;

public class Alien5Grafico extends ObstaculoGrafico{

	public Alien5Grafico(int x, int y) {
			super(x, y);
			image[0] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/batAlien.gif"));
		    image[1] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/Alien Atacando/batAlienAtacando.gif"));
		    image[2] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/batAlien.gif"));
		    image[3] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/batAlien.gif"));
	}
	

}
