
package Personajes;

import Graficos.Soldado2Grafico;
import Principal.Celda;

public class S2 extends Soldado{

	
	public S2(Celda pos) {
		super(pos); 
		this.precio = 25;
		this.vida = 100;
		this.fuerza = (float) 0.3;
		this.distanciaAtaque = 4;
		grafico = new Soldado2Grafico(pos.getFila(), pos.getColumna());
	}

}
