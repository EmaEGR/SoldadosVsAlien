package Personajes;

import Estate.Estado;
import PowerUps.MagiaTemporal;
import PowerUps.ObjetoPrecioso;
import Principal.Celda;
import Visitor.*;

public class Alien extends Personaje {
	
	protected int moneda;
    protected int punto;
    protected Estado myEstado;
     
     public Alien(Celda pos) {
 		super(pos);
 		myEstado = null;
 	
 	}
   
     
     //Ver si es necesario
     public void setMagiaTemporal (MagiaTemporal m) {
 		magiaT = m;
 	}
 	
 	public MagiaTemporal getMagiaTemporal () {
 		return magiaT;
 	}
 	
 	public ObjetoPrecioso getObjetoPrecioso() {
		return objetoP;
	}
	
	public void setObjetoPrecioso(ObjetoPrecioso b) {
		objetoP = b;
	}
 	
     public void setEstado (Estado e ) {
    	this.myEstado = e;
     }
     
     public Estado getEstado () {
    	 return this.myEstado;
     }
    
     
 	public void setVida(float f) {
		vida-=f;
	}
	
	public int getVida() {
		return vida;
	}
	
	public int getPuntos () {
		return punto;
	}
	
	public int getMonedas () {
		return moneda;
	}
	
	 public void accept(Visitor v) {
  		 v.visit(this);
  	}
	 
	public boolean dejoPasar(Visitor v) {
	   return v.puedoPasar(this);
	}
	
	public boolean puedoAtacar (Visitor v) {
		return v.Atacar(this);
	}


}
