package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    WebDriver driver;

    public WebDriver initializeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\IdeaProjects\\MavenProject\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        return driver;
    }
}
