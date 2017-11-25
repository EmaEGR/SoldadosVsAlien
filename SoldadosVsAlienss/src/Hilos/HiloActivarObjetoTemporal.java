package Hilos;

 
 
import Objetos.Obstaculo;
import Principal.Logica;

public class HiloActivarObjetoTemporal extends Thread {
	
	private Logica l;
	private volatile boolean execute;
	private Obstaculo o;
		
	public HiloActivarObjetoTemporal  (Logica l, Obstaculo obs ) {
		this. o = obs;
		this.l = l;
		 
		 
	}	
	
	public void terminate () {
		this.execute = false;
		 
	}
	
	public void run () {
		try {
			 	
			this.execute = true;
			 
			while (execute) {			
			 
				Thread.sleep(15000);
				o.getCelda().setElemento(null);
				l.getMapaCombate().eliminar(o);
				 
			}
			} catch (InterruptedException e2) {
				e2.printStackTrace();
		}
	}
	 
}
