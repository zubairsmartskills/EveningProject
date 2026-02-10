package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\featurefile",
				glue = "org.step",snippets = SnippetType.CAMELCASE,
				monochrome = true,dryRun =false ,strict = true,tags= {"@amazon or @smoke"},
				plugin = {"pretty",
						"html:src\\test\\resources\\reports\\html",
						"json:src\\test\\resources\\reports\\json\\amaz.json",
						"junit:src\\test\\resources\\reports\\junit\\amaz.xml",
						"rerun:src\\test\\resources\\rerun\\project.txt"}			
)

public class TestRunner {
		@AfterClass
		public static void report() {
				GenerateReport.jvmReport("src\\test\\resources\\reports\\json\\amaz.json");
		}
}
