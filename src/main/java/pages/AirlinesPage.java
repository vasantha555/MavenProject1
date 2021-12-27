package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class AirlinesPage
{

    public static void main(String[] args) throws Exception
    {
        ;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\IdeaProjects\\MavenProject\\Drivers1\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegiantair.com/");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@alt='closeIcon']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Departure, airport')]")).click();
        WebElement n = driver.findElement(By.xpath("//div[contains(text(),'Allentown')]"));
        Point p = n.getLocation();
        int X = p.getX();
        int Y = p.getY();
        //scroll with Javascript Executor
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(" + X + ", " + Y + ");");
        n.click();



        driver.findElement(By.xpath("//div[contains(text(),'Destination, airport')]")).click();
        WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'Myrtle')]"));
        ele.click();


        //driver.findElement(By.xpath("(//*[local-name()='svg' and @xmlns='http://www.w3.org/2000/svg'])[1]")).click();
driver.findElement(By.xpath("(//button[@class='DatePicker__DateFieldControl-iz35q0-0 gecfVU'])[1]")).click();


        //Click departure date button
       // driver.findElement(By.xpath("//input[@id='departure_date']/following::button[1]")).click();
        //Click return date button
      // driver.findElement(By.xpath("//input[@id='return_date']/following::button[1]")).click();

        Thread.sleep(1000);

//        }

    }

}