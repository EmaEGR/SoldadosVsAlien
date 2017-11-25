package Hilos;

import Estate.EstadoCampo;
import Estate.EstadosinMagia;
import Principal.Logica;

public class HilosObjetoPreciosoPiedra  extends Thread{
	
	private Logica l;
	private volatile boolean execute;	
		
	public HilosObjetoPreciosoPiedra  (Logica l ) {
		this.l = l;
		 
		 
	}	
	
	public void terminate () {
		this.execute = false;
		 
	}
	
	public void run () {
		try {
			 	
			this.execute = true;
			 
			while (execute) {			
				System.out.println("Entre a objetoPrecioso piedra");
				Thread.sleep(80000);
				execute = false;
			}
			} catch (InterruptedException e2) {
				e2.printStackTrace();
		}
	}
	 
}

 
