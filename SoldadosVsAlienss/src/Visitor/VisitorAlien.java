package Visitor;

import Disparo.Bala;
import Estate.Estado;
import Objetos.ObjetoAgua;
import Objetos.ObjetoFuego;
import Objetos.ObjetoFuente;
import Objetos.ObjetoPiedra;
import Objetos.ObjetoTemporal;
import Objetos.ObjetoVida;
import Objetos.ObjetoVidaComprar;
import Personajes.Alien;
import Personajes.Personaje;
import Personajes.Soldado;
import PowerUps.Bomba;
import PowerUps.Campo_de_Proteccion;
import PowerUps.Fuerza;
import PowerUps.MagiaTemporal;
import PowerUps.ObjetoPrecioso;
import PowerUps.Piedra;

public class VisitorAlien implements Visitor {
	protected Personaje myAlien;
	protected Estado myEstado;
	
	public void setAlien (Personaje a ){
		myAlien = a;
	}
	
	public void setEstado (Estado e ) {
		myEstado = e;
	}

	//---------------------------------------------------VISIT-----------------------------------------------
	
	public void visit(Alien a) {
		 
	}

	public void visit(Soldado a) {
 		a.setVida(a.getVida()*myAlien.getFuerza());
 	}

	public void visit(ObjetoVida a) {

		a.setVida(a.getVida()*myAlien.getFuerza());
		 
	}
	
	public void visit(Bala b){  
		 
	}
 
	public void visit(ObjetoTemporal a) {
		 
	}
	 
	public void visit(ObjetoAgua a) {
	
		
	}

	public void visit(ObjetoFuego a) {
	 
		
	}
 
	public void visit(ObjetoFuente a) {
	 a.setVida(20);
	}
 
	public void visit(ObjetoPiedra a) {
		a.setVida(a.getVida()*myAlien.getFuerza());
	}

	public void visit(ObjetoVidaComprar a) {
		 
		a.setVida(a.getVida()*myAlien.getFuerza());
	}

	@Override
	public void visit(Bomba b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Fuerza b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Piedra p) {
		// TODO Auto-generated method stub	
	}
	
	public void visit(Campo_de_Proteccion c) {
		// TODO Auto-generated method stub
		
	}
	
	//-----------------------------------------------------puedoPasar----------------------------------------
	public boolean puedoPasar(Bala a) {
		return false;
	}

	public boolean puedoPasar(ObjetoVidaComprar a) {
		 
		return false;
	}
	
	public boolean puedoPasar(Alien a) {
		return false;
	}

	public boolean puedoPasar(Soldado a) {
		return false;
	}
	
	public boolean puedoPasar(ObjetoTemporal a) {
		return false;
	}
 
	public boolean puedoPasar(ObjetoAgua a) {
		 
		return false;
	}

	public boolean puedoPasar(ObjetoFuego a) {
		 
		return false;
	}

	public boolean puedoPasar(ObjetoFuente a) {
	 
		return false;
	}

	public boolean puedoPasar(ObjetoVida a) {
		 
		return false;
	}
	
	@Override
	public boolean puedoPasar(ObjetoPiedra a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(MagiaTemporal m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoPrecioso o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	//-----------------------------------------------------Atacar--------------------------------------------
 
	public boolean Atacar(ObjetoAgua a) {
		 
		return false;
	}

	 
	public boolean Atacar(ObjetoFuego a) {
		 
		return false;
	}

	 
	public boolean Atacar(ObjetoFuente a) {
		 
		return true;
	}

	 
	public boolean Atacar(ObjetoPiedra a) {
	 
		return true;
	}

	 
	public boolean Atacar(Bala a) {
	 
		return false;
	}

	 
	public boolean Atacar(Alien a) {
	 
		return false;
	}

	 
	public boolean Atacar(Soldado a) {
		 
		return true;
	}

	 
	public boolean Atacar(ObjetoVida a) {
		 
		return true;
	}
	 
	public boolean Atacar(ObjetoVidaComprar a) {
		return true;
	}


	
}