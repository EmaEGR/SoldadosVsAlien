package Factory;

 
import PowerUps.Campo_de_Proteccion;
 
import PowerUps.MagiaTemporal;
 

public class FactoryCampoProteccion implements MagiaTemporalMethodFactory {
	 

		public FactoryCampoProteccion ( ) {
			 
		}
		
		public MagiaTemporal crearMagia () {
			Campo_de_Proteccion f = new Campo_de_Proteccion();
			 
			
		 return f;
		}
 
		
	
}