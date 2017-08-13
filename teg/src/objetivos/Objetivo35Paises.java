package objetivos;

import application.Enfrentamiento;
import application.Teg;

public final class Objetivo35Paises extends Objetivo {

	@Override
	public boolean objetivoPersonalCumplido(Enfrentamiento enfrentamiento) {
		return Teg.paisesDel(enfrentamiento.a.pais.getJugador()) >= 35;
	}

}
