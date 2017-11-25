package Objetos;

import Graficos.ObjetoAguaGrafico;
import Principal.Celda;
import Visitor.Visitor;

public class ObjetoAgua extends ObjetoTemporal{

	public ObjetoAgua(Celda c) {
		super(c);
		grafico = new ObjetoAguaGrafico(c.getFila(), c.getColumna());
	}
	
	
	
}