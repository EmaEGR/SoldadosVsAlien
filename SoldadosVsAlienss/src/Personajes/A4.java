package Personajes;
 

import Graficos.Alien4Grafico;
import Principal.Celda;

public class A4 extends Alien{

	public A4( Celda pos ) {		
		super(pos);
		this.moneda=35;
		this.punto=25;
 		this.vida = 100;
		this.fuerza = (float) 0.4;
		this.grafico = new Alien4Grafico(pos.getFila(), pos.getColumna());		
	}
	
	
	
	
}
