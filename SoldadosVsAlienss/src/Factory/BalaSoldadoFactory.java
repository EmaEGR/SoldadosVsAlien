package Factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Disparo.Bala;
import Disparo.BalaSoldado;
import Personajes.Personaje;
import Principal.Celda;

public class BalaSoldadoFactory implements BalasFactoryMethod{
	
	protected JPanel panel;
	protected JLabel l;
	
	public BalaSoldadoFactory(JPanel p) {
		panel= p;
	}
	
	public Bala crearBalas(Celda c, Personaje p) {
		Bala disparo = new BalaSoldado(c,p.getFuerza());
		c.setElemento(disparo);
		l = disparo.getGrafico(0);
		panel.add(l);
		l.repaint();
	return disparo;
	}
	

}
