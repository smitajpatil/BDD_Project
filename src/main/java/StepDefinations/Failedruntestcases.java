package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"@target/failedrerun.txt"},
        glue= {"StepDefinations"},
        
        
        monochrome=true,

        plugin={"pretty", "rerun:target/failedrerun.txt"} 
        )
public class Failedruntestcases {

}
