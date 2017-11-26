package InterfazGrafica;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

public class ImagenPanel2_2 extends JPanel{
	
	public void paintComponent(Graphics g){
		Dimension tam=getSize();
		ImageIcon imagen=new ImageIcon(new ImageIcon(getClass().getResource("/Sprites/fondo/baseMapa2.png")).getImage());
		g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
	}
	
}