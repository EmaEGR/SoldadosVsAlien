package Graficos;

import javax.swing.ImageIcon;

public class RobotGrafico extends  ObstaculoGrafico {
		public RobotGrafico(int fila, int columna) {
			super(fila, columna);
			 
			image[0] = new ImageIcon(getClass().getResource("/Sprites/Objetos_Compra/robot_estatico.png"));
			image[1] = new ImageIcon(getClass().getResource("/Sprites/Objetos_Compra/robot_estatico.png"));
			image[2] = new ImageIcon(getClass().getResource("/Sprites/Objetos_Compra/explosion.gif"));
		   
	}


	}
