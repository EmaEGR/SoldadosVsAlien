package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

 
import Objetos.ObjetoRobot;
import Objetos.ObjetoVidaComprar;
import Principal.Celda;

public class FactoryRobot implements ObjVidaComprarFactoryMethod {

	protected JPanel panel;
	protected JLabel l;

	
	public FactoryRobot(JPanel p) {
		panel= p;
	}
	
	public ObjetoVidaComprar createObjeto  (Celda c) {
		ObjetoVidaComprar p = new ObjetoRobot(c);
		c.setElemento(p);
		l = p.getGrafico(0);
		panel.add(l);
		l.repaint();
		
	 return p;	
	}


}