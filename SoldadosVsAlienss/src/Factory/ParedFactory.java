package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Objetos.ObjetoPared;
 
import Objetos.ObjetoVidaComprar;
import Principal.Celda;

public class ParedFactory implements ObjVidaComprarFactoryMethod{
	protected JPanel panel;
	protected JLabel l;

	
	public ParedFactory(JPanel p) {
		panel= p;
	}
	
	public ObjetoVidaComprar createObjeto  (Celda c) {
		ObjetoVidaComprar p = new ObjetoPared(c);
		c.setElemento(p);
		l = p.getGrafico(0);
		panel.add(l);
		l.repaint();
		
	 return p;	
	}


}
