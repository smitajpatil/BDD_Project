package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefination {
	WebDriver d;
	@Given("User is in front of ATM machine")
	public void user_is_in_front_of_atm_machine() {
		System.out.println("I am in 1st method");
		WebDriverManager.chromedriver().setup();
		d.manage().window().maximize();
		d=new ChromeDriver();		
					    
	}

	@When("User put ATM card in machine")
	public void user_put_atm_card_in_machine() {
		System.out.println("I am in 2nd method");
		d.get("https://www.amazon.in");
	   
	}

	@And("User entered password")
	public void user_entered_password() throws IOException {
		System.out.println("I am in 3rd method");
		File source=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\smita.patil\\Desktop\\My data\\screen2.jpg");
		FileHandler.copy(source, destination);
	}

	@Then("User is successfully collecting cash")
	public void user_is_successfully_collecting_cash() {
		System.out.println("I am in 4th method");
		d.close();
	}

}
