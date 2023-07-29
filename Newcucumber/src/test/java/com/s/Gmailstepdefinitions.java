package com.s;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gmailstepdefinitions {

	WebDriver driver;





	@Given("user enter the gmail.com")
	public void user_enter_the_gmail_com() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");



		driver=new ChromeDriver(options);

		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	@When("user enter the correct user name and valid password")
	public void user_enter_the_correct_user_name_and_valid_password() {
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("selva32140@gmail.com");
		String nnn=email.getText();
		System.out.println(nnn);
		WebElement next=driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		next.click();
	}


	@When("click the login button")
	public void click_the_login_button() {

	}

	@Then("user should see the gmail home page")
	public void user_should_see_the_gmail_home_page() {

	}

}
