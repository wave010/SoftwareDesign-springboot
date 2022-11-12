package decorations;

import Tree.Tree;

public class Ruffles extends DecorationDecorator{

	public Ruffles(Tree tree) {
		super(tree);
	}

	@Override
	public String getDescription() {
		return tree.getDescription()+ ", Ruffles";
	}

	@Override
	public double cost() {
		return 1 + tree.cost();
	}

}
