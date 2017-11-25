package Hilos;

import Disparo.Bala;
import Personajes.Alien;
import Principal.Logica;

public class HiloMovimientoBala  extends HiloBasico {
 
	public  HiloMovimientoBala (Logica l, HiloLogico h ) {
		 super(l,h);
	}
	
	
	public void run () {
		if (execute) {
			try {				
				for (Bala b : l.getBalas()){	
					l.moverDisparoSoldado(b);
				}
				l.limpiarBalasSoldado();
				Thread.sleep(10);
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
				hiloLogico.setEspera (false);
				}
		}
	}
