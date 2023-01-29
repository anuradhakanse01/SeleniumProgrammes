package Week6.Day1Assignment;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = { "src/test/java/features/CreateLead.feature", "src/test/java/features/EditLead.feature",
		"src/test/java/features/DeleteLead.feature",
		"src/test/java/features/DuplicateLead.feature" }, glue = "steps", monochrome = true, publish = true)
public class CucumberRunner extends BaseClass {

}
