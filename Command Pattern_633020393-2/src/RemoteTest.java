//Client
public class RemoteTest {

	public static void main(String[] args) {
		//ID : 633020393-2
		SimpleRemote remote = new SimpleRemote();
		light l = new light();
		LightOnCommand lon = new LightOnCommand(l);
		LightOffCommand loff = new LightOffCommand(l);
		
		remote.setOnCommand(lon);
		remote.setOffCommand(loff);
		
		remote.buttonOnWasPressed();
		remote.buttonOffWasPressed();
		
		remote.buttonUndoWasPressed();

	}

}
