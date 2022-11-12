package decorations;

import Tree.*;

public abstract class DecorationDecorator extends Tree{
	//field name tree
	protected Tree tree; //object tree
	
	//constructor
	public  DecorationDecorator(Tree tree) {
		this.tree = tree;
	}
	//method 
	public abstract String getDescription();
}