package Estate;

import Personajes.Personaje;

public class EstadosinMagia extends Estado {
	
	public EstadosinMagia () {
		
	}
	
	public void disminuirVida(float i, Personaje p) {
		float vida = p.getVida() * i;
		p.setVida(vida);
		
	} 

}
