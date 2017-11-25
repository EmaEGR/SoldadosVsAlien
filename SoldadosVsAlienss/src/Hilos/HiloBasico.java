package Hilos;

import Principal.Logica;

public abstract class HiloBasico  extends Thread{
	protected Logica l;
	protected volatile boolean execute;
	protected HiloLogico hiloLogico;
	
	public  HiloBasico (Logica l, HiloLogico h ) {
		this.l = l;
		execute = l.getjuegoActivo();
		hiloLogico = h;
	}
	
	public void run () {
		
	}

}
