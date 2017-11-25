package Graficos;

 
import javax.swing.ImageIcon;

public class Alien2Grafico extends ObstaculoGrafico{

	public Alien2Grafico(int x, int y) {
			super(x, y);
		    image[0] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/A2.gif"));
		    image[1] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/Alien Atacando/A1.gif"));
		    image[2] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/Alien-muriendo-1.gif"));
		    image[3] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/A2.gif"));
	}
	
}
