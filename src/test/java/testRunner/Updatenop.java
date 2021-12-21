package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="ConfirmingCheckoutFeature",
        glue= "UpdateNopCommernce",

        dryRun=false,
        monochrome=true


)
public class Updatenop {


}
