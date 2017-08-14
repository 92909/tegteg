package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoAzul extends CartaGlobal {
	
	DescansoAzul() {
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "AZUL".equals(VistaPais.colores[jugador.getNumero()]);
	}

}
