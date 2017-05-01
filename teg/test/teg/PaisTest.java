package teg;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PaisTest {

	@Test
	public void testPonerFichas() {
		
		Pais pais = new Pais();
		
		pais.ponerFichas(4);
		
		Assert.assertEquals(pais.getCantFichas(), 4);
	}

}
