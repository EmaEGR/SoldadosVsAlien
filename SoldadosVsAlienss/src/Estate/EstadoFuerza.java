package Estate;

import Personajes.Personaje;

public class EstadoFuerza extends Estado {

public EstadoFuerza () {
	
}
public void disminuirVida (float i, Personaje p ) {
	 
	float vida = (float) ((p.getVida() * i )* 0.4);
	p.setVida(vida);
	 
}


	

}
