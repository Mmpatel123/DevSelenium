package NopcommernceProperFeature;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class NopCommerncepropersteps {
    public WebDriver driver=null;


    @Given("^User will go to browsers$")
    public void open_the_browsers() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
}

    @And("^User Enter the Web URL \"([^\"]*)\"$")
    public void enter_the_URLS(String WEBURL) throws Throwable {
        driver.get(WEBURL);
    }
    @And("^User will click on the sign in button$")
    public void Accept_all_cookies() throws Throwable {
        Thread.sleep(1000L);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

    }
    @When("^User will and my registered username and password$")
    public void enter_registered_username_and_passwords(DataTable credentials) throws Throwable {
        List<Map<String,String>> data=credentials.asMaps(String.class,String.class);
        Thread.sleep(1000L);
        driver.findElement(By.id("Email")).sendKeys(data.get(0).get("user"));
        Thread.sleep(1000L);
        driver.findElement(By.id("Password")).sendKeys(data.get(0).get("password"));
    }
    @And("^User will click on the log in button$")
    public void click_on_login_buttons() throws Throwable {
        Thread.sleep(1000L);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
    @And("^now User will go to the electronics page$")
    public void i_cell_click_on_my_browser() throws InterruptedException {
        Thread.sleep(1000L);
        driver.findElement(By.linkText("Electronics")).click();

    }

    @And("^User will click on the cell phone page$")
    public void i_cell_click_on_my_phone() throws Throwable {
        Thread.sleep(1000L);
        driver.findElement(By.linkText("Cell phones")).click();

    }
    @And("^User will pick a phone of his choice$")
    public void i_WILL_click_on_my_phone() throws Throwable {
        Thread.sleep(1000L);

        driver.findElement(By.linkText("HTC One Mini Blue")).click();
}
    @Then("^User will agree to the terms and conditions$")
    public void i_will_pick_a_choice_of_my_desired_phone() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(B)
        Thread.sleep(1000L);
        driver.findElement(By.id("add-to-cart-button-19")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.id("termsofservice")).click();
    }

    @And("^now user will click on the phone and go to checkout$")
    public void i_lcell_click_on_my_phone() throws Throwable {
        Thread.sleep(1000L);
        driver.findElement(By.id("checkout")).click();
    }
    @And("^now the user will you same address or make a new address$")
    public void i_lcell_click_on_mys_phone() throws Throwable {
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]"));



        WebElement staticDropdown =driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]"));
        Select dropdown=new Select(staticDropdown);
        dropdown.selectByVisibleText("New Address");
    }
    @And("^user will enter the billing address$")
    public void i_lcell_nclick_on_mys_phone() throws Throwable {
        Thread.sleep(1000L);
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



    }
    @And("^user will click on continue$")
    public void I_will_do_shiping_methods_methods() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        Thread.sleep(1000L);}
    @And("^user will select the Shiping methods$")
    public void I_will_do_shiping_methods_methodss() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
        Thread.sleep(1000L);}
    @And("^user will select the payment method$")
    public void now_i_will_select_my_payment_method() {
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();

    }
    @And("^user will see payment information$")
    public void then_I_Will_See_Payment_Information() throws InterruptedException {
        //    // driver.findElement(By.xpath("//*[@id=\"checkout-confirm-order-load\"]/div/div/div/div/div[1]/div[1]/div/strong")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
    }

    @And("^user will confirm the Order$")
    public void nowIWillConfirmMyIOrderIsPlaceSusscefuully() throws InterruptedException {
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();
        System.out.println(driver.getTitle());}
    @Then("^i will close the window$")
    public void nowIsWillConfirmMyIOrderIsPlaceSusscefuully() throws InterruptedException {
        driver.close();}
    }



