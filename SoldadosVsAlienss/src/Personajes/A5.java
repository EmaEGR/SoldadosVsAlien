package Personajes;
 

import Graficos.Alien5Grafico;
import Principal.Celda;


public class A5 extends Alien{
	

	public A5( Celda pos ) {		
		super(pos);
		this.moneda=40;
		this.punto=30;
 		this.vida = 100;
		this.fuerza = (float) 0.5;
		this.grafico = new Alien5Grafico(pos.getFila(), pos.getColumna());		
		
	}

	
	
	
}
