package Graficos;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Soldado4Grafico extends ObstaculoGrafico{

	public  Soldado4Grafico(int x, int y) {
		super(x, y);
		image[0] = new ImageIcon(getClass().getResource("/Sprites/Sprite Soldado/GIF's/S4.gif"));
	    image[1] = new ImageIcon(getClass().getResource("/Sprites/Sprite Soldado/GIF's/S4.gif"));
	    image[2] = new ImageIcon(getClass().getResource ("/Sprites/Sprite Soldado/GIF's/SoldadoMuriendo-5.gif"));
	    image[3] = new ImageIcon(getClass().getResource("/Sprites/Sprite Soldado/GIF's/S4.gif"));
}
	

}
