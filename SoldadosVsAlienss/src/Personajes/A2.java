package Personajes;
 
 

 
import Graficos.Alien2Grafico;
 
import Principal.Celda;
 

public class A2 extends Alien{
	

	public A2( Celda pos ) {		
		super(pos);
		this.moneda=25;
		this.punto=15;
 		this.vida = 100;
		this.fuerza = (float) 0.2;
		this.grafico = new Alien2Grafico(pos.getFila(), pos.getColumna());		
		
	}
	
	
	
}
