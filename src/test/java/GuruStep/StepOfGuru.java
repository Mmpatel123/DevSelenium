package GuruStep;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class StepOfGuru {
    public WebDriver driver=null;
    @Given("^I go to Website OK...$")
    public void i_go_to_google_chrome() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        throw new io.cucumber.java.PendingException();
    }

    @When("^I enter the URLSSSS \"([^\"]*)\"$")
    public void i_enter_the_ulr(String GuruUrl) {
        // Write code here that turns the phrase above into concrete actions
    driver.get(GuruUrl);
        throw new io.cucumber.java.PendingException();
    }

    @When("Enter registered name and passwords")
    public void enter_registered_name_and_passwords(DataTable credentials) {
        // Write code here that turns the phrase above into concrete actions
        List<Map<String,String>> data=credentials.asMaps(String.class,String.class);
        driver.findElement(By.id("email")).sendKeys(data.get(0).get("user"));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
        throw new io.cucumber.java.PendingException();
    }

    @When("User must successfully login to the Web server")
    public void user_must_successfully_login_to_the_web_server() {
        driver.findElement(By.name("SubmitLogin")).click();
String CaptureText = driver.findElement(By.xpath("/html/body/div[4]/div/div/h3")).getText();
        Assert.assertEquals(true,CaptureText.contains("Successfully Logged in..."));
        throw new io.cucumber.java.PendingException();
    }

    @Then("I close My browser")
    public void i_close_my_browser() {
       driver.close();
        throw new io.cucumber.java.PendingException();
    }



}
