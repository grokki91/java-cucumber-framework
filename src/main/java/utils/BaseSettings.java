package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseSettings {
    public static WebDriver driver;
    protected static WebDriverWait wait;
    public final static int TIMEOUT = 10;

    @Before
    public static void init() {
        if (driver == null) {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "eager");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, (Duration.ofSeconds(TIMEOUT)));
        }
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    protected void waitForVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForClickable(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    @After
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
