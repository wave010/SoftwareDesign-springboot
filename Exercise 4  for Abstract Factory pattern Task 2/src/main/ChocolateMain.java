package main;

import Factory.ChocolateFactory;

public class ChocolateMain {

	public static void main(String[] args) {
		//Get instance of Singleton class
		ChocolateFactory cho1 = ChocolateFactory.getInstance();
		ChocolateFactory cho2 = ChocolateFactory.getInstance();
		ChocolateFactory cho3 = ChocolateFactory.getInstance();
		
		cho1.setChoco("Wonka Bar");
		cho1.showChocolate();
		System.out.println("");
		
		
		cho2.setChoco("Wonka Bar");
		cho2.showChocolate();
		System.out.println("");
		
		
		cho3.setChoco("Omphalomancy Bar");
		cho3.showChocolate();
		System.out.println("");
	}

}
