package cartasGlobales;

public final class Crisis extends CartaGlobal {

	static {
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new Crisis());
		}
	}
	
	private Crisis() {
	}

	@Override
	public boolean crisis() {
		return true;
	}

}
