
package Personajes;

 
 
 
import Graficos.Soldado3Grafico;
import Principal.Celda;
 

public class S3 extends Soldado {
	
	protected Celda celdaVecina;
	
	public S3(Celda pos,Celda v) {
		super(pos);
		this.precio = 30;
		this.vida = 100;
		this.fuerza = (float) 0.4;
		this.distanciaAtaque = 4;
		celdaVecina = v;
		grafico = new Soldado3Grafico(pos.getFila(), pos.getColumna());
	}

	public void setCeldaVecina(Celda c) {
		celdaVecina = c;
	}
	
	public Celda getCeldaVecina() {
		return celdaVecina;
	}
	


}


