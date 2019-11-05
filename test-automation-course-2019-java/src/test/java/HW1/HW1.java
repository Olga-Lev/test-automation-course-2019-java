package HW1;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HW1 {

    private WebDriver driver;

    public static final Dimension browserWindowSize = new Dimension(1280, 900);


    public static final String PATH_CHROME_DRIVER = "D:\\Projects\\chromedriver.exe";


    public HW1() {
        System.setProperty("webdriver.chrome.driver", HW2.ProductProperty.PATH_CHROME_DRIVER);

    }

        @BeforeClass
        public static void setupClass() {

        }

        @Before
        public void setup(){
            driver = new ChromeDriver();
            driver.get("http://demo.litecart.net/admin/");
            driver.findElement(By.cssSelector("button[name=login]")).click();
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img.center-block.img-responsive")));

        }

        @After
        public void quit(){
            driver.quit();
        }

        @Test
        public void Test() {



            String selectorApps = "#box-apps-menu > li.app";
            String selectorDocs = "ul.docs > li.doc";

            for (int i = 0; i < driver.findElements(By.cssSelector(selectorApps)).size(); i++) {
                List<WebElement> apps = driver.findElements(By.cssSelector(selectorApps));
                apps.get(i).click();
                Assert.assertTrue(areElementsPresent(driver, By.cssSelector("div.panel-heading")));
                for (int j = 0; j < driver.findElements(By.cssSelector(selectorDocs)).size(); j++) {
                    List<WebElement> docs = driver.findElements(By.cssSelector(selectorDocs));
                    docs.get(j).click();
                    Assert.assertTrue(areElementsPresent(driver, By.cssSelector("div.panel-heading")));
                }
            }
        }

        private boolean areElementsPresent(WebDriver driver, By locator){
            return driver.findElements(locator).size() > 0;
        }

    }





