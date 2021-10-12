package org.computer;

public  class Desktop implements HardWare,SoftWare {
	
	private void desktopModel() {
System.out.println("Lenovo Desktop");
	}
	
	@Override
	public void softwareResources() {
		System.out.println("Linux Debian");
	}

	@Override
	public void hardwareResources() {
		System.out.println("AMD RADEON ChipSet");
		
	}
	
public static void main(String[] args) {
		
		Desktop d = new Desktop();
		d.hardwareResources();
		d.softwareResources();
		d.desktopModel();
	}



}
