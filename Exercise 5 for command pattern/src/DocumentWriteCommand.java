//implements command interface
public class DocumentWriteCommand implements Command {
	
	private Document editableDoc;
    private String text;
    
    public DocumentWriteCommand(Document doc, String text)
    {
        this.editableDoc = doc;
        this.text = text;
        editableDoc.Write(text);
    }
	@Override
	public void undo() {
	}
	@Override
	public void redo() {
	}
	public String toString(){
		return text;
	}
}
