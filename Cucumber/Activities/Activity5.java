package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class Activity5 {

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "Features",
            glue = {"stepDefinitions"},
            tags = "@Activity5"
    )

    public class Activity5 {}
}
