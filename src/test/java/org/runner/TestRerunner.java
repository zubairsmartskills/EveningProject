package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\resources\\rerun\\project.txt",
				glue = "org.step",plugin = {
						"json:src\\test\\resources\\reports\\json\\amaz1.json",
						"rerun:src\\test\\resources\\rerun\\project.txt"})		

public class TestRerunner {
			
	@AfterClass
	public static void report() {
			GenerateReport.jvmReport("src\\test\\resources\\reports\\json\\amaz1.json");
	}
}
