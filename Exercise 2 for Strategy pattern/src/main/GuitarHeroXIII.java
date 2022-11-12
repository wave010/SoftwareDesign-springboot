package main;

import act.*;
import characters.*;
import guitars.*;

//Create Context 
public class GuitarHeroXIII {
	private ActStrategy act;
	private GuitarStrategy guitar;
	private CharacterStrategy charac;
	
	//Constructor
	public GuitarHeroXIII(CharacterStrategy charac,GuitarStrategy guitar,ActStrategy act) {
		this.act = act;
		this.charac = charac;
		this.guitar = guitar;
	}
	//play
	public String play() {
		return "Player : "+charac.Character()+", Play Guitar : "+guitar.Guitar()+", Act : "+act.Act();
	}
	//change guitars
	public void change() {
		//check act to change
		if(play().contains("Jump off stage")) {
			act = new Fire();
			System.out.println("Change Act");
		}
		else {
			System.out.println("Can not to change of the fire");
		}
	}
}
