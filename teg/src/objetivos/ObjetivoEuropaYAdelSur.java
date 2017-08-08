package objetivos;

import application.Enfrentamiento;
import application.Jugador;
import continentes.AmericaDelSur;
import continentes.Europa;

public class ObjetivoEuropaYAdelSur extends Objetivo {

	@Override
	public boolean objetivoPersonalCumplido(Enfrentamiento enfrentamiento) {
		Jugador jugador = enfrentamiento.a.pais.getJugador();
		return Europa.EUROPA.capturaContinente(jugador) && AmericaDelSur.AMERICA_DEL_SUR.capturaContinente(jugador);
	}

}
