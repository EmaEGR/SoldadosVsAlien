package Estate;

import Personajes.Personaje;

public class EstadosinMagia extends Estado {
	//Cuando los personajes se encuentran sin magia, la cantidad de vida que se le extrae al personaje es:
		// (el porcentaje de la fuerza del ataquante * la vida del personaje)
	 
	public EstadosinMagia () {
		
	}
	
	public void disminuirVida(float i, Personaje p) {
		float vida = p.getVida() * i;
		p.setVida(vida);
		
	} 

}
