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

    @And("^Click on My Account Menus$")
    public void click_on_My_Account_Menus() throws Throwable {

        driver.findElement(By.linkText("My Account")).click();
    }



    //login with data table method using header - Map
    @When("^Enter registered username and passwords$")
    public void enter_registered_username_and_passwords(DataTable credentials) throws Throwable {
        List<Map<String,String>> data=credentials.asMaps(String.class,String.class);
        driver.findElement(By.id("username")).sendKeys(data.get(0).get("user"));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
    }

    @And("^Click on login buttons$")
    public void click_on_login_buttons() throws Throwable {
        driver.findElement(By.name("login")).click();
    }

    @Then("^User must successfully login to the web pages$")
    public void user_must_successfully_login_to_the_web_pages() throws Throwable {
        String capText = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong")).getText();
        Assert.assertEquals(true, capText.contains("lightyear9461"));
        driver.close();
    }

    @Then("^Very login$")
    public void very_login() throws Throwable {
        String capText=driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/ul/li/strong")).getText();
        if(capText.contains("ERROR")) // Test for invalid inputs
        {
            Assert.assertTrue("Invalid input - Error Page", true);

        }
        else
        {
            Assert.assertTrue(false);
        }

    }
}
