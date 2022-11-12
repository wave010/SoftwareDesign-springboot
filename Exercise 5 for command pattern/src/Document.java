public class Document {
	 public String message;
	 
	 public void Write(String msg) {
		 this.message = msg;
	 }
	 public String Read() {
		 return message;
	 }
}
