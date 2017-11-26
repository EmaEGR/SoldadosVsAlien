package Visitor;

import Disparo.Bala;
import Objetos.ObjetoAgua;
import Objetos.ObjetoFuego;
import Objetos.ObjetoFuente;
import Objetos.ObjetoPiedra;
import Objetos.ObjetoTemporal;
import Objetos.ObjetoVida;
import Objetos.ObjetoVidaComprar;
import Personajes.*;
import PowerUps.Bomba;
import PowerUps.Campo_de_Proteccion;
import PowerUps.Fuerza;
import PowerUps.MagiaTemporal;
import PowerUps.ObjetoPrecioso;
import PowerUps.Piedra;

public interface Visitor {
	public void visit (ObjetoTemporal o);
	public void visit (ObjetoAgua a);
	public void visit (ObjetoFuego a);
	public void visit (ObjetoFuente a);
	public void visit (ObjetoPiedra a);
	public void visit (Bala a);
	public void visit (Alien a );
	public void visit (Soldado a );
	public void visit (ObjetoVida a );
	public void visit (ObjetoVidaComprar a );
	public void visit (Bomba b);
	public void visit (Fuerza b);
	public void visit (Piedra p);
	public void visit (Campo_de_Proteccion c);
 

	public boolean puedoPasar (ObjetoTemporal a);
	public boolean puedoPasar (ObjetoAgua a);
	public boolean puedoPasar (ObjetoFuego a);
	public boolean puedoPasar (ObjetoFuente a);
	public boolean puedoPasar (ObjetoPiedra a);
	public boolean puedoPasar (Bala a);
	public boolean puedoPasar (Alien a );
	public boolean puedoPasar (Soldado a );
	public boolean puedoPasar (ObjetoVida a );
	public boolean puedoPasar (ObjetoVidaComprar a);
	public boolean puedoPasar (MagiaTemporal m);
	public boolean puedoPasar (ObjetoPrecioso o);

	
	public boolean Atacar (ObjetoAgua a);
	public boolean Atacar (ObjetoFuego a);
	public boolean Atacar (ObjetoFuente a);
	public boolean Atacar (ObjetoPiedra a);
	public boolean Atacar (Bala a);
	public boolean Atacar (Alien a );
	public boolean Atacar (Soldado a );
	public boolean Atacar (ObjetoVida a );
	public boolean Atacar (ObjetoVidaComprar a );

}