package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\Features\\Hooksfun.feature",
		glue= {"StepDefinations"},
		//tags= ("@Regression,@Smoke"),
		monochrome = true,
		//plugin= {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },//this is extent report
	plugin= {"pretty","html:target/cucumber-report/cucumber-html-report.html"} //this is html report
		//plugin= {"pretty","junit:target/cucumber-report/cucumber.xml"} //this is junit report
				//plugin= {"pretty","json:target/cucumber-report/cucumber.json"} //this is json report
				//plugin={"pretty", "rerun:target/failedrerun.txt"}
		)

public class Testrunner {

}
