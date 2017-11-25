package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Personajes.A1;
import Personajes.Personaje;
import Personajes.S1;
import Personajes.Soldado;
import Principal.Celda;
import Principal.Logica;

public class S1factory  implements SoldadosFactoryMethod {
protected JPanel panel;
protected JLabel l;

	public S1factory(JPanel p) {
		panel= p;
	}
	
	//Cambie Personaje ->Soldado
	public Soldado createPersonaje (Celda c) {
		Soldado p = new S1(c);
		c.setElemento(p);
		this.l = p.getGrafico(0);
		panel.add(l);
		l.repaint();
		
	 return p;	
	}

	
}
