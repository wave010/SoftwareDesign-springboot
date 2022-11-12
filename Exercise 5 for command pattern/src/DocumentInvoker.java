import java.util.ArrayList;
import java.util.List;
//invoker class
public class DocumentInvoker {
	private Document doc;
	private Command cmd;
	private List<Command> undoStack;
	
	public DocumentInvoker(String text) {
		System.out.println("---- Contents of: "+ text +" ----");
		undoStack = new ArrayList<>();
	}
	public void Write(String msg) {
		doc = new Document();
		doc.Write(msg);
		cmd = new DocumentWriteCommand(doc,msg);
		undoStack.add(cmd);
	}
	
	public void Undo(int n) {
		undoStack.remove(n);
	}
	
	public String Read() {
		String text = "";
		for(int i=0;i<undoStack.size();i++) {
			text = text+i +":"+ undoStack.get(i)+"\n"; 
		}
		return text;
	}
}
