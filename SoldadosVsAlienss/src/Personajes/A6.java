package Personajes;
 

import Graficos.Alien6Grafico;
import Principal.Celda;

public class A6 extends Alien{


	public A6( Celda pos ) {		
		super(pos);
		this.moneda=45;
		this.punto=35;
 		this.vida = 100;
		this.fuerza = (float) 0.6;
		this.distanciaAtaque = 4;
		this.grafico = new Alien6Grafico(pos.getFila(), pos.getColumna());		
		
	}

 
	
}
