package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class GuruMultiSteps {
		WebDriver d;
		
		@Given("User is Demo")
		public void User_is_Demo() {
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();
	     	d.manage().window().maximize();
			d.get("https://demo.guru99.com/test/newtours");
		    
		}

		@When("User enter {string} and {string}")
		public void user_enter(String un, String pwd) {
			d.findElement(By.xpath("//input[@name='userName']")).sendKeys(un);
			d.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		   
		}
		
		@And("User clicking on submit")
		public void  User_clicking_on_submit() {
			d.findElement(By.name("submit")).click();
		}

		@Then("User is Logged into page")
		public void User_is_Logged_into_page() throws InterruptedException {
			Thread.sleep(1000);
			 String title=d.getTitle();
			 if(title.equals("Login: Mercury Tours"))
		      {
		      System.out.println("Logged in succcessfully");
		      }
		      else
		          System.out.println("Invalid login");
		    d.close();
		}

	}



