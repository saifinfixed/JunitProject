package com.base;

//import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QaBaseClass {
	public FirefoxDriver driver = new FirefoxDriver();
	@Before
	public void pageOpen(){
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://104.131.39.225/form/view.php?id=11556");
	}
	
	@After
	public void pageClose(){
		driver.close();
	}

}
