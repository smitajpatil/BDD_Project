package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GuruSteps {
	WebDriver d;
	
	@Given("User is in Demo guru99 applicatiom")
	public void user_is_in_demo_guru99_applicatiom() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
     	d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/newtours");
	    
	}

	@When("User enter Username and password")
	public void user_enter_username_and_password() {
		d.findElement(By.name("userName")).sendKeys("amit1");
		d.findElement(By.name("password")).sendKeys("amit1");
	   
	}

	@And("User click on submit button")
	public void user_click_on_submit_button() {
		d.findElement(By.name("submit")).click();
	}

	@Then("User is in login page")
	public void user_is_in_login_page() {
		String title=d.getTitle();
		System.out.println(title);
	 
	}
	
	@Given("User is in DemoGuru99 App")
	public void User_is_in_DemoGuru99_App() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
     	d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/newtours");
	    
	}

	@When("User is entering Username and password")
	public void User_is_entering_Username_and_password() {
		d.findElement(By.name("userName")).sendKeys("amit1");
		d.findElement(By.name("password")).sendKeys("amit1");
	   
	}

	@And("User click on login button")
	public void User_click_on_loginbutton() {
		d.findElement(By.name("submit")).click();
	}

	@Then("User is loggedIn")
	public void User_is_loggedIn() {
		String title=d.getTitle();
		System.out.println(title);
		System.out.println("User is entered in login page");
	
	}
}
