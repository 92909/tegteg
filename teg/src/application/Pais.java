package application;

import java.util.ArrayList;

public class Pais {
	static Pais ARGENTINA = new Pais();
	static Pais BRASIL = new Pais();
	static Pais URUGUAY = new Pais();
	static Pais PARAGUAY = new Pais();
	
	String nombre;
	int cantidadDeFichas;
	ArrayList<Pais> paisesLim=new ArrayList<Pais>();
	Jugador j;

	public Pais(int i) {
		nombre = "pais";
		cantidadDeFichas = i;
	}

	public Pais() {
		cantidadDeFichas=1;
	}

	public int getCantFichas() {
		return cantidadDeFichas;
	}

	public void ponerFichas(int i) {
		cantidadDeFichas=cantidadDeFichas+i;
		// TODO Auto-generated method stub
		
	}

	public void sacarFichas(int i) {
		cantidadDeFichas=cantidadDeFichas-i;
		// TODO Auto-generated method stub
		
	}

	public void tranferir(Pais pais2, int i) {
		this.cantidadDeFichas-=i;
		pais2.cantidadDeFichas+=i;
		// TODO Auto-generated method stub
		
	}

	public boolean limita(Pais pais2) {
		
		return paisesLim.contains(pais2);
	}

	public void agregarLimite(Pais pais2) {
		
		paisesLim.add(pais2);
		pais2.paisesLim.add(this);
		
		
	}

	public void setJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		
	}

	public Jugador  getJugador() {
		// TODO Auto-generated method stub
		return j;
	}

}
