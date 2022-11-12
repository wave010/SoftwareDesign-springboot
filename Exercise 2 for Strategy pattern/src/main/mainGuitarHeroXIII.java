package main;

import guitars.*;
import characters.*;
import act.*;

public class mainGuitarHeroXIII {

	public static void main(String[] args) {
		//player 1
		GuitarHeroXIII player1 = new GuitarHeroXIII(new Slash(),new Fender(), new Smash());
		System.out.println(player1.play());
		player1.change();
		System.out.println(" ");
		
		//player 2
		GuitarHeroXIII  player2 = new GuitarHeroXIII(new Slash(),new Fender(), new Jump());
		System.out.println(player2.play());
		player2.change();
		System.out.println(player2.play());
	}

}
