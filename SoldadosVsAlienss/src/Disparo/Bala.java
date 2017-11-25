package Disparo;

import Objetos.Obstaculo;
import Personajes.Personaje;
import Personajes.Soldado;
import Principal.Celda;

public abstract class Bala extends Obstaculo{
	
	protected float fuerzaDeImpacto;
	
	public Bala (Celda pos, float f ){
		this.pos = pos;
		fuerzaDeImpacto = f;
		grafico = null;		
	}
	
	public float getFuerzaImpacto (){
		return fuerzaDeImpacto;
	}



}
