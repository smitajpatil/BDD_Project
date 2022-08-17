package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksFunSteps {
	 WebDriver d;
	    @Before 
	    public void browsersetup()
	    {
	        WebDriverManager.chromedriver().setup();
	        d=new ChromeDriver();
	        System.out.println("Before hooks");
	    }
	    @Given("First step procedure")
	    public void first_step_procedure() {
	   System.out.println("This is Given method");     
	    }
	 
	    @When("Second step procedure")
	    public void second_step_procedure() {
	     System.out.println("This is when method");
	    }
	 
	    @Then("Third step procedure")
	    public void third_step_procedure() {
	    System.out.println("This is then method");
	    }

	    @After
	    public void tearoutbrowser()
	    {
	        d.close();
	        System.out.println("After hooks");
	    }

}
