package com.codingcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JavaPathPage extends PathPage {

	@FindBy(how = How.CSS, using = "#content > div > div:nth-child(1) > div > div > div > div > div > div > div > div > div > div > div > ul > li.active > a")
	WebElement webElement;
	
	@Override
	public void goTo() {
		Browser.driver.findElement(By.linkText("CREATIVE")).click();
	}

	@Override
	public String pathName() {
		return webElement.getText();
	}
	
	

}
