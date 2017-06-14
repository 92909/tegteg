package teg;

import org.junit.Assert;
import org.junit.Test;

import application.Pais;

public class PaisTest {
	
	@Test
	public void testCrearPais() {
		
		Pais pais = new Pais();
		
		Assert.assertEquals(pais.getCantFichas(), 1);
	}

	@Test
	public void testPonerFichas() {
		
		Pais pais = new Pais();
		
		pais.ponerFichas(4);
		
		Assert.assertEquals(pais.getCantFichas(), 5);
	}
	
	@Test
	public void testPonerYSacarFichas() {
		
		Pais pais = new Pais();
		
		pais.ponerFichas(4);
		pais.sacarFichas(3);
		
		Assert.assertEquals(pais.getCantFichas(), 2);
	}	
	
	@Test
	public void testPasarFichas() {
		
		Pais pais = new Pais();
		Pais pais2 = new Pais();
		
		pais.ponerFichas(4);
		
		pais.tranferir(pais2, 2);
		
		Assert.assertEquals(pais.getCantFichas(), 3);
		Assert.assertEquals(pais2.getCantFichas(), 3);
		
	}

	@Test
	public void testNoLimita() {
		
		Pais pais = new Pais();
		Pais pais2 = new Pais();
		
		Assert.assertFalse(pais.limita(pais2));
		
	}
	
	@Test
	public void testLimita() {
		
		Pais pais = new Pais();
		Pais pais2 = new Pais();
		pais.agregarLimite(pais2);
		
		Assert.assertTrue(pais.limita(pais2));
		Assert.assertTrue(pais2.limita(pais));
		
	}
}
