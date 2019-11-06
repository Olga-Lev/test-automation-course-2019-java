package HW2;

//import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProductProperty {

    private WebDriver driver;

    public static final Dimension browserWindowSize = new Dimension(1280, 900);


    public static final String PATH_CHROME_DRIVER = "D:\\Projects\\chromedriver.exe";


    public ProductProperty() {
        System.setProperty("webdriver.chrome.driver", ProductProperty.PATH_CHROME_DRIVER);

    }

    @Before
    public void testSetup() {
       // ChromeDriverManager.getInstance().setup();



        driver = new ChromeDriver();
        driver.get("http://demo.litecart.net/admin/");
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @After
    public void testCleanup(){
        driver.quit();
    }

    @Test
    public void clickMenuCheckHeader(){
        List<WebElement> menuItems = driver.findElements(By.id("app-"));

        for (int i=0; i<menuItems.size(); i++){
            WebElement menu = driver.findElements(By.id("app-")).get(i);
            String menuText = menu.getText();
            menu.click();
            Assert.assertTrue("Header for Menu item" + menuText + "is not displayed", driver.findElement(By.cssSelector("h1")).isDisplayed());

            List<WebElement> subMenuItems = driver.findElements(By.cssSelector(".docs li"));
            for (int j=0; j<subMenuItems.size(); j++) {
                WebElement subMenu = driver.findElements(By.cssSelector(".docs li")).get(j);
                String subMenuText = subMenu.getText();
                subMenu.click();
                Assert.assertTrue("Header for SubMenu item" + subMenuText + "is not displayed", driver.findElement(By.cssSelector("h1")).isDisplayed());
            }
        }
    }


}