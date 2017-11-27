package Estate;

import Personajes.Personaje;

public class EstadoCampo extends Estado  {
	
	public EstadoCampo () {
		
	}
	
	public void disminuirVida (float i, Personaje p ) {
		p.setVida(p.getVida());
		 
	}
 

}
