package Hilos;


import Personajes.Alien;
import Principal.Logica;

public class HiloMovimientoAliens extends HiloBasico {
 
	public  HiloMovimientoAliens (Logica l, HiloLogico h ) {
		super(l,h);
	}
	
	
	public void run () {
		if (execute) {
		try {				
			for (Alien a : l.getAliens()){	
				l.moverAlien(a);
			}
			Thread.sleep(10);
			execute = l.getjuegoActivo();		
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
			hiloLogico.setEspera (false);
			}
		}
	}
