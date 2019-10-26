package HW1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class adminPanel {


    WebDriver driver;


    @Before
    public void openBrowser() {

//
        WebDriverManager.chromedriver().setup();
        ChromeOptions ch = new ChromeOptions();

        driver = new ChromeDriver(ch);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    //    @Test
//    public void googleTest() {
//        driver.navigate().to("http://demo.litecart.net/admin/");
//        driver.findElement(By.className("panel-heading"));
//    }
    @Test
    public void untitled() {
        driver.get("http://demo.litecart.net/admin/");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.manage().window().setSize(new Dimension(1590, 857));
        driver.findElement(By.cssSelector(".app:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(2) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(3) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(4) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(5) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.linkText("Delivery Statuses")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(7) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(8) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(9) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.linkText("Countries")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(4) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(5) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(3) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(6) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(7) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(8) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(3) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(4) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(5) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(6) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(9) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(10) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(11) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
//        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.cssSelector(".panel-heading")).click();
//        driver.findElement(By.cssSelector(".panel-heading")).click();
//        driver.findElement(By.cssSelector(".app:nth-child(11) .name")).click();
//        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
//        driver.findElement(By.cssSelector(".panel-heading")).click();
//        driver.findElement(By.cssSelector(".panel-heading")).click();
//        {
//            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
//            assert(elements.size() > 0);
//        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(3) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(12) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(3) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(4) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.linkText("Legal")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(6) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(7) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(8) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(9) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(13) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(14) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.linkText("Tax Classes")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(15) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(1) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(2) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".doc:nth-child(3) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(16) .name")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        driver.findElement(By.cssSelector(".panel-heading")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".app:nth-child(17) .name")).click();
        driver.findElement(By.id("content")).click();
        driver.findElement(By.id("content")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".panel-heading"));
            assert (elements.size() == 0);
        }
    }
}

