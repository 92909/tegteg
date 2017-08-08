package objetivos;

import application.Enfrentamiento;
import application.Jugador;
import continentes.Africa;
import continentes.AmericaDelNorte;
import continentes.Oceania;

public class ObjetivoAdelNorteOceaniaY5Africa extends Objetivo {

	public static final ObjetivoAdelNorteOceaniaY5Africa OBJETIVO_ADEL_NORTE_OCEANIA_Y5_AFRICA = new ObjetivoAdelNorteOceaniaY5Africa(); 
	
	@Override
	public boolean objetivoPersonalCumplido(Enfrentamiento enfrentamiento) {
		Jugador jugador = enfrentamiento.a.pais.getJugador();
		return AmericaDelNorte.AMERICA_DEL_NORTE.capturaContinente(jugador) 
				&& Oceania.OCEANIA.capturaContinente(jugador)
				&& Africa.AFRICA.cantidadContinente(jugador) >= 5;
	}
	
	private ObjetivoAdelNorteOceaniaY5Africa() {
	
	}

}
