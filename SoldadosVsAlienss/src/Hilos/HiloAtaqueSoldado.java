package Hilos;

 
import Personajes.S3;
import Personajes.Soldado;
import Principal.Logica;

public class HiloAtaqueSoldado  extends HiloBasico {
 
	
	public  HiloAtaqueSoldado (Logica l, HiloLogico h ) {
		super(l,h);
	}
	
	
	public void run () {
		if (execute) {
			try {				
				for (Soldado s : l.getSoldados())
					l.ataqueSoldado(s);
				
				for (S3 p: l.getS3())
					l.ataqueSoldadoS3(p);
				
				Thread.sleep(10);
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
			l.limpiarMuertos();
				this.hiloLogico.setEspera (false);
			}
	}
	}

