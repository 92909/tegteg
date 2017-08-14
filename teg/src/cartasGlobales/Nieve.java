package cartasGlobales;

import application.Jugador;

public final class Nieve implements CartaGlobal {
	
	static {
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new Nieve());
		}
	}
	
	private Nieve() {
	}

	@Override
	public int beneficioDefensa() {
		return 1;
	}

	@Override
	public int beneficioAtaque() {
		return 0;
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return false;
	}

	@Override
	public boolean soloIntercontinental() {
		return false;
	}

	@Override
	public boolean soloContinental() {
		return false;
	}

	@Override
	public boolean crisis() {
		return false;
	}

	@Override
	public boolean refuerzosExtra() {
		return false;
	}

}
