package Principal;
import Objetos.Obstaculo;

public class Celda {
	
	protected Obstaculo elemento;
	protected int fila;
	protected int columna;
	
	public Celda(int f, int c) {
		fila=f;
		columna=c;
		elemento = null;
		
	}
	public Obstaculo getElemento() {
		return elemento;
	}
	
	public void setElemento(Obstaculo elem) {
		elemento= elem;
	}
	
	public int getFila(){
		return fila;
	}
	
	public int getColumna(){
		return columna;
	}
	public void set(int x, int y) {
		fila = x;
		columna = y;
	}
	
}
