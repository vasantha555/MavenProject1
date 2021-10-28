package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import resources.Browser;

import static java.lang.System.*;

public class LoginStepDefinition extends Browser {

    WebDriver driver;


    @Given("Navigate to url")
    public void OpeningUrl()
    {
        driver=initializeBrowser();

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
