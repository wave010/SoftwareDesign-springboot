package Main;

import Slots.*;
import Factory.*;

public class Slotmain {

	public static void main(String[] args) {
		//create object factory each city
		slotFactory nevada = new Nevada(); // Nevada 
		slotFactory new_jersey = new New_jersey(); // New jersey 
		slotFactory washington = new Washington(); // Washington
		
		//create slot in Nevada
		slots s1 = nevada.BuildSlots("Straight"); //create slot straight
		System.out.println("==== Nevada ==== slot : Straight");
		s1.display();
		System.out.println("");
		
		//create slot in New Jersey
		slots s2 = new_jersey.BuildSlots("Bonus"); // create slot Bonus
		System.out.println("==== New Jersey ==== slot : Bonus");
		s2.display();
		System.out.println("");
		
		//create slot in Washington
		slots s3 =  washington.BuildSlots("Progressive"); // create slot Progressive
		System.out.println("==== Washington ==== slot : Progressive");
		s3.display();
		System.out.println("");
	}
}
