package Hilos;

import Personajes.Alien;
import Principal.Logica;

public class HiloAtaqueAliens extends HiloBasico {
 
	
	public  HiloAtaqueAliens (Logica l, HiloLogico h ) {
		 super(l,h);
	}
	
	
	public void run () {
		if (execute) {
			try {				
				for (Alien a : l.getAliens()){	
					l.ataqueAlien(a);
				}
				Thread.sleep(10);
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
				hiloLogico.setEspera (false);
				}
			}
	}
