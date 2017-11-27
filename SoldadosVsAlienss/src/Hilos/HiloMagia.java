package Hilos;



import Objetos.Obstaculo;
import Principal.Logica;

public class HiloMagia extends Thread{
	protected Obstaculo ob;
	
	private Logica l;
	private volatile boolean execute;	
		
	public HiloMagia  (Logica l,Obstaculo o ) {
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
				Thread.sleep(6000);
				if  ( ob != null)
					l.eliminar(ob);
				execute = false;
			}
			} catch (InterruptedException e2) {
				e2.printStackTrace();
		}
	}
	 
}

 
