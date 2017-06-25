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
		paises.add(new VistaPais(200, 200, Pais.URUGUAY, Color.BEIGE));
		paises.add(new VistaPais(300, 100, Pais.CHILE, Color.DEEPPINK));
		paises.add(new VistaPais(300, 200, Pais.BOLIVIA, Color.LAWNGREEN));
		paises.add(new VistaPais(300, 300, Pais.VENEZUELA, Color.STEELBLUE));
		paises.add(new VistaPais(200, 300, Pais.COLOMBIA, Color.ANTIQUEWHITE));
		
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
