package com.codingcamp;

import org.openqa.selenium.support.PageFactory;

public class Pages {

	public static HomePage homePage() {
		
		return new HomePage();
	}

	public static PathPages pathPages() {
		
		PathPages pathPages = new PathPages();
		
		return pathPages;
	}

	public static PathPage createPathPage() {
		PathPage creativePathPage = new JavaPathPage();
		PageFactory.initElements(Browser.driver, creativePathPage);
		return creativePathPage;
		
	}

}
