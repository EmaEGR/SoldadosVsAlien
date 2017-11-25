 package Hilos;

import Objetos.Obstaculo;
import Principal.Logica;

public class HiloLimpieza  extends HiloBasico{
	 
	
	public  HiloLimpieza (Logica l, HiloLogico h ) {
		super(l,h);
	}	
	
	
	
	public void run () {
		if (execute) {
		try {
			while (l.getObstaculos_a_Limpiar().size() > 0) {	
				Obstaculo o = l.getObstaculos_a_Limpiar().removeFirst();
				l.getMapaCombate().eliminar(o);
			}
			Thread.sleep(10);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
		}
		hiloLogico.setEspera(false);
		}
	}
	 
}