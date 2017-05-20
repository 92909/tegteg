package application;

import java.util.Random;

public class Dado {
	static int[] cara={1,2,3,4,5,6};

	public static int tirar() {
		Random ran=new Random();
		return cara[ran.nextInt(cara.length)];
		
		
	}

}
