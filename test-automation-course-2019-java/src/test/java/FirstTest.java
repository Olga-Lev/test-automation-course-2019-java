//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//
//
//public class FirstTest {
//
//    WebDriver driver;
//
//   @Before
//    public void openBrowser()
//   {
//       WebDriverManager.chromedriver().setup();
//       driver = new ChromeDriver();
//   }
//
//   @After
//   public void closeBrowser()
//   {
//       driver.quit();
//   }
//    @Test
//
//   public void firstTest()
//    {
//
//         WebDriver driver = new ChromeDriver();
//
//         driver.get("http://google.com");
//
//    }
//
//
//    @Test
//
//    public void secondTest()
//    {
//
//        driver.get("http://ukr.net");
//
//    }
//
//
//
//}
//
//

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTest {

    WebDriver driver;

    @Before
    public void openBrowser() {

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("unexpectedAlertBehaviour","accept");

        //WebDriverManager.chromedriver().setup();
        ChromeOptions ch =new ChromeOptions();
        ch.addArguments("start-fullscreen");



        driver = new ChromeDriver(ch);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void googleTest() {
        driver.get("http://google.com");
        System.out.println(((HasCapabilities) driver).getCapabilities());
    }

    @Test
    public void ukrNetTest() {
        driver.get("http://ukr.net");

        System.out.println(((HasCapabilities) driver).getCapabilities());


    }


}
