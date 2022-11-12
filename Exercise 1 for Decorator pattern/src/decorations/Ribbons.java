package decorations;

import Tree.Tree;

public class Ribbons extends DecorationDecorator {

	public Ribbons(Tree tree) {
		super(tree);
	}

	@Override
	public String getDescription() {
		return tree.getDescription()+ ", Ribbons";
	}

	@Override
	public double cost() {
		return 2 + tree.cost();
	}

}
