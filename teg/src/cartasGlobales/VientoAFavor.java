package cartasGlobales;

public final class VientoAFavor extends CartaGlobal {

	static {
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new VientoAFavor());
		}
	}
	
	private VientoAFavor() {
	}
	
	@Override
	public int beneficioAtaque() {
		return 1;
	}

}
