package decorations;

import Tree.Tree;

public class LEDs extends DecorationDecorator{

	public LEDs(Tree tree) {
		super(tree);
	}

	@Override
	public String getDescription() {
		return tree.getDescription();
	}

	@Override
	public double cost() {
		return 10 + tree.cost();
	}

}
