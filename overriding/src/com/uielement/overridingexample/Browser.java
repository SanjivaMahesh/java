package com.uielement.overridingexample;

import java.util.Random;

public class Browser {
	UIElement getElement(String url){
		Random r=new Random();
		int n=r.nextInt(4)+1;
		switch (n) {
		case 1:
			return new CheckBox();
		case 2:
			return new RadioButton();
		case 3:
			return new TextBox();
			

		default:
		return new Button();
		}
			
		
		
	}

}
