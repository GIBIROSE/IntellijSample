import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {


   WebDriver driver;


    @Given("Launch the chrome browser")
    public void launchTheChromeBrowser() {
     WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();



    }

    @When("open orange HRM homepage")
    public void openOrangeHRMHomepage() {
     driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("verify the logo presets on the page")
    public void verifyTheLogoPresetsOnThePage() {
     boolean status=driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
     Assert.assertEquals(true,status);
    }

    @And("close the browser")
    public void closeTheBrowser() {
     driver.quit();
    }
}
