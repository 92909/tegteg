package teg;

import org.junit.Assert;
import org.junit.Test;

public class DadoTest {

	@Test
	public void testLimite() {
		Assert.assertTrue(Dado.tirar() < 7 && Dado.tirar() > 0);
	}
}
