package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Personajes.S3;
import Personajes.Soldado;
import Principal.Celda;

public class S3factory implements S3FactoryMethod {
protected JPanel panel;
protected JLabel l;

	public S3factory(JPanel p) {
		panel= p;
	}
	
	public S3 createPersonaje (Celda c,Celda v) {
		S3 p = new S3(c,v);
		c.setElemento(p);
		v.setElemento(p);
		l = p.getGrafico(0);
		panel.add(l);
		l.repaint();
		
	 return p;	
	}

}
