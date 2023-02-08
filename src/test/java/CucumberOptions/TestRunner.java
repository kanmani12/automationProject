package CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/chat.feature",
			glue="stepDefinition",stepNotifications=true
		
		)
public class TestRunner {
	

}
