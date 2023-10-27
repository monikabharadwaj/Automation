package com.bjs.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
//this is page object model program 2
	ChromeDriver d;
	By incXpath=By.xpath("//a[text()='OrangeHRM, Inc']");
	
	
	public Home(ChromeDriver d) {
		this.d=d;
	}
	
	public void clickInc()
	{
		d.findElement(incXpath).click();
	}
	
	
}
