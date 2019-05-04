package org.lang;

public class StateDetails {
	
public void northIndian() {
	System.out.println("NorthIndian");
		
	}
	public void southIndian() {
		System.out.println("SouthIndian");
		
	}

public static void main(String[] args) {
		StateDetails x= new StateDetails();
		x.northIndian();
		x.southIndian();
		LanguageInfo y =new LanguageInfo();
		y.tamilLanguage();
		y.englishLanguage();
		y.hindiLanguage();
	}

}
