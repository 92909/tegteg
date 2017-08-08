package continentes;

import java.util.ArrayList;
import java.util.List;

import application.Jugador;
import application.Pais;

public abstract class Continente {
	
	protected List<Pais> paises = new ArrayList<>();

	public boolean capturaContinente(Jugador jugador){
		return cantidadContinente(jugador) == paises.size();
	}
	
	public int cantidadContinente(Jugador jugador){
		int cant = 0;
		for (Pais pais : paises){
			if (pais.getJugador().equals(jugador)){
				cant++;
			}
		}
		return cant;
	}
}
