package Graficos;

 
import javax.swing.ImageIcon;

public class Alien1Grafico extends ObstaculoGrafico{

	public Alien1Grafico(int fila, int columna) {
			super(fila, columna);
			//System.out.println("Entre alien grafico Fila :"+fila + " Columna :"+columna);
			image[0] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/A1.gif"));
		    image[1] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/Alien Atacando/A1.gif"));
		    image[2] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/Alien-muriendo-1.gif"));
		    image[3] = new ImageIcon(getClass().getResource("/Sprites/Sprite Alien/GIF 's/A1.gif"));
	}
	
	

}
