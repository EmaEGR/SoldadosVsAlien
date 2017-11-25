package Factory;

 
import PowerUps.Fuerza;
import PowerUps.MagiaTemporal;
 

public class FactoryFuerza implements MagiaTemporalMethodFactory {
	
		public FactoryFuerza( ) {	 
		}
		
		public Fuerza crearMagia () {
			Fuerza f = new Fuerza();
				
		 return f;
		}
}
