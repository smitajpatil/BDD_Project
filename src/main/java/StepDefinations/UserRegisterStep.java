package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegisterStep {
	WebDriver d;
	@Given("User is in Register page")
	public void user_is_in_register_page() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/newtours/register.php");
	    
	}

	@When("User enter all fields")
	public void user_enter_all_fields() {
	    d.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Smita");
	    d.findElement(By.name("lastName")).sendKeys("P");
	    d.findElement(By.name("phone")).sendKeys("123456789");
	    d.findElement(By.xpath("//input[@name='userName']")).sendKeys("s@mail.com");
	    d.findElement(By.xpath("//input[@name='address1']")).sendKeys("XYZ");
	    d.findElement(By.xpath("//input[@name='city']")).sendKeys("abc");
	    d.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
	    d.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("1234500");
	    d.findElement(By.xpath("//select[@name='country']")).click();
	    Select s = new Select(d.findElement(By.name("country")));
	    s.selectByVisibleText("INDIA");
	    d.findElement(By.xpath("//input[@id='email']")).sendKeys("Smita");
	    d.findElement(By.xpath("//input[@name='password']")).sendKeys("Smita1");
	    d.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Smita1");
	    
	}

	@And("User submitting details")
	public void user_submitting_details() {
	    d.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("User is registered")
	public void user_is_registered() {
		WebElement e=d.findElement(By.xpath("//b[text()=' Note: Your user name is Smita.']"));
		System.out.println(e.getText());
	    
	}

	@Given("User login with register details")
	public void user_login_with_register_details() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
     	d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/newtours");
	   
	}

	@When("User entering new uname and pwd")
	public void user_entering_new_uname_and_pwd() {
	    d.findElement(By.xpath("//input[@name='userName']")).sendKeys("Smita");
	    d.findElement(By.xpath("//input[@name='password']")).sendKeys("Smita1");
	   d.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@And("User logging In")
	public void user_logging_in() {
	    WebElement e2=d.findElement(By.xpath("//h3[text()='Login Successfully']"));
	    System.out.println(e2.getText());
	}

	@Then("New user is in logIn")
	public void new_user_is_in_log_in() {
	   
	    System.out.println("New User is Logged In");
	}

}
