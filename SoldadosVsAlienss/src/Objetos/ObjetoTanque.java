package Objetos;

import Graficos.TanqueGrafico;
import Principal.Celda;

public class ObjetoTanque extends ObjetoTemporal{

	public ObjetoTanque(Celda pos) {
		super(pos);
		this.grafico = new TanqueGrafico(pos.getFila(),pos.getColumna());
		 
	}

}
