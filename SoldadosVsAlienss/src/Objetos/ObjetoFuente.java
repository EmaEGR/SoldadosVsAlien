package Objetos;

import Graficos.ObjetoFuenteGrafico;
import Principal.Celda;
import Visitor.Visitor;


public class ObjetoFuente extends ObjetoVida{

	public ObjetoFuente(Celda c) {
		super(c);
		vida = 100;
		grafico = new ObjetoFuenteGrafico(c.getFila(), c.getColumna());
	}
	

}
