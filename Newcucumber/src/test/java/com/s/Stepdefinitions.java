package com.s;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions {

	WebDriver driver;//global variable declare
	
	
	@Given("user enter the google .com")
	public void user_enter_the_google_com() {
		System.out.println("passed");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");

		driver=new ChromeDriver(options);
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");

	   
	}

	@When("user clicks the search box")
	public void user_clicks_the_search_box() throws InterruptedException {
		System.out.println("twopassed");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.findElement(By.id("male")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]")).click();
        Thread.sleep(3000);
       driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@class='custom-file']")).click();
	   
	}

	@When("type the search term as football")
	public void type_the_search_term_as_football() throws InterruptedException {
		System.out.println("threepassed");
		WebElement down=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Thread.sleep(3000);
		
		Select sec=new Select(down);
		sec.selectByVisibleText("Norway");
		Thread.sleep(3000);
		sec.selectByVisibleText("Spain");
		Thread.sleep(3000);
		sec.selectByVisibleText("Greece");
		Thread.sleep(3000);
		sec.selectByVisibleText("Turkey");
		Thread.sleep(3000);
		sec.selectByVisibleText("Sweden");
		Thread.sleep(3000);
		sec.selectByValue("1");
		Thread.sleep(3000);
		sec.selectByValue("1");
		Thread.sleep(3000);
		sec.selectByValue("2");
		Thread.sleep(3000);
		sec.selectByValue("3");
		Thread.sleep(3000);
		sec.selectByValue("4");
		Thread.sleep(3000);
		sec.selectByValue("5");
		Thread.sleep(3000);
		sec.selectByValue("6");
		Thread.sleep(3000);
		sec.selectByValue("7");
		Thread.sleep(3000);
		sec.selectByValue("8");
		Thread.sleep(3000);
		sec.selectByValue("9");
	    
	}
	
	
	@Then("uer should see the search result for football")
	public void uer_should_see_the_search_result_for_football() throws InterruptedException {
		System.out.println("fourpassed");
		Thread.sleep(3000);
		driver.quit();
	    
	}

}

