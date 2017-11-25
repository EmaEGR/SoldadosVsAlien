package Estate;

import Personajes.Personaje;

public class EstadoCampo extends Estado  {
	//Si el personaje se encuentra en estadoCampo , la cantidad de vida que se le extrae al mismo es:
		// (El total de vida del Personaje )
	
	
	public EstadoCampo () {
		
	}
	/*
	 *@param i Indica la fuerza del personaje que lo hirió
	 *@param p Personaje el cual es atacado
	 *  
	 */
	public void disminuirVida (float i, Personaje p ) {
		p.setVida(p.getVida());
		 
	}
 

}
