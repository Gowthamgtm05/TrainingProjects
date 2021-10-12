package org.lang;

public class StateDetails {

	private void southIndia() {
	System.out.println("Employee 1 State is South India");
	}
	private void northIndia() {
	System.out.println("Employee 2 State is North India");
	}
	
	public static void main(String[] args) {
		StateDetails kk = new StateDetails();
		LanguageInfo ll = new LanguageInfo();
		kk.southIndia();
		kk.northIndia();
		ll.tamilLanguage();
		ll.englishLanguage();
		ll.hindiLanguage();
	}
}
