package Slots;

public class slots {
	private String cabinet;
	private String payment;
	private String display;
	private String gpu;
	private String os;
	
	//constructor
	public slots(String cabinet, String payment, String display, String gPU, String os) {
		this.cabinet = cabinet;
		this.payment = payment;
		this.display = display;
		this.gpu = gPU;
		this.os = os;
	}
	//print
	public void display() {
		System.out.println("cabinet : "+cabinet);
		System.out.println("Paymeny : "+payment);
		System.out.println("Display : "+display);
		System.out.println("GPU : "+gpu);
		System.out.println("OS: "+os);
	}
	
	//getter setter
	public String getCabinet() {
		return cabinet;
	}

	public void setCabinet(String cabinet) {
		this.cabinet = cabinet;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getGPU() {
		return gpu;
	}

	public void setGPU(String gPU) {
		this.gpu = gPU;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	
}
