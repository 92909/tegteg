package cartasGlobales;

public final class FronterasAbiertas extends CartaGlobal {

	static {
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new FronterasAbiertas());
		}
	}
	
	private FronterasAbiertas() {
	}

	@Override
	public boolean soloIntercontinental() {
		return true;
	}

}
