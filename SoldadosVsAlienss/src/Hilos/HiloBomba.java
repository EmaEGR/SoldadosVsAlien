package Hilos;

import Estate.EstadoCampo;
import Estate.EstadosinMagia;
import PowerUps.Bomba;
import PowerUps.ObjetoPrecioso;
import Principal.Logica;

public class HiloBomba  extends Thread{
	
	private Logica l;
	private volatile boolean execute;	
	private ObjetoPrecioso bomba;
		
	public HiloBomba  (Logica l,ObjetoPrecioso b ) {
		this.l = l;
		bomba = b;
		 
	}	
	
	public void terminate () {
		this.execute = false;
		 
	}
	
	public void run () {
		try {
			 	
			this.execute = true;
			 
			while (execute) {			
				Thread.sleep(800);
				l.getMapaCombate().eliminar(bomba);
				l.getMapaCombate().setCeldaMapa(bomba.getCelda().getFila(), bomba.getCelda().getColumna(), null);
				execute = false;
			}
			} catch (InterruptedException e2) {
				e2.printStackTrace();
		}
	}
	 
}
