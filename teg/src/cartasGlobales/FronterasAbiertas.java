package cartasGlobales;

import application.Jugador;

public final class FronterasAbiertas implements CartaGlobal {

	static {
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new FronterasAbiertas());
		}
	}
	
	private FronterasAbiertas() {
	}
	
	@Override
	public int beneficioDefensa() {
		return 0;
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
		return true;
	}

	@Override
	public boolean soloContinental() {
		return true;
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
