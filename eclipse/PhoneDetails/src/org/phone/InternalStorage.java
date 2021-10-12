package org.phone;

public class InternalStorage {

	private void processorName() {
	System.out.println("Phone's Processor Name is Mediatek");
	}
	private void ramSize() {
	System.out.println("Phone's RAM Size is 6gb Ram");
	}
	public static void main(String[] args) {
		ExternalStorage external = new ExternalStorage();
		external.size();
		InternalStorage internal = new InternalStorage();
		internal.processorName();
		internal.ramSize();
	}
}
