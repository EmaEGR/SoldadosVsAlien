package Objetos;

 
import Graficos.RobotGrafico;
import Principal.Celda;

public class ObjetoRobot extends ObjetoVidaComprar {

	public ObjetoRobot(Celda pos) {
		super(pos);
		this.precio = 50;
		this.grafico = new RobotGrafico(pos.getFila(),pos.getColumna());
	}

}
