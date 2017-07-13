package teg2;

import org.junit.Assert;
import org.junit.Test;

import application.Carta;
import application.Enfrentamiento;
import application.Pais;

public class EnfrentamientoTest {

	@Test
	public void test1() throws Exception {
		Enfrentamiento enfrentamiento = new Enfrentamiento(new Pais(4), new Pais(1), new Carta("clasico"));
		Assert.assertEquals( enfrentamiento.getEjercitoAtaque().length , 3);
		Assert.assertEquals( enfrentamiento.getEjercitoDefensa().length , 1);
	}
	
	@Test
	public void test2() throws Exception {
		Enfrentamiento enfrentamiento = new Enfrentamiento(new Pais(2), new Pais(5), new Carta("clasico"));
		Assert.assertEquals( enfrentamiento.getEjercitoAtaque().length , 1);
		Assert.assertEquals( enfrentamiento.getEjercitoDefensa().length , 3);
	}
	
	@Test
	public void test3() throws Exception {
		Enfrentamiento enfrentamiento = new Enfrentamiento(new Pais(3), new Pais(5), new Carta("vientoAFavor"));
		Assert.assertEquals( enfrentamiento.getEjercitoAtaque().length , 3);
		Assert.assertEquals( enfrentamiento.getEjercitoDefensa().length , 3);
	}
	
	@Test
	public void test4() throws Exception {
		Enfrentamiento enfrentamiento = new Enfrentamiento(new Pais(2), new Pais(5), new Carta("nieve"));
		Assert.assertEquals( enfrentamiento.getEjercitoAtaque().length , 1);
		Assert.assertEquals( enfrentamiento.getEjercitoDefensa().length , 4);
	}
	
	@Test
	public void test5() throws Exception{
		Enfrentamiento enfrentamiento = new Enfrentamiento(new Pais(5), new Pais(1), new Carta("clasico"));
		if (enfrentamiento.pelear() == enfrentamiento.getEjercitoDefensa().length){
//			Assert.assertEquals( enfrentamiento.getPaisDefensa().getJugador(), enfrentamiento.getPaisAtaque().getJugador());
		}
	}

}
