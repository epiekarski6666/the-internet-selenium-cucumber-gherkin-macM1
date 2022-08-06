package setup;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;

public class Setup {
    public static WebDriver driver;
    public String BASIC_URL = "https://the-internet.herokuapp.com/";

    //@BeforeClass
    public void setup(){
            System.setProperty("webdriver.chrome.driver", "/Users/edwinpiekarski/IdeaProjects/the-internet-cucumber-gherkin/src/main/resources/chromedriver");
            driver = new ChromeDriver();
//            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//            driver = new FirefoxDriver();
//            System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver.exe");
//            driver = new EdgeDriver();
//            System.setProperty("webdriver.opera.driver","src/main/resources/operadriver.exe");
//            driver = new OperaDriver();
//            throw new Exception("This browser is not valid for this test");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get(BASIC_URL);
    }

    //@AfterClass
    public static void closeBrowser() {
        driver.quit();
    }
}
