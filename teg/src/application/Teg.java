package application;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;

public class Teg {

	List<VistaPais> paises = new ArrayList<>();
	
	Pais pais1;
	Pais pais2;

	public Teg() {
		paises.add(new VistaPais(100, 100, Pais.PARAGUAY, Color.RED));
		paises.add(new VistaPais(200, 100, Pais.BRASIL, Color.GREENYELLOW));
		paises.add(new VistaPais(100, 200, Pais.ARGENTINA, Color.BLUE));
		paises.add(new VistaPais(200, 200, Pais.URUGUAY, Color.LIGHTBLUE));
	}

	public List<int[]> jugar() throws Exception {
		Enfrentamiento enfrentamiento = new Enfrentamiento(pais1, pais2, new Carta("clasico"));
		enfrentamiento.pelear();
		List<int[]> list = new ArrayList<>();
		list.add(enfrentamiento.batalla.jugador1);
		list.add(enfrentamiento.batalla.jugador2);
		return list;
		
	}
}
