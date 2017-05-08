package teg;

import org.junit.Assert;
import org.junit.Test;

public class DadoTest {

	@Test
	public void testLimite() {
		Assert.assertTrue(new Dado().tirar() < 7 && new Dado().tirar() > 0);
	}
}
