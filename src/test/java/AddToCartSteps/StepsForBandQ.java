package AddToCartSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsForBandQ {
public WebDriver driver=null;
    @Given("^Open the browsers$")
    public void open_the_browsers() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @When("^Enter the URLSS \"([^\"]*)\"$")
    public void enter_the_URLSS(String arg1) throws Throwable {
        driver.get(arg1);
       // driver.findElement(By.xpath("/html/body/div[8]/div[1]/div/div[3]/a[1]")).click();


    }
    @And("^I click on Shop$")
    public void click_on_My_Account_Menu() throws Throwable {

        driver.findElement(By.linkText("Shop")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
    }

    @And("^I click on  Add to basket$")
    public void i_click_on_add_to_basket() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a[1]/img"));
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a[2]")).click();
       Thread.sleep(1000L);
    }

    @And("^I click on checkout$")
    public void i_click_on_checkout() throws Throwable {
       driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a[3]")).click();
   }
    @And("^I order is placed successfully$")
    public void i_Order_is_place_susscefuully() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
    }
    @And("I add my billing detail")
    public void i_Orr_is_place_susscefuully() throws Throwable {
        driver.findElement(By.id("billing_first_name")).sendKeys("my name");
        driver.findElement(By.id("billing_last_name")).sendKeys("my last name");
        driver.findElement(By.id("billing_company")).sendKeys("my company name");
        driver.findElement(By.id("billing_email")).sendKeys("my email");
        driver.findElement(By.id("billing_phone")).sendKeys("my phone number");
        driver.findElement(By.id("billing_address_1")).sendKeys("my billing address");
 driver.findElement(By.id("billing_city")).sendKeys("my city");
        driver.findElement(By.id("billing_state")).sendKeys("my state");
        driver.findElement(By.id("billing_postcode")).sendKeys("my postcode");
        driver.findElement(By.id("createaccount")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"account_password\"]")).sendKeys("Avadh@#$2009.0");

    }
}





