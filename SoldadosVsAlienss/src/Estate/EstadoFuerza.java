package Estate;

import Personajes.Personaje;

public class EstadoFuerza extends Estado {
	//Si el personaje se encuentra en estadoNivel 2, la cantidad de vida que se le extrae al mismo es:
	// (El total de vida del Personaje X el porcentaje de fuerza del contrincante ) X 0.3, 
	// que en este caso es de 0.4

/*
 *@param i Indica la fuerza del personaje que lo hirió
 *@param p Personaje el cual es atacado
 *  
 */
	
public EstadoFuerza () {
	
}
public void disminuirVida (float i, Personaje p ) {
	 
	float vida = (float) ((p.getVida() * i )* 0.4);
	p.setVida(vida);
	 
}


	

}
