//Command
public class LightOffCommand implements Command{
	light l;
	public LightOffCommand(light l) {
		this.l = l;
	}
	@Override
	public void execute() {
		l.off();
	}
	@Override
	public void undo() {
		l.on();
	}
}
