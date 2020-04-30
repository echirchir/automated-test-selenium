package com.codingcamp;

import org.openqa.selenium.By;

public class PathPages {
	
	static String url = "http://www.pluralsight.com/paths";
	static String title = "Pluralsight | Paths";

	public void goTo() {	
		Browser.goTo(url);
	}

	public PathPage getPathPage(String page) {
		
		switch(page) {
		case "CREATIVE":
			return Pages.createPathPage();
		}
		return null;
	}
	
	public boolean isAt() {
		
		return Browser.title().equals(title);
	}

}
