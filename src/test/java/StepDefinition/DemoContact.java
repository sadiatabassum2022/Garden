package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoContact {
	WebDriver driver;
	
	@Given("^Launch Application Url$")
	public void launch_Application_Url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		 driver = new ChromeDriver ();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);   
	}

	@Then("^Click on Contact$")
	public void click_on_Contact() throws Throwable {
	 WebElement cont = driver.findElement(By.linkText("Contact"));  
	 cont.click();
	}

	@When("^Enter Contact Email$")
	public void enter_Contact_Email() throws Throwable {
	 WebElement email = driver.findElement(By.id("recipient-email")) ;
	 email.sendKeys("sadia@gmail.com");
	}

	@Then("^Enter Contact Name$")
	public void enter_Contact_Name() throws Throwable {
		WebElement name = driver.findElement(By.id("recipient-name")) ;
		 name.sendKeys("taba");
	}

	@Then("^Type message$")
	public void type_message() throws Throwable {
		WebElement message = driver.findElement(By.id("message-text")) ;
		 message.sendKeys("i want to buy an iphone");
	}

	@Then("^Click on Send Message$")
	public void click_on_Send_Message() throws Throwable {
		WebElement click = driver.findElement(By.xpath("//button[text()= 'Send message']"));  
		 click.click(); 
		 
		 driver.switchTo().alert().accept();
		 Thread.sleep(3000);
		 driver.close();
	}
}
