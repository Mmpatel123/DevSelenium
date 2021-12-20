package UpdateNop;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;


public class UpdateNopComernce {
    public WebDriver driver=null;


    @Given("^Open the browsers$")
    public void open_the_browsers() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @And("^Enter the URLS \"([^\"]*)\"$")
    public void enter_the_URLS(String url) throws Throwable {
        driver.get(url);
    }

@And("^Click on register$")
public void Accept_all_cookies() throws Throwable {
    driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();



}


    //login with data table method using header - Map
    @When("^Enter registered username and passwords$")
    public void enter_registered_username_and_passwords(DataTable credentials) throws Throwable {
        List<Map<String,String>> data=credentials.asMaps(String.class,String.class);
        driver.findElement(By.id("Email")).sendKeys(data.get(0).get("user"));
        driver.findElement(By.id("Password")).sendKeys(data.get(0).get("password"));

    }

    @And("^Click on login buttons$")
    public void click_on_login_buttons() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }

    @Then("^User must successfully login to the web pages$")
    public void user_must_successfully_login_to_the_web_pages() throws Throwable {
   driver.getTitle();

    }


@And("^I will click on electronics website$")
    public void i_cell_click_on_my_browser(){
        driver.findElement(By.linkText("Electronics")).click();

}

@And("^will click on cell billing_phone$")
    public void i_cell_click_on_my_phone() throws Throwable {
        driver.findElement(By.linkText("Cell phones")).click();
        driver.findElement(By.linkText("HTC One Mini Blue")).click();
}
    @Then("^I will pick a choice of my desired phone$")
    public void i_will_pick_a_choice_of_my_desired_phone() {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(B)
        driver.findElement(By.id("add-to-cart-button-19")).click();
        throw new io.cucumber.java.PendingException();
    }
    }

