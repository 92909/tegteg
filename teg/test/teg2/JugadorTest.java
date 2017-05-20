package teg2;



import org.junit.Assert;
import org.junit.Test;

import application.Jugador;
import application.Pais;


public class JugadorTest {

	@Test
	public void test1() {
		Jugador jugador = new Jugador(1);
		Pais pais = new Pais(3);
		Pais pais2 = new Pais(3);
		pais.setJugador(jugador);
		pais2.setJugador(jugador);

		jugador.atacar(pais, pais2);
	}
	
	@Test
	public void test2() {
		Jugador jugador = new Jugador(1);
		Jugador jugador2 = new Jugador(2);
		Pais pais = new Pais(3);
		Pais pais2 = new Pais(3);
		pais.setJugador(jugador);
		pais2.setJugador(jugador2);
		
		jugador.atacar(pais, pais2);
	}
	
	@Test
	public void test3() {
		Jugador jugador = new Jugador(1);
		Jugador jugador2 = new Jugador(2);
		Pais pais = new Pais(1);
		Pais pais2 = new Pais(3);
		pais.setJugador(jugador);
		pais2.setJugador(jugador2);
		
		jugador.atacar(pais, pais2);
	}

}
