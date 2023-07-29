package com.p;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/features",
		glue={"com.s","com.h"},
		dryRun=false,
		monochrome=true,
						
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				//"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
				
				
				"html:target/cucumber-reports/report.html",
				
				"json:target/cucumber-reports/report.json",
				
				"junit:target/cucumber-reports/report.xml"}
		
		         
		
		
		)
		
		
		
	
				
		
		
				
		
		
		
		
		




public class Runnerclass {

}
