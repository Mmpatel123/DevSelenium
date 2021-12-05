package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "PavanKumarWebsiteTest",
        glue = "NopCommerceStep",
        dryRun = false





)
public class NopComerceTestRunner {

}
