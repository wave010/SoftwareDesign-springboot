package decorations;

import Tree.Tree;

public class Balls_Blue extends DecorationDecorator{

	public Balls_Blue(Tree tree) {
		super(tree);
	}

	@Override
	public String getDescription() {
		return tree.getDescription()+ ", Balls Blue";
	}

	@Override
	public double cost() {
		return 2 + tree.cost();
	}
	
}
