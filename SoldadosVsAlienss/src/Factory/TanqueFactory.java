package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;
 
import Objetos.ObjetoTanque;
import Objetos.ObjetoTemporal;
 
import Principal.Celda;

public class TanqueFactory implements ObjTemporalFactoryMethod{
	protected JPanel panel;
	protected JLabel l;
	
	
	public TanqueFactory(JPanel p) {
		panel= p;
	}
	 
 
 
	public ObjetoTemporal createObjetoTemporal  (Celda c) {
		ObjetoTemporal p = new ObjetoTanque(c);
		c.setElemento(p);
		l = p.getGrafico(0);
		panel.add(l);
		l.repaint();
		
	 return p;	
	}


 



}
