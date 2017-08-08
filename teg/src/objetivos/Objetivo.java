package objetivos;

import application.Enfrentamiento;
import application.Jugador;
import application.Teg;

public abstract class Objetivo {
	
	public boolean objetivoComunCumplido(Jugador jugador){
		return Teg.paisesDel(jugador) >= 45;
	}

	public abstract boolean objetivoPersonalCumplido(Enfrentamiento enfrentamiento);
	
}
