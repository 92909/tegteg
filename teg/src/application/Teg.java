package application;

import java.util.ArrayList;
import java.util.List;

public class Teg {

	List<VistaPais> paises = new ArrayList<>();
	VistaPais pais1;
	VistaPais pais2;
	int cantidadDeJugadores=2;
	
	public Teg() {
		paises.add(new VistaPais(100, 100, Pais.PARAGUAY));
		paises.add(new VistaPais(200, 100, Pais.BRASIL));
		paises.add(new VistaPais(100, 200, Pais.ARGENTINA));
		paises.add(new VistaPais(200, 200, Pais.URUGUAY));
		paises.add(new VistaPais(300, 100, Pais.CHILE));
		paises.add(new VistaPais(300, 200, Pais.BOLIVIA));
		paises.add(new VistaPais(300, 300, Pais.VENEZUELA));
		paises.add(new VistaPais(200, 300, Pais.COLOMBIA));
		
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
