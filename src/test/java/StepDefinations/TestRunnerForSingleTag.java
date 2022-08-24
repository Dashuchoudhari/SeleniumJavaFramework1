package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FolderWithTag\\Tags.feature",
glue={"StepDefinations"},monochrome=true, tags=("@Smoke or @regration")

)
public class TestRunnerForSingleTag {

}
