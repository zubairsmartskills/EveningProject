package org.step;

import org.helper.UtilClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks extends UtilClass {
	

	
	
	

	@After(order=4)
	public void aft1() {
		System.out.println("After-2");
	}
	
	@After(order=1)
	public void aft2() {
		System.out.println("After-3");
	}
	
	@After(order=5)
	public void aft3(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot t= (TakesScreenshot)driver;
			byte[] b = t.getScreenshotAs(OutputType.BYTES);
			//     src
			s.embed(b, "image/png");
		}
		
		
	}
	
	

}
