package Objetos;

import Graficos.ObjetoPiedraGrafico;
import Principal.Celda;
import Visitor.Visitor;


public class ObjetoPiedra extends ObjetoVida{

	
	public ObjetoPiedra(Celda c) {
		super(c);
		vida = 100;
		grafico = new ObjetoPiedraGrafico(c.getFila(), c.getColumna());
	}
	
	

}
