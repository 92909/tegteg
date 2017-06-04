package application;

import java.util.ArrayList;
import java.util.List;

public class Teg {

	private List<Pais> paises = new ArrayList<>();
	
	private Pais pais1;
	private Pais pais2;

	public Teg() {
		paises.add(new Pais(8));
		paises.add(new Pais(8));
		paises.add(new Pais(8));
		paises.add(new Pais(8));
	}

	public List<Pais> getPaises() {
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}

	public Pais getPais1() {
		return pais1;
	}

	public void setPais1(Pais pais1) {
		this.pais1 = pais1;
	}

	public Pais getPais2() {
		return pais2;
	}

	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}

	public List<int[]> jugar() throws Exception {
		Enfrentamiento enfrentamiento = new Enfrentamiento(pais1, pais2, new Carta("clasico"));
		enfrentamiento.pelear();
		List<int[]> list = new ArrayList<>();
		list.add(enfrentamiento.getEjercitoAtaque());
		list.add(enfrentamiento.getEjercitoDefensa());
		return list;
		
	}
}
