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
  /*  git branch -M main
git remote add origin https://github.com/falguni001/javaPractice.git
git push -u origin main
git config --global user.email "sweetmegs2604@gmail.com"
git config --global user.name "Mmpatel123"
     git remote add origin https://github.com/DevPatel12345/JavaSeleniumBddPractice.git*/
    /*
    git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/DevPatel12345/JavaSeleniumBddPractice.git
git push -u origin main
     */
}
