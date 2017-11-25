package Personajes;

import Graficos.Alien3Grafico;
import Principal.Celda;

public class A3 extends Alien{


	public A3( Celda pos ) {		
		super(pos);
		this.moneda=30;
		this.punto=20;
 		this.vida = 100;
		this.fuerza = (float) 0.3;
		this.grafico = new Alien3Grafico(pos.getFila(), pos.getColumna());		
		
	}
	
	
	
	
}
