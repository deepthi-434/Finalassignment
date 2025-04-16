package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//src//test//resources//features//Conduit.feature",
		glue = {"stepDefs"},
		monochrome = true,
		plugin = {"pretty","html:target/Reports/HtmlReport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
		
public class conduitrunner {

}
