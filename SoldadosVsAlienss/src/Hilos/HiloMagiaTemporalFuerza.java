package Hilos;

 
import Estate.EstadoFuerza;
import Estate.EstadosinMagia;
import Principal.Logica;

public class HiloMagiaTemporalFuerza extends Thread {
 
	private Logica l;
	private volatile boolean execute;	
		
	public HiloMagiaTemporalFuerza  (Logica l ) {
		this.l = l;
		 
		 
	}	
	
	public void terminate () {
		this.execute = false;
		 
	}
	
	public void run () {
		try {
			 	
			this.execute = true;
			 
			while (execute) {			
				l.setEstado_MTLogica(new EstadoFuerza());
				Thread.sleep(10000);
				l.setEstado_MTLogica(new EstadosinMagia());
				execute = false;
			}
			} catch (InterruptedException e2) {
				e2.printStackTrace();
		}
	}
	 
}