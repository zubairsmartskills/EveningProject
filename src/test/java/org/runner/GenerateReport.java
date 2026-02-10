package org.runner;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReport {
	public static void jvmReport(String path) {
		//Step -1
		File f=new File("src\\test\\resources\\reports\\jvmreport");//New JVM File path
		//Step-2
		
		Configuration c= new Configuration(f, "AmaAndFb");
		c.addClassifications("windows", "10");
		
		//Step-3
		List<String>l= new LinkedList<>();// existing json path
		l.add(path);
		
		//step-4
		ReportBuilder r= new ReportBuilder(l, c);
		r.generateReports();
	}
	

}
