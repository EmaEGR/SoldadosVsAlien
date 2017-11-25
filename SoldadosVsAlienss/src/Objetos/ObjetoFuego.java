package Objetos;

import Graficos.ObjetoFuegoGrafico;
import Principal.Celda;

import Visitor.Visitor;

public class ObjetoFuego extends ObjetoTemporal{
	
	public ObjetoFuego(Celda c) {
		super(c);
		grafico = new ObjetoFuegoGrafico(c.getFila(), c.getColumna());
	}
	
	
	
}
