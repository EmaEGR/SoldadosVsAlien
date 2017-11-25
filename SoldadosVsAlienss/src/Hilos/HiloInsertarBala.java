package Hilos;

 
import Principal.Logica;

public class HiloInsertarBala extends HiloBasico {
 
	public  HiloInsertarBala (Logica l, HiloLogico h ) {
		 super(l,h);
	}
	
	public void run () {
		if (execute) {
		try {
			
			l.soldadosBala(); 
			Thread.sleep(10);		
			} catch (InterruptedException e2) {
				e2.printStackTrace();
		}
		}
	}
}