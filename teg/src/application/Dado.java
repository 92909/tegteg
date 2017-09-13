package application;

import java.util.Random;

public final class Dado {
	
	private static int caras=6;
	private static Random ran=new Random();

	public static int tirar() {
		return ran.nextInt(caras)+1;
	}
	
	private Dado(){
	}

}
