package teg2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class EnfrentamientoTest {

	@Test
	public void test1() {
		Enfrentamiento enfrentamiento = new Enfrentamiento(new Pais(4), new Pais(1), new Carta("clasico"));
		Assert.assertEquals( enfrentamiento.getEjercitoAtaque().length , 3);
		Assert.assertEquals( enfrentamiento.getEjercitoDefensa().length , 1);
	}
	
	@Test
	public void test2() {
		Enfrentamiento enfrentamiento = new Enfrentamiento(new Pais(2), new Pais(5), new Carta("clasico"));
		Assert.assertEquals( enfrentamiento.getEjercitoAtaque().length , 1);
		Assert.assertEquals( enfrentamiento.getEjercitoDefensa().length , 3);
	}
	
	@Test
	public void test3() {
		Enfrentamiento enfrentamiento = new Enfrentamiento(new Pais(3), new Pais(5), new Carta("vientoAFavor"));
		Assert.assertEquals( enfrentamiento.getEjercitoAtaque().length , 3);
		Assert.assertEquals( enfrentamiento.getEjercitoDefensa().length , 3);
	}
	
	@Test
	public void test4() {
		Enfrentamiento enfrentamiento = new Enfrentamiento(new Pais(2), new Pais(5), new Carta("nieve"));
		Assert.assertEquals( enfrentamiento.getEjercitoAtaque().length , 1);
		Assert.assertEquals( enfrentamiento.getEjercitoDefensa().length , 4);
	}
	
	@Test
	public void test5() {
		Enfrentamiento enfrentamiento = new Enfrentamiento(new Pais(5), new Pais(1), new Carta("clasico"));
		if (enfrentamiento.pelear() == enfrentamiento.getBatalla.getEjercitosDefensa.length){
			Assert.assertEquals( enfrentamiento.getPaisDefensa().getJugador(), enfrentamiento.getPaisAtaque().getJugador());
		}
	}

}
