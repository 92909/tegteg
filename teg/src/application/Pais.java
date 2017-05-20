package application;

import java.util.ArrayList;

public class Pais {
	int cantidadDeFichas;
	ArrayList<Pais> paisesLim=new ArrayList<Pais>();
	public Pais(){
		cantidadDeFichas=1;
	}

	public Pais(int i) {
		
	}

	public Object getCantFichas() {
		
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

}
