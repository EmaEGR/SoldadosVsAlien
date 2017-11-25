package Objetos;

 
import javax.swing.JLabel;

import Estate.Estado;
import Graficos.ObstaculoGrafico;
import PowerUps.MagiaTemporal;
import PowerUps.ObjetoPrecioso;
import Principal.Celda;

import Visitor.Visitor;

public abstract class Obstaculo {

	protected ObstaculoGrafico grafico;
	protected Celda pos;
	protected int vida;
	protected int puntos ;
	protected int monedas;
	protected Estado myEstado;
	protected MagiaTemporal magiaT;
	protected ObjetoPrecioso objetoP;
	
	public void setMagiaTemporal (MagiaTemporal m) {
		magiaT = m;
	}
	
	public void setObjetoPrecioso(ObjetoPrecioso b) {
		objetoP = b;
	}
	
	public ObjetoPrecioso getObjetoPrecioso() {
		return objetoP;
	}
	
	public MagiaTemporal getMagiaTemporal () {
		return magiaT;
	}
	
	public void setPosicion(Celda pos ) {
		this.pos = pos;
	}
	
	public JLabel getGrafico(int n) {	
		return grafico.getGrafico(n);
	}
	
	public ObstaculoGrafico getObstaculoGrafico () {
		return grafico;
	}
	public Estado getEstado () {
		return myEstado;
	}
	
	public void setEstado (Estado e) {
		myEstado = e;
	}
	
	public Celda getCelda() {
		return pos;
	}
	
	public void actualizarGrafico(int n) {
		  grafico.actualizarGrafico(n);
		}
	
	
	public void setCelda(int x, int y) {
		pos.set(x, y);
		grafico.setPoint(x,y);
	}

	public void setVida(float f) {
		vida-=f;
	}
	
	public int getVida() {
		return vida;
	}
	
	public int getPuntos () {
		return puntos;
	}
	
	public int getMonedas () {
		return monedas;
	}

	public abstract void accept(Visitor v);
	
	public abstract boolean dejoPasar(Visitor v);
	
	public abstract boolean puedoAtacar (Visitor v);

}