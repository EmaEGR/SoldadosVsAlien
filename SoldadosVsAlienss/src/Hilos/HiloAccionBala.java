package Hilos;

import Disparo.Bala;
 
import Principal.Logica;

public class HiloAccionBala extends HiloBasico {
	 
	public  HiloAccionBala (Logica l, HiloLogico h ) {
		super(l,h);
	}
	
	
	public void run () {
		if (execute) {
			try {				
				for (Bala b : l.getBalas()){	
					l.balaSoldado(b);
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
