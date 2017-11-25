package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;
 
import Personajes.A6;
import Personajes.Alien;
 
 
import Principal.Celda;
 

public class A6factory  implements AlienFactoryMethod {
protected JPanel panel;
protected JLabel l;

	public A6factory(JPanel p) {
		panel= p;
	}
	public Alien createPersonaje (Celda c) {
		Alien p = new A6(c);
		c.setElemento(p);
		l = p.getGrafico(0);
		panel.add(l);
		l.repaint();
		
	 return p;	
	}
	 
}
