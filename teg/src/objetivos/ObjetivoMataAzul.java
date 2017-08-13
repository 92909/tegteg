package objetivos;

import application.Enfrentamiento;
import application.Jugador;
import application.Teg;
import application.VistaPais;

public final class ObjetivoMataAzul extends Objetivo {

	@Override
	public boolean objetivoPersonalCumplido(Enfrentamiento enfrentamiento) {
		Jugador jugador = enfrentamiento.d.pais.getJugador();
		return Teg.paisesDel(jugador) == 1 && "AZUL".equals(VistaPais.colores[jugador.getNumero()]); 
	}

}
