package Objetos;

 
import Graficos.ParedGrafica;
import Principal.Celda;

public class ObjetoPared extends ObjetoVidaComprar {

	public ObjetoPared(Celda pos) {
		super(pos);
		this.precio = 50;
		this.grafico = new ParedGrafica(pos.getFila(),pos.getColumna());
	}

}
