package org.step;

import java.util.List;
import java.util.Map;

import org.element.LoginPage;
import org.helper.UtilClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage extends  UtilClass {
	
	@When("To user enter  {string} and  {string}")
	public void toUserEnterAnd(String user, String pass) {
		LoginPage l= new LoginPage();
		textpass(l.getUsername(), user);
		textpass(l.getPassword(), pass);
	}
	
	
	

//	@When("To user enter valid username and valid password")
//	public void toUserEnterValidUsernameAndValidPassword(io.cucumber.datatable.DataTable d) {
//		
//		List<String> l = d.asList();
//		String user = l.get(0);
//		
//		LoginPage lp= new LoginPage();
//		textpass(lp.getUsername(),user );
//		textpass(lp.getPassword(), "123");
//	}

	
	@When("To user enter valid product name")
	public void toUserEnterValidProductName(io.cucumber.datatable.DataTable d) throws InterruptedException {
		
		List<Map<String, String>> m = d.asMaps();
		Map<String, String> row = m.get(1);
		String product = row.get("iphone");
	    
		Thread.sleep(5000);
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(product);
	}

	@Then("To user Click search  button")
	public void toUserClickSearchButton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement searchBoxButton = driver.findElement(By.xpath("//input[@type='submit']"));
		searchBoxButton.click();
	}



}
