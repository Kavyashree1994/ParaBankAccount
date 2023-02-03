package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:/Users/hp/eclipse-workspace/paraBankProject/src/test/resources/Features/ParaBank-Login.feature",
		"C:/Users/hp/eclipse-workspace/paraBankProject/src/test/resources/Features/openNewAccount.feature",
		"C:/Users/hp/eclipse-workspace/paraBankProject/src/test/resources/Features/accountOverview.feature"},
glue= {"stepDefinations"},
dryRun=false,
monochrome = true,
plugin = {"pretty", "html:target/cucumber-reports/report2.json"}
//plugin = {"pretty", "html:target/cucumber-reports/report.html"}
)
public class testRunner {
	
	

}
