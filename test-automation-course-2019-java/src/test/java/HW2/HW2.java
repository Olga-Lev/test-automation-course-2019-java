package HW2;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.*;


import java.util.concurrent.TimeUnit;


public class HW2 {
    private WebDriver driver;



    public static final String FF_DRIVER = "D:\\Projects\\geckodriver.exe";
    public static final String CH_DRIVER = "D:\\Projects\\chromedriver.exe";
    public static final String IE_DRIVER = "D:\\Projects\\IEDriverServer.exe";

    public static final Dimension browserWindowSize = new Dimension(500, 2000);



    public HW2() {
        System.setProperty("webdriver.chrome.driver", HW2.CH_DRIVER);
        System.setProperty("webdriver.gecko.driver", HW2.FF_DRIVER);
        System.setProperty("webdriver.ie.driver", HW2.IE_DRIVER);
    }


    @Before
    public void openBrowser() {


    }

    @After
    public void closeBrowser() {

        driver.quit();
    }

    @Test
    public void chormeTest() {

        driver = new ChromeDriver();
        productProperty();
    }

    @Test
    public void firefoxTest() {

        driver = new FirefoxDriver();
        productProperty();
    }

    @Test
    public void ieTest() {

        driver = new InternetExplorerDriver();
        productProperty();
    }

    public void productProperty() {


        driver.get("http://demo.litecart.net/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(browserWindowSize);


        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("section#box-campaign-products .product-column .info")));


        WebElement mpProductLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("section#box-campaign-products .product-column .info")));;
        WebElement mpRegPriceElem = mpProductLink.findElement(By.cssSelector("div.info .price-wrapper > .regular-price"));
        WebElement mpCampaignPriceElem = mpProductLink.findElement(By.cssSelector("div.info .price-wrapper > .campaign-price"));


        String mpProductText = mpProductLink.findElement(By.cssSelector("div.info > .name")).getText();
        String mpRegPriceValue = mpRegPriceElem.getText();
        String mpRegPriceDecor = mpRegPriceElem.getCssValue("text-decoration");
        String mpRegPriceColor = mpRegPriceElem.getCssValue("color");
        String mpCampaignPriceValue = mpCampaignPriceElem.getText();
        String mpCampaignPriceColor = mpCampaignPriceElem.getCssValue("color");


        System.out.println(String.format("tag: %s; displayed: %s; enabled: %s%n",
                mpProductLink.getTagName(),
                mpProductLink.isDisplayed(),
                mpProductLink.isEnabled()
        ));

        mpProductLink.click();

        String ipText = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#box-product[data-id=\"1\"] h1.title"))).getText();

        WebElement ipRegPriceElem = driver.findElement(By.cssSelector("article#box-product .price-wrapper > .regular-price"));
        WebElement ipCampaignPriceElem = driver.findElement(By.cssSelector("article#box-product .price-wrapper > .campaign-price"));

        String ipRegPriceValue = ipRegPriceElem.getText();
        String ipRegPriceDecor = ipRegPriceElem.getCssValue("text-decoration");
        String ipRegPriceColor = ipRegPriceElem.getCssValue("color");
        String ipCampaignPriceValue = ipCampaignPriceElem.getText();
        String ipCampaignPriceColor = ipCampaignPriceElem.getCssValue("color");


        // Compare name text on both pages
        assertEquals(mpProductText, ipText);

        // Compare prices on both pages
        assertFalse(mpRegPriceValue.isEmpty());

        assertFalse(ipCampaignPriceValue.isEmpty());

        assertEquals(mpRegPriceValue, ipRegPriceValue);

        assertEquals(mpCampaignPriceValue, ipCampaignPriceValue);

        assertTrue(mpRegPriceDecor.contains("line-through"));

        assertTrue(ipRegPriceDecor.contains("line-through"));

        System.out.println(String.format("Regular price colour on Main Page is: %s%nRegular price colour on Item Page is: %s", mpRegPriceColor, ipRegPriceColor));

        System.out.println(String.format("Campaign price colour on Main Page is: %s%nCampaign price colour on Item Page is: %s", mpCampaignPriceColor, ipCampaignPriceColor));
    }
}