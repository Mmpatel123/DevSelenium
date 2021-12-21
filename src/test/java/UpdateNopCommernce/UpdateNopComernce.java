package UpdateNopCommernce;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
        Thread.sleep(1000L);
    driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();



}
    @When("^Enter registered username and passwords$")
    public void enter_registered_username_and_passwords(DataTable credentials) throws Throwable {
        List<Map<String,String>> data=credentials.asMaps(String.class,String.class);
        Thread.sleep(1000L);
        driver.findElement(By.id("Email")).sendKeys(data.get(0).get("user"));
        Thread.sleep(1000L);
        driver.findElement(By.id("Password")).sendKeys(data.get(0).get("password"));
    }

    @And("^Click on login buttons$")
    public void click_on_login_buttons() throws Throwable {
        Thread.sleep(1000L);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }

    @Then("^User must successfully login to the web pages$")
    public void user_must_successfully_login_to_the_web_pages() throws Throwable {
   driver.getTitle();

    }


@And("^I will click on electronics website$")
    public void i_cell_click_on_my_browser() throws InterruptedException {
        Thread.sleep(1000L);
        driver.findElement(By.linkText("Electronics")).click();

}

@And("^will click on cell billing_phone$")
    public void i_cell_click_on_my_phone() throws Throwable {
        Thread.sleep(1000L);
        driver.findElement(By.linkText("Cell phones")).click();
        driver.findElement(By.linkText("HTC One Mini Blue")).click();
}
    @Then("^I will pick a choice of my desired phone$")
    public void i_will_pick_a_choice_of_my_desired_phone() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(B)
        Thread.sleep(1000L);
        driver.findElement(By.id("add-to-cart-button-19")).click();

        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
         driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]"));



        WebElement staticDropdown =driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]"));
         Select dropdown=new Select(staticDropdown);
dropdown.selectByVisibleText("New Address");
driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]")).sendKeys("dev");
driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_LastName\"]")).sendKeys("patel");
driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]")).sendKeys("lightyear961@gmail.com");
       WebElement staticDropdowns =driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select dropdowns=new Select(staticDropdowns);

        dropdowns.selectByVisibleText("Cuba");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Watford");
      driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("Manchester");
      driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]")).sendKeys("Switzerland");
       driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("00000");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("0000000000");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FaxNumber\"]")).sendKeys("00000");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();

        Thread.sleep(1000L);
    }
    @And("^I will do shiping methods$")
    public void I_will_do_shiping_methods_methods() throws InterruptedException {
driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
Thread.sleep(1000L);
    }

    @And("^now i will select my payment method cash or card$")
    public void now_i_will_select_my_payment_method() {
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();

          }


    @And("^I click on continue button$")
    public void I_click_on_continue_button() throws InterruptedException {
        Thread.sleep(1000L);
         driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
    }

    @And("^then I will see payment information$")
    public void then_I_Will_See_Payment_Information() {
        //    // driver.findElement(By.xpath("//*[@id=\"checkout-confirm-order-load\"]/div/div/div/div/div[1]/div[1]/div/strong")).click();
    }
    @And("^now i will confirm my i Order is place susscefuully$")
    public void nowIWillConfirmMyIOrderIsPlaceSusscefuully() throws InterruptedException {
Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();
        System.out.println(driver.getTitle());
    }

}

