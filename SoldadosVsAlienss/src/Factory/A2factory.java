package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

 
import Personajes.A2;
import Personajes.Alien;
 
import Principal.Celda;
 

public class A2factory implements AlienFactoryMethod {
protected JPanel panel;
protected JLabel l;
	
	public A2factory(JPanel p) {
		panel= p;
	}
	
	public Alien createPersonaje (Celda c) {
		Alien p = new A2(c);
		c.setElemento(p);
		l = p.getGrafico(0);
		panel.add(l);
		l.repaint();
	 return p;	
	}

	 

}
