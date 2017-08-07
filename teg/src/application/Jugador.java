package application;

import java.util.ArrayList;

public class Jugador  {
	ArrayList<Pais> CartasPais=new ArrayList<Pais>();
	String nombre;
	int numero;
	public Jugador(int i) {
		numero = i;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setColor(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
