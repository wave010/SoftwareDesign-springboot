package decorations;

import Tree.Tree;

public class Balls_Red extends DecorationDecorator{

	public Balls_Red(Tree tree) {
		super(tree);
	}

	@Override
	public String getDescription() {
		return tree.getDescription()+ ", Balls Red";
	}

	@Override
	public double cost() {
		return 1 + tree.cost();
	}
}
