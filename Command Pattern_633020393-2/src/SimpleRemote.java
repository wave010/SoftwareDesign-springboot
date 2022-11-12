//Invoker
public class SimpleRemote {
	Command onButton;
	Command offButton;
	Command undoCommand;
	
	public SimpleRemote() {}
	
	public void setOnCommand(Command command) {
		onButton = command;
	}
	public void setOffCommand(Command command) {
		offButton = command;
	}
	public void buttonOnWasPressed() {
		onButton.execute();
		undoCommand = onButton;
	}
	public void buttonOffWasPressed() {
		offButton.execute();
		undoCommand = offButton;
	}
	public void buttonUndoWasPressed() {
		undoCommand.undo();
	}
}
