package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

 
import Personajes.A3;
import Personajes.Alien;
 
import Principal.Celda;
 

public class A3factory implements AlienFactoryMethod {
protected JPanel panel;
protected JLabel l;

	public A3factory(JPanel p) {
		panel= p;
	}
	
	public Alien createPersonaje (Celda c) {
		Alien p = new A3(c);
		c.setElemento(p);
		l = p.getGrafico(0);
		panel.add(l);
		l.repaint();
		
	 return p;	
	}
 
}
