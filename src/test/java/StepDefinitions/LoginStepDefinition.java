package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.LoginPage;
import resources.Browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.*;

public class LoginStepDefinition extends Browser {

    WebDriver driver;

    {
        driver = initializeBrowser();
    }

    public LoginStepDefinition() throws MalformedURLException {
    }
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\IdeaProjects\\MavenProject\\Drivers\\chromedriver.exe");
//        driver = new ChromeDriver();


    @Given("Navigate to url")
    public void OpeningUrl() throws MalformedURLException {

        driver.get("https://www.saucedemo.com");

    }

    @When("Enter valid {string} and {string}")
    public void enteringValues(String uname,String pwd) {
        LoginPage lp=new LoginPage(driver);
        lp.userNamePwd(uname,pwd);
        lp.clickLogin();

    }

    @And("Click on Login")
    public void clickLoginButton() {
//        WebElement loginButton=driver.findElement(By.id("login-button"));
//        loginButton.click();
    }

    @Then("Open Login Page")
    public void open_login_page() {
        System.out.println("Coming here");
        driver.close();
    }

}
