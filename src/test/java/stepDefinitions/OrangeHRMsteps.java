package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;

public class OrangeHRMsteps {

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertTrue(status);
        driver.quit();
        Thread.sleep(2000L);


    }

    @Then("I go to another browser")
    public void i_go_to_another_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");// summon  browser
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        driver.findElement(By.cssSelector("a[title*= 'Sign in']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("lightyear9461@gmail.com");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("jaadi1234");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
        Thread.sleep(2000L);
        System.out.println(driver.getTitle());
        driver.close();


    }
}






