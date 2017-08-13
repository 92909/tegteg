package application;

public class Batalla {
	int[] jugador1;
	int[] jugador2;

	public Batalla(int[] is, int[] is2) {
		this.jugador1 = ordenar(is);;
		this.jugador2 = ordenar(is2);
	}

	private int[] ordenar(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[i] < vector[j]) {
					int aux = vector[j];
					vector[j] = vector[i];
					vector[i] = aux;
				}
			}
		}
		return vector;
	}

	public int batallar() {
		int a = 0;
		if (jugador1.length > jugador2.length) {
			for (int i = 0; i < jugador2.length; i++) {
				if (jugador1[i] > jugador2[i]) {
					a++;
				}
			}
			return a;
		} else {
			for (int i = 0; i < jugador1.length; i++) {
				if (jugador1[i] > jugador2[i]) {
					a++;
				}
			}
			return a;
		}

	}

	public int cantBatallas() {
		return Math.min(jugador1.length, jugador2.length);
	}
}
