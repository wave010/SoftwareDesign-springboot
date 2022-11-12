//Command
public class LightOnCommand implements Command {
	light l;
	public LightOnCommand(light l) {
		this.l = l;
	}
	@Override
	public void execute() {
		l.on();		
	}
	@Override
	public void undo() {
		l.off();
	}

}
