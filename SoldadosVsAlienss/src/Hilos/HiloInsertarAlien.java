package Hilos;

import Principal.Logica;

public class HiloInsertarAlien  extends HiloBasico{
 
	
	public  HiloInsertarAlien (Logica l, HiloLogico h ) {
		super(l,h);
	}
		
	public void run () {
		
		if (execute) {
			try {			 			
				l.insertarEnemigos();
					
				Thread.sleep(10);
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
				hiloLogico.setEspera(false);
		}
	}
}

