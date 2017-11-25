
package Personajes;

 
import Graficos.Soldado1Grafico;
import Principal.Celda;
 

public class S1 extends Soldado {
	
	public S1(Celda pos) {
		super(pos); 
		this.precio = 20;
		this.vida = 100;
		this.fuerza = (float) 0.2;
		this.distanciaAtaque = 4;
		this.grafico = new Soldado1Grafico(pos.getFila(), pos.getColumna());
	}

}
