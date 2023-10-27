package com.bjs.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bjs.dev.Home;
import com.bjs.dev.Login;



public class OrangehrmTest {
	
//this is page object model program 1
	//there are 3 files in this login.java home.java orangehrm.java(main)
	@Test
	public void random() {
		// TODO Auto-generated method stub
		
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login l=new Login(d);
		l.uname();
		l.pwd();
		l.subButton();
		Home h=new Home(d);
		h.clickInc();
		
		System.out.println("2nd");

	}

}
