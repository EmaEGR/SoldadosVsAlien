package Personajes;
 
 

 
import Graficos.Alien1Grafico;
 
import Principal.Celda;
 
public class A1 extends Alien{

	public A1(Celda pos ) {
		super(pos);
		this.moneda=25;
		this.punto=15;
 		this.vida = 100;
		this.fuerza = (float) 0.2;
		this.grafico = new Alien1Grafico(pos.getFila(), pos.getColumna());		
	}

	

	
}