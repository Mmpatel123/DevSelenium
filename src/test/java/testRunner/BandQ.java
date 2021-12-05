package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Letsgo",
        glue = "AddToCartSteps",
        dryRun = false)
public class BandQ {
}
