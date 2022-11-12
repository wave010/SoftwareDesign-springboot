package decorations;

import Tree.Tree;

public class Balls_Silver extends DecorationDecorator{

	public Balls_Silver(Tree tree) {
		super(tree);
	}

	@Override
	public String getDescription() {
		return tree.getDescription()+ ", Balls Silver";
	}

	@Override
	public double cost() {
		return 3 + tree.cost();
	}

}
