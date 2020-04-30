package com.codingcamp;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

	@Test
	public void canGoToHomePage() {
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().isAt());
	}
	
	@Test
	public void canGoToPathsPage() {
		Pages.pathPages().goTo();
		PathPage pathPage = Pages.pathPages().getPathPage("CREATIVE");
		pathPage.goTo();
		Assert.assertTrue(pathPage.isAtPathPage("CREATIVE"));
	}
	
	@AfterClass
	public static void close() {
		Browser.close();
	}

}
