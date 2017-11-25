package Graficos;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DisparoGrafico extends ObstaculoGrafico {
	
	public DisparoGrafico(int fila, int columna) {
		super(fila,columna);
		
		image[0] = new ImageIcon(getClass().getResource("/Sprites/Disparo/0.png"));
	    image[1] = new ImageIcon(getClass().getResource("/Sprites/Disparo/1.png"));
	    image[2] = new ImageIcon(getClass().getResource("/Sprites/Disparo/0.png"));
	    image[3] = new ImageIcon(getClass().getResource("/Sprites/Disparo/0.png"));
	}

	public JLabel getGrafico(int dir) {
		 if (label == null) {
			label= new JLabel(image[dir]);
			label.setBounds(pos.y, pos.x, width, height); 
			ImageIcon aux = (ImageIcon)image[dir];
			Icon icono = new ImageIcon(aux.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT));
			label.setIcon(icono);
		 }
		 return label;	
		}
		
		public void actualizarGrafico(int dir){		
		  ImageIcon aux=(ImageIcon) image[dir];
		  Icon icono = new ImageIcon(aux.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT));
		  label.setIcon(icono);
		  label.setBounds(pos.y, pos.x, width, height);
			
		}
		
}
