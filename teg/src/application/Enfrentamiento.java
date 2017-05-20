package application;

public class Enfrentamiento {
	int fichas1 = 0;
	int fichas2 = 0;
	public Object getBatalla;
	int[] fichas = new int[fichas1];

	public Enfrentamiento(Pais pais, Pais pais2, Carta carta) {
		fichas1 = pais.cantidadDeFichas;
		fichas2 = pais2.cantidadDeFichas;
	}

	public int[] getEjercitoAtaque() throws Exception {
		int[] f;
		if (fichas1 > 3){
			 f = new int[3];
		}else if( fichas1 > 1){
			 f = new int[fichas1-1];
		}else{
			throw new Exception();
		}
		return f;
	}

	public int[] getEjercitoDefensa() {
		int[] fichas = new int[fichas2];
		int[] f = new int[3];
		int[] fi = new int[2];
		int[] fic = new int[1];

		if (fichas.length >= 3) {

		} else if (fichas.length == 2) {

		} else if (fichas.length == 1) {
			return fic;

		}

	}

	public Object pelear() {
		// TODO Auto-generated method stub
		return null;
	}

}
