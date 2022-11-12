package main;

import Breakfast.*;
import Template.BreakfastTemplate;

public class BreakfastMain {

	public static void main(String[] args) {
		BreakfastTemplate B1 = new Omelette();
		B1.setsalt("yes");
		B1.cooking(); //using template method
		
		System.out.println("************");
		
		BreakfastTemplate B2 = new ScrambledEggs();
		B2.setpepper("yes");
		B2.setsalt("yes");
		B2.cooking(); //using template method
	}

}
