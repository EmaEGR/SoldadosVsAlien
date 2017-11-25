package Visitor;

import Disparo.Bala;
import Objetos.ObjetoAgua;
import Objetos.ObjetoFuego;
import Objetos.ObjetoFuente;
import Objetos.ObjetoPiedra;
import Objetos.ObjetoTemporal;
import Objetos.ObjetoVida;
import Objetos.ObjetoVidaComprar;
import Personajes.Alien;
import Personajes.Soldado;
import PowerUps.Bomba;
import PowerUps.Fuerza;
import PowerUps.MagiaTemporal;
import PowerUps.ObjetoPrecioso;
import PowerUps.Piedra;

public class VisitorBomba implements Visitor {
	
	@Override
	public void visit(ObjetoTemporal o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MagiaTemporal m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObjetoAgua a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObjetoFuego a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObjetoFuente a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObjetoPiedra a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Bala a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Alien a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Soldado a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObjetoVida a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ObjetoVidaComprar a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean puedoPasar(ObjetoTemporal a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoAgua a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoFuego a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoFuente a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoPiedra a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(Bala a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(Alien a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(Soldado a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoVida a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(ObjetoVidaComprar a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedoPasar(MagiaTemporal m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(ObjetoTemporal a) {
		return false;
	}

	@Override
	public boolean Atacar(ObjetoAgua a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(ObjetoFuego a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(ObjetoFuente a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean Atacar(ObjetoPiedra a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean Atacar(Bala a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Atacar(Alien a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean Atacar(Soldado a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean Atacar(ObjetoVida a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean Atacar(ObjetoVidaComprar a) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean Atacar(MagiaTemporal m) {
		// TODO Auto-generated method stub
		return false;
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


	@Override
	public boolean puedoPasar(Piedra p) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
