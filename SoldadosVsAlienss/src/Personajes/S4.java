
package Personajes;

 
 
import Graficos.Soldado4Grafico;
import Principal.Celda;
 

public class S4 extends Soldado {
	
	public S4(Celda pos) {
		super(pos);
		this.precio = 40; 
		this.vida = 100;
		this.fuerza = (float) 0.5;
		this.distanciaAtaque = 4;
		grafico = new Soldado4Grafico(pos.getFila(), pos.getColumna());
	}

	
	

}

