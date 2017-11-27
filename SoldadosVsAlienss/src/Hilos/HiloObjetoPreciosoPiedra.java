package Hilos;



import Objetos.Obstaculo;
import Principal.Logica;

public class HiloObjetoPreciosoPiedra extends Thread{
	protected Obstaculo ob;
	
	private Logica l;
	private volatile boolean execute;	
		
	public HiloObjetoPreciosoPiedra  (Logica l,Obstaculo o ) {
		this.l = l;
		ob = o;
		 
		 
	}	
	
	public void terminate () {
		this.execute = false;
		 
	}
	
	public void run () {
		try {
			 	
			this.execute = true;
			 
			while (execute) {			
				Thread.sleep(10000);
				l.eliminar(ob);
				l.getPiedras().remove(ob);
				execute = false;
			}
			} catch (InterruptedException e2) {
				e2.printStackTrace();
		}
	}
	 
}

 
