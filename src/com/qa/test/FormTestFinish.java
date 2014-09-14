package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.base.QaBaseClass;

public class FormTestFinish extends QaBaseClass {
	@Test
	public void formTestFinesh(){
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		
		// First name
		driver.findElement(By.id("element_1_1")).sendKeys("Saiful");
		
		//Last name
		driver.findElement(By.id("element_1_2")).sendKeys("Azam");
		
		//Phone number
		driver.findElement(By.id("element_2_1")).sendKeys("347");
		driver.findElement(By.id("element_2_2")).sendKeys("449");
		driver.findElement(By.id("element_2_3")).sendKeys("8087");
		
		//Email
		driver.findElement(By.id("element_3")).sendKeys("saif0909@gmail.com");
		
		//Occasion
		driver.findElement(By.id("element_4")).sendKeys("I don't know");
		
		//Date
		driver.findElement(By.id("element_5_1")).sendKeys("9");
		driver.findElement(By.id("element_5_2")).sendKeys("14");
		driver.findElement(By.id("element_5_3")).sendKeys("2014");
		
		//Location 
		// Street Address 
		driver.findElement(By.id("element_6_1")).sendKeys("Wood Rd");
		
		//City
		driver.findElement(By.id("element_6_3")).sendKeys("Bronx");
		
		//Select state
		new Select(driver.findElement(By.id("element_6_4"))).selectByValue("New York");
		//driver.findElement(By.id("element_6_4")).sendKeys("New York");
		
		//Zipcode
		driver.findElement(By.id("element_6_5")).sendKeys("10462");
		
		//Select country 
		//driver.findElement(By.id("element_6_6")).sendKeys("Bangladesh");
		//new Select(driver.findElement(By.id("element_6_6"))).selectByValue("Bangladesh");
		
		// Select Dj
		driver.findElement(By.id("element_7_1")).click();
		
		// Comment Box
		driver.findElement(By.id("element_8")).sendKeys("This is the Test Booking");
		
		//Fnish
		driver.findElement(By.id("submit_form")).click();
	}

}
