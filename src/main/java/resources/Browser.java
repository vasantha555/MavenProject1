package resources;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Browser {
    WebDriver driver;

    public WebDriver initializeBrowser() throws MalformedURLException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\IdeaProjects\\MavenProject\\Drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com");

        MutableCapabilities sauceOptions=new MutableCapabilities();
        sauceOptions.setCapability("name","Vasantha Login Test");
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "latest");
        browserOptions.setCapability("sauce:options", sauceOptions);



        driver = new RemoteWebDriver(new URL("https://oauth-vasantha555-15d75:1bc4cef7-faba-4971-8a32-363d01119162@ondemand.us-west-1.saucelabs.com:443/wd/hub"),browserOptions);
        return driver;
    }
}
