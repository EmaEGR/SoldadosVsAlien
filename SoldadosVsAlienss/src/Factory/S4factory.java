package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Personajes.S4;
import Personajes.Soldado;
import Principal.Celda;

public class S4factory implements SoldadosFactoryMethod {
protected JPanel panel;
protected JLabel l;

	public S4factory(JPanel p) {
		panel= p;
	}
	
	public Soldado createPersonaje (Celda c) {
		Soldado p = new S4(c);
		c.setElemento(p);
		l = p.getGrafico(0);
		panel.add(l);
		l.repaint();
		
	 return p;	
	}

}
