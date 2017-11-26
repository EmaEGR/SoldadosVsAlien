package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Personajes.A1;
import Personajes.A4;
import Personajes.Alien;
import Personajes.Personaje;
import Personajes.S1;
import Principal.Celda;
import Principal.Logica;

public class A4factory implements AlienFactoryMethod {
protected JPanel panel;
protected JLabel l;

	public A4factory(JPanel p) {
		panel= p;
	}
	
	public Alien createPersonaje (Celda c) {
		System.out.println("Entre a factory 4 Alien");
		Alien p = new A4(c);
		c.setElemento(p);
		l = p.getGrafico(0);
		panel.add(l);
		l.repaint();
		
	 return p;	
	}

 

}
