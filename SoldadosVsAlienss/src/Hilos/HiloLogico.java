package Hilos;

import Principal.Logica;

public class HiloLogico extends Thread {
	private Logica l;
	private volatile boolean execute;
	private volatile boolean esperar;
	private HiloMovimientoAliens hiloMovAlien;
	private HiloAtaqueAliens hiloAtaqueAlien;
	private HiloInsertarAlien hiloInsertarAlien;
	private HiloInsertarBala hiloInsertarBalas;
	private HiloMovimientoBala hiloMovBala;
	private HiloAccionBala hiloAccionBala;
	private HiloAtaqueSoldado hiloAtaqueSoldado;
	private HiloLimpieza hiloLimpieza;
	
	public  HiloLogico (Logica l ) {
		this.l = l;
		execute = l.getjuegoActivo();
		hiloMovAlien = new HiloMovimientoAliens (l,this);
		hiloAtaqueAlien = new HiloAtaqueAliens (l,this);
		hiloInsertarAlien = new HiloInsertarAlien(l,this);
		hiloInsertarBalas = new HiloInsertarBala (l,this);
		hiloMovBala = new HiloMovimientoBala (l,this);
		hiloAccionBala = new HiloAccionBala (l,this);
		hiloAtaqueSoldado = new HiloAtaqueSoldado(l,this);
		hiloLimpieza = new HiloLimpieza (l,this);
		esperar = true;
	}
	
	
	
	
	public void run () {
		try {	
			while (esperar && l.getjuegoActivo()) {
				System.out.println("");
				Thread.sleep(500);
				hiloInsertarAlien.run();
				while (esperar)
					Thread.sleep(200);
				this.setEspera(true);
				
				Thread.sleep(1000);
				
				hiloInsertarBalas.run();
				this.setEspera(true);
				
				
 				hiloAccionBala.run();
				while (esperar)
					Thread.sleep(200);
				this.setEspera(true);
				
				
				hiloMovBala.run();
				while (esperar)
					Thread.sleep(100);
				this.setEspera(true);
				

 				hiloAtaqueSoldado.run();
				while (esperar)
					Thread.sleep(200);
				
 				hiloAtaqueAlien.run();
				while (esperar)
					Thread.sleep(200);
				this.setEspera(true);
				
				hiloMovAlien.run();
 				while (esperar)
					Thread.sleep(200);
				this.setEspera(true);
 
				
				
 				hiloLimpieza.run();
				while (esperar)
					Thread.sleep(200);
				this.setEspera(true);
				
				
				 
			}
			
			} catch (InterruptedException e2) {
				e2.printStackTrace();
		}
	}
	
	public void setEspera (boolean e) {
		esperar = e;
	}
	
}
