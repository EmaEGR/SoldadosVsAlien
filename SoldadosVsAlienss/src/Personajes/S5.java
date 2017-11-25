
package Personajes;

 
 
 
 
import Graficos.Soldado5Grafico;
import Principal.Celda;
 

public class S5 extends Soldado {
	
		
	public S5(Celda pos) {
		super(pos);
		this.precio = 60;
		this.vida = 100;
		this.fuerza = (float) 0.6;
		this.distanciaAtaque = 4;
		grafico = new Soldado5Grafico(pos.getFila(), pos.getColumna());
	}


	
}
