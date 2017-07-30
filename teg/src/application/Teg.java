package application;

import java.util.ArrayList;
import java.util.List;

public class Teg {

	List<VistaPais> paises = new ArrayList<>();
	VistaPais pais1;
	VistaPais pais2;
	int cantidadDeJugadores=2;
	
	public Teg() {
		paises.add(new VistaPais(100, 100, Pais.AUSTRALIA, "/VERDE/AUSTRALIA.png", 1224, 837));
		paises.add(new VistaPais(100, 200, Pais.SUMATRA, "/NARANJA/SUMATRA.png", 1212, 770));
		paises.add(new VistaPais(300, 100, Pais.FILIPINAS, "/CELESTE/FILIPINAS.png", 1340, 750));
		paises.add(new VistaPais(300, 200, Pais.TONGA, "/AZUL/TONGA.png", 1486, 799));
		paises.add(new VistaPais(200, 300, Pais.TASMANIA, "/ROJO/TASMANIA.png", 1343, 1037));
		paises.add(new VistaPais(200, 300, Pais.NUEVA_ZELANDIA, "/AMARILLO/NUEVA_ZELANDIA.png", 1233, 1074));
		
//		paises.add(new VistaPais(200, 300, Pais.ARABIA, "/AMARILLO/ARABIA.png", 1129, 628));
		
		paises.add(new VistaPais(200, 100, Pais.SUDAFRICA, "/AMARILLO/SUDAFRICA.png", 908, 907 ));
		paises.add(new VistaPais(200, 100, Pais.SUDAFRICA, "/VERDE/SUDAFRICA.png", 908, 907 ));
		paises.add(new VistaPais(300, 300, Pais.MAURITANIA, "/AZUL/MAURITANIA.png", 934, 863));
		
		ArrayList<Jugador>jugadores=new ArrayList<Jugador>();
		
		for(int i=0;i<cantidadDeJugadores;i++){
			
			jugadores.add(new Jugador(i));
			
			
			
		}
		
		for(int i=0;i<paises.size();i++){
			
			paises.get(i).pais.j = jugadores.get(i%jugadores.size());
			
			
			paises.get(i).setColor(jugadores.get(i%jugadores.size()));
			
		}
		
	}

	public List<int[]> jugar() throws Exception {
		Enfrentamiento enfrentamiento = new Enfrentamiento(pais1, pais2, new Carta("clasico"));
		enfrentamiento.pelear();
		List<int[]> list = new ArrayList<>();
		list.add(enfrentamiento.batalla.jugador1);
		list.add(enfrentamiento.batalla.jugador2);
		return list;
		
	}

	public int tirarMisil() throws Exception {
		return pais1.pais.tirarMisil(pais2.pais);
		
	}
}
