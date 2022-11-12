package main;

import Tree.*;
import decorations.*;

public class Treemain {
//id : 633020393-2 section: 2
	public static void main(String[] args) {
		Tree mytree = new BlueSpruce(); //create object tree
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		
		printtree(mytree); //call method printtree()
	}
	
	public static void printtree(Tree mytree) {
		System.out.printf("%s costs $%.2f",mytree.getDescription(), mytree.cost());
	}
}
