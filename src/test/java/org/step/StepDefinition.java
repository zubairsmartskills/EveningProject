package org.step;

import org.element.LoginPage;
import org.helper.UtilClass;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition  extends UtilClass{
	
	@Given("To user launch edge browser and pass valid url")
	public void to_user_launch_edge_browser_and_pass_valid_url() {
	    	edgeBrowser();
	    	//passUrl("https://www.facebook.com/");
	    	
	    	passUrl("https://www.amazon.in/");
	}
	
	
//	@When("To user enter valid username and valid password")
//	public void toUserEnterValidUsernameAndValidPassword() {
//		LoginPage l= new LoginPage();
//		textpass(l.getUsername(), "demo");
//		textpass(l.getPassword(), "123");
//	}

	@Then("To user Click login  button")
	public void toUserClickLoginButton() {
		LoginPage l= new LoginPage();
		
		elementClick(l.getLoginBtn());
	}


	@When("To user enter invalid username and invalid password")
	public void toUserEnterInvalidUsernameAndInvalidPassword() {
		LoginPage l= new LoginPage();
		textpass(l.getUsername(), "dummy");
		Assert.assertTrue("To check", false);
		textpass(l.getPassword(), "dummy123");
	}

	@Then("To user quit edge browser")
	public void toUserQuitEdgeBrowser() {
		
	}
	
	@Given("To user launch browser and pass url")
	public void toUserLaunchBrowserAndPassUrl() {
		driver= new ChromeDriver();
		passUrl("https://www.facebook.com/");
	}
	
	
	@When("To user enter valid username and valid password")
	public void toUserEnterValidUsernameAndValidPassword() {
		LoginPage l= new LoginPage();
		textpass(l.getUsername(), "raj");
		textpass(l.getPassword(), "raj123");
	}

	
}
