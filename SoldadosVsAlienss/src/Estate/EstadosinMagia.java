package Estate;

import Personajes.Personaje;

public class EstadosinMagia extends Estado {
<<<<<<< HEAD
	
=======
	//Cuando los personajes se encuentran sin magia, la cantidad de vida que se le extrae al personaje es:
	// (el porcentaje de la fuerza del ataquante * la vida del personaje)
	 
>>>>>>> 269f353e9df18a8d1d0c043efedcdf14d20a54f9
	public EstadosinMagia () {
		
	}
	
	public void disminuirVida(float i, Personaje p) {
		float vida = p.getVida() * i;
		p.setVida(vida);
		
	} 

}
