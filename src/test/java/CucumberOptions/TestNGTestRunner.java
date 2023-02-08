package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features/Login.feature",
		glue="stepDefinition",tags="@SmokeTest"
		
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests  {

}
