package application;

import java.util.ArrayList;
import java.util.List;

public class Teg {

	List<VistaPais> paises = new ArrayList<>();
	
	Pais pais1;
	Pais pais2;

	public Teg() {
		paises.add(new VistaPais(10, 10, Pais.PARAGUAY));
		paises.add(new VistaPais(30, 10, Pais.BRASIL));
		paises.add(new VistaPais(10, 30, Pais.ARGENTINA));
		paises.add(new VistaPais(30, 30, Pais.URUGUAY));
	}

	public List<int[]> jugar() throws Exception {
		Enfrentamiento enfrentamiento = new Enfrentamiento(pais1, pais2, new Carta("clasico"));
		enfrentamiento.pelear();
		List<int[]> list = new ArrayList<>();
//		list.add(enfrentamiento.getEjercitoAtaque());
//		list.add(enfrentamiento.getEjercitoDefensa());
		return list;
		
	}
}
