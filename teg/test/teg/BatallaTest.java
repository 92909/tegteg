package teg;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BatallaTest {

	@Test
	public void test1() {
		Batalla batalla = new Batalla(new int[] {2,3}, new int[] {1,5,3});
		Assert.assertEquals(batalla.batallar(), 1);
	}
	
	@Test
	public void test2() {
		Batalla batalla = new Batalla(new int[] {2,3,3}, new int[] {1,5,3});
		Assert.assertEquals(batalla.batallar(), 1);
	}

	@Test
	public void test3() {
		Batalla batalla = new Batalla(new int[] {2,3,4}, new int[] {1,3});
		Assert.assertEquals(batalla.batallar(), 2);
	}
	
}
