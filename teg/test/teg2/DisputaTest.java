package teg2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DisputaTest {

	@Test
	public void test1() {
		Disputa disputa = new Disputa(new Pais(4), new Pais(1), new Carta("clasico"));
		Assert.assertEquals( disputa.getEjercitoAtaque().length , 3);
		Assert.assertEquals( disputa.getEjercitoDefensa().length , 1);
	}
	
	@Test
	public void test2() {
		Disputa disputa = new Disputa(new Pais(2), new Pais(5), new Carta("clasico"));
		Assert.assertEquals( disputa.getEjercitoAtaque().length , 1);
		Assert.assertEquals( disputa.getEjercitoDefensa().length , 3);
	}
	
	@Test
	public void test3() {
		Disputa disputa = new Disputa(new Pais(2), new Pais(5), new Carta("vientoAFavor"));
		Assert.assertEquals( disputa.getEjercitoAtaque().length , 2);
		Assert.assertEquals( disputa.getEjercitoDefensa().length , 3);
	}
	
	@Test
	public void test4() {
		Disputa disputa = new Disputa(new Pais(2), new Pais(5), new Carta("nieve"));
		Assert.assertEquals( disputa.getEjercitoAtaque().length , 1);
		Assert.assertEquals( disputa.getEjercitoDefensa().length , 4);
	}
	
	@Test
	public void test5() {
		Disputa disputa = new Disputa(new Pais(5), new Pais(1), new Carta("clasico"));
		if (disputa.pelear() == disputa.getBatalla.getEjercitosDefensa.length){
			Assert.assertEquals( disputa.getPaisDefensa().getJugador(), disputa.getPaisAtaque().getJugador());
		}
	}

}
