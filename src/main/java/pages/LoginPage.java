package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver)
    {

        this.driver=driver;
    }
    public void userNamePwd(String uname,String pwd) {
        driver.findElement(By.id("user-name")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(pwd);
    }

    public void clickLogin() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

}
