package com.bjs.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	//this is page object model program 3
ChromeDriver d;
By unXpath=By.xpath("//input[@name='username']");
By pwdxpath=By.xpath("//input[@name='password']");
By buttonXpath=By.xpath("//button[@type='submit']");

	public Login(ChromeDriver d)
	{
		this.d=d;
	}
	public void uname() 
	{
	d.findElement(unXpath).sendKeys("Admin");	
	}
	
	public void pwd()
	{
		d.findElement(pwdxpath).sendKeys("admin123");
	}
	
	public void subButton()
	{
		d.findElement(buttonXpath).click();
	}
	}
	
	


