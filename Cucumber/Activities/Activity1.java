package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/Features",
        glue={"stepDefinition"},
        tags = "@Activity1"
)

public class Activity1 {
    //empty
}